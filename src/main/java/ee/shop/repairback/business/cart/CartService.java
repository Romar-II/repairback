package ee.shop.repairback.business.cart;

import ee.shop.repairback.business.Status;
import ee.shop.repairback.business.cart.dto.OrderInfo;
import ee.shop.repairback.business.cart.dto.ProductWithQuantityInfo;
import ee.shop.repairback.domain.order.Order;
import ee.shop.repairback.domain.order.OrderMapper;
import ee.shop.repairback.domain.order.OrderRepository;
import ee.shop.repairback.domain.orderitem.OrderItem;
import ee.shop.repairback.domain.orderitem.OrderItemMapper;
import ee.shop.repairback.domain.orderitem.OrderItemRepository;
import ee.shop.repairback.domain.product.Product;
import ee.shop.repairback.domain.product.ProductMapper;
import ee.shop.repairback.domain.product.ProductRepository;
import ee.shop.repairback.domain.product.ProductWithQtyMapper;
import ee.shop.repairback.domain.repairitem.RepairItem;
import ee.shop.repairback.domain.repairitem.RepairItemMapper;
import ee.shop.repairback.domain.repairitem.RepairItemRepository;
import ee.shop.repairback.domain.user.User;
import ee.shop.repairback.domain.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor


public class CartService {

    private final OrderItemRepository orderItemRepository;
    private final OrderItemMapper orderItemMapper;
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final ProductWithQtyMapper productWithQtyMapper;
    private final RepairItemMapper repairItemMapper;
    private final RepairItemRepository repairItemRepository;
    private final OrderMapper orderMapper;


    public void addOrderItemToCart(Integer userId, Integer productId) {
        User user = userRepository.getReferenceById(userId);
        Product product = productRepository.getReferenceById(productId);
        Order order;
        if (orderRepository.openOrderExists(user.getId())) {
            order = orderRepository.findPendingOrderBy(userId);
        } else {
            order = new Order();
            order.setUser(user);
            order.setStatus("P");
            orderRepository.save(order);
        }
        OrderItem orderItem = new OrderItem();

        orderItem.setOrder(order);
        orderItem.setProduct(product);
        orderItemRepository.save(orderItem);
    }


    public Integer updateCartQty(Integer userId) {
        Order order = orderRepository.findPendingOrderBy(userId);
        if (order == null) {
            return 0;
        }
        List<OrderItem> orderinfo = orderItemRepository.findOrderItemBy(order.getId());
        Integer itemCount = orderinfo.size();

        return itemCount;
    }

    public List<ProductWithQuantityInfo> getCartItems(Integer userId) {
        Order order = orderRepository.findPendingOrderBy(userId);
        if (order == null) {
            return new ArrayList<>();
        }
        List<OrderItem> orderItems = orderItemRepository.findOrderItemBy(order.getId());

        return fillDtoWithInfo(orderItems);
    }

    public List<OrderInfo> getOrderHistoryItems(Integer userId) {
        List<Order> orders = orderRepository.findActiveOrdersBy(userId);
        List<OrderInfo> activeOrders = orderMapper.toOrderInfos(orders);
        for (OrderInfo activeOrder : activeOrders) {
            List<OrderItem> orderItems= orderItemRepository.findOrderItemBy(activeOrder.getOrderId());
            List<ProductWithQuantityInfo> productWithQuantityInfos = fillDtoWithInfo(orderItems);
        }
        return activeOrders;
    }

    private static List<ProductWithQuantityInfo> fillDtoWithInfo(List<OrderItem> orderItems) {
        List<ProductWithQuantityInfo> productWithQuantityInfos = new ArrayList<>();
        for (OrderItem orderItem : orderItems) {
            Product product = orderItem.getProduct();
            RepairItem repairItem = orderItem.getRepairItem();
            boolean notOnTheList = true;
            for (ProductWithQuantityInfo existingProduct : productWithQuantityInfos) {
                if (product != null && Objects.equals(existingProduct.getProductId(), product.getId())) {
                    existingProduct.setQty(existingProduct.getQty() + 1);
                    notOnTheList = false;
                } else if (repairItem != null && Objects.equals(existingProduct.getRepairItemId(), repairItem.getId())) {
                    existingProduct.setQty(existingProduct.getQty() + 1);
                    notOnTheList = false;
                }
            }
            if (repairItem == null && notOnTheList) {
                fillDtoWithRepairItem(product, productWithQuantityInfos);
            }
            if (product == null && notOnTheList) {
                fillDtoWithProduct(repairItem, productWithQuantityInfos);
            }
        }
        return productWithQuantityInfos;
    }

    private static void fillDtoWithProduct(RepairItem repairItem, List<ProductWithQuantityInfo> productWithQuantityInfos) {
        ProductWithQuantityInfo productWithQuantityInfo = new ProductWithQuantityInfo();
        productWithQuantityInfo.setProductId(0);
        productWithQuantityInfo.setRepairItemId(repairItem.getId());
        productWithQuantityInfo.setProductName(repairItem.getName());
        productWithQuantityInfo.setProductPrice(repairItem.getPrice());
        productWithQuantityInfo.setQty(1);
        productWithQuantityInfos.add(productWithQuantityInfo);
    }

    private static void fillDtoWithRepairItem(Product product, List<ProductWithQuantityInfo> productWithQuantityInfos) {
        ProductWithQuantityInfo productWithQuantityInfo = new ProductWithQuantityInfo();
        productWithQuantityInfo.setProductId(product.getId());
        productWithQuantityInfo.setRepairItemId(0);
        productWithQuantityInfo.setProductName(product.getName());
        productWithQuantityInfo.setProductPrice(product.getPrice());
        productWithQuantityInfo.setQty(1);
        productWithQuantityInfos.add(productWithQuantityInfo);
    }

    public void addRepairOrderItemToCart(Integer userId, Integer repairItemId) {
        User user = userRepository.getReferenceById(userId);
        RepairItem repairItem = repairItemRepository.getReferenceById(repairItemId);
        Order order;
        if (orderRepository.openOrderExists(user.getId())) {
            order = orderRepository.findPendingOrderBy(userId);
        } else {
            order = new Order();
            order.setUser(user);
            order.setStatus("P");
            orderRepository.save(order);
        }
        OrderItem orderItem = new OrderItem();

        orderItem.setOrder(order);
        orderItem.setRepairItem(repairItem);
        orderItemRepository.save(orderItem);
    }

    public void completePendingOrder(Integer userId) {
        Order order = orderRepository.findPendingOrderBy(userId);
        order.setStatus(Status.ACTIVE);
        orderRepository.save(order);

    }

    public void deletePendingOrder(Integer userId) {
        Order order = orderRepository.findPendingOrderBy(userId);
        order.setStatus(Status.DEACTIVATED);
        orderRepository.save(order);

    }

    public void addItemQtyInCart(Integer userId, Integer productId, Integer repairItemId) {
        if (productId == 0) {
            this.addRepairOrderItemToCart(userId, repairItemId);
        } else {
            this.addOrderItemToCart(userId, productId);
        }
    }

    public void substractItemQtyFromCart(Integer userId, Integer productId, Integer repairItemId) {
        Order order = orderRepository.findPendingOrderBy(userId);
        if (repairItemId == 0) {
            Product product = productRepository.getReferenceById(productId);
            OrderItem orderItem = orderItemRepository.findFirstByProduct(product);
            orderItemRepository.deleteById(orderItem.getId());
        } else {
            RepairItem repairItem = repairItemRepository.getReferenceById(repairItemId);
            OrderItem orderItem = orderItemRepository.findFirstByRepairItem(repairItem);
            orderItemRepository.deleteById(orderItem.getId());
        }
    }


}
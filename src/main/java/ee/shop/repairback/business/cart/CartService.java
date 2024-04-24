package ee.shop.repairback.business.cart;

import ee.shop.repairback.business.cart.dto.OrderItemRequest;
import ee.shop.repairback.business.cart.dto.ProductWithQuantityInfo;
import ee.shop.repairback.domain.order.Order;
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
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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

    public void addOrderItemToCart(OrderItemRequest orderItemRequest) {
        OrderItem orderItem = new OrderItem();
//        orderItem.set


//        OrderItem orderItem = createOrderItem(orderItemRequest);
        orderItemRepository.save(orderItem);
    }

//    private OrderItem createOrderItem(OrderItemRequest orderItemRequest) {
//        OrderItem orderItem = orderItemMapper.toOrderItem(orderItemRequest);
//        return orderItem;
//    }

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

        List<OrderItem> orderinfo = orderItemRepository.findOrderItemBy(order.getId());
        Integer itemCount = orderinfo.size();

        return itemCount;
    }

    public List<ProductWithQuantityInfo> getCartItems(Integer userId) {
        Order order = orderRepository.findPendingOrderBy(userId);
        List<OrderItem> orderItems = orderItemRepository.findOrderItemBy(order.getId());
        List<ProductWithQuantityInfo> productWithQuantityInfos = new ArrayList<>();
        for (OrderItem orderItem : orderItems) {
            if(orderItem.getRepairItem()!=null){
                break;
            }
            Product product = orderItem.getProduct();
            boolean notOnTheList = true;
            for (ProductWithQuantityInfo existingProduct : productWithQuantityInfos) {
                int existinginListProduct= existingProduct.getProductId();
                int productImtryingToAdd= product.getId();
                if (Objects.equals(existingProduct.getProductId(), product.getId())) {
                    existingProduct.setQty(existingProduct.getQty() + 1);
                    notOnTheList = false;
                }
            }
            if (notOnTheList) {
                ProductWithQuantityInfo productWithQuantityInfo = new ProductWithQuantityInfo();
                productWithQuantityInfo.setProductId(product.getId());
                productWithQuantityInfo.setProductName(product.getName());
                productWithQuantityInfo.setProductPrice(product.getPrice());
                productWithQuantityInfo.setQty(1);
                productWithQuantityInfos.add(productWithQuantityInfo);
            }
        }
        return productWithQuantityInfos;
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
}
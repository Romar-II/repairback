package ee.shop.repairback.business.cart;

import ee.shop.repairback.business.cart.dto.OrderInfo;
import ee.shop.repairback.business.cart.dto.OrderItemRequest;
import ee.shop.repairback.domain.order.Order;
import ee.shop.repairback.domain.order.OrderRepository;
import ee.shop.repairback.domain.orderitem.OrderItem;
import ee.shop.repairback.domain.orderitem.OrderItemMapper;
import ee.shop.repairback.domain.orderitem.OrderItemRepository;
import ee.shop.repairback.domain.product.Product;
import ee.shop.repairback.domain.product.ProductRepository;
import ee.shop.repairback.domain.user.User;
import ee.shop.repairback.domain.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor


public class CartService {

    private final OrderItemRepository orderItemRepository;
    private final OrderItemMapper orderItemMapper;
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

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
        if(orderRepository.openOrderExists(user.getId())){
            order = orderRepository.findPendingOrderBy(userId);
        } else {
            order = new Order();
            order.setUser(user);
            order.setStatus("P");
            orderRepository.save(order);
        }
        OrderItem orderItem=new OrderItem();

        orderItem.setOrder(order);
        orderItem.setProduct(product);
        orderItemRepository.save(orderItem);
    }

    public Integer updateCartQty(Integer userId) {
        Order order = orderRepository.findPendingOrderBy(userId);

        List<OrderItem> orderinfo = orderItemRepository.findOrderItemBy(order.getId());
        Integer itemCount= orderinfo.size();

        return itemCount;
    }
}
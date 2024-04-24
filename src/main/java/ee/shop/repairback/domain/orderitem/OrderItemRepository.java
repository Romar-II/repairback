package ee.shop.repairback.domain.orderitem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

    @Query("select o from OrderItem o where o.order.id = ?1")
    List<OrderItem> findOrderItemBy(Integer orderId);
      @Query("select Product from OrderItem o where o.order.id = ?1")
    List<OrderItem> findProductIdBY(Integer orderId);


}
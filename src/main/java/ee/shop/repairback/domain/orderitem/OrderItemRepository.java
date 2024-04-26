package ee.shop.repairback.domain.orderitem;

import ee.shop.repairback.domain.order.Order;
import ee.shop.repairback.domain.product.Product;
import ee.shop.repairback.domain.repairitem.RepairItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

    @Query("select o from OrderItem o where o.order.id = ?1")
    List<OrderItem> findOrderItemBy(Integer orderId);
      @Query("select Product from OrderItem o where o.order.id = ?1")
    List<OrderItem> findProductIdBY(Integer orderId);

    @Transactional
    @Modifying
    @Query("delete from OrderItem o where o.order.id = ?1 and (o.product.id = ?2 or o.repairItem.id = ?3)")
    int deleteOrderItemBy(Order order, Product product, RepairItem repairItem);

}
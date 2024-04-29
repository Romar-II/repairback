package ee.shop.repairback.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {




    @Query("select o from Order o where o.user.id = ?1 and o.status = ('P')")
    Order findPendingOrderBy(Integer userId);

    @Query("select (count(o) > 0) from Order o where o.user.id = ?1 and o.status = 'P'")
    boolean openOrderExists(Integer id);

    @Query("select o from Order o where o.user.id = ?1 and o.status = 'A'")
    List<Order> findActiveOrdersBy(Integer id);

}

package ee.shop.repairback.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Integer> {




    @Query("select o from Order o where o.user.id = ?1 and o.status = ('P')")
    Order findOrderBy(Integer userId);

    @Query("select (count(o) > 0) from Order o where o.user.id = ?1 and o.status = 'P'")
    boolean openOrderExists(Integer id);
}

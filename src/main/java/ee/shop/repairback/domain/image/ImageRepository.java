package ee.shop.repairback.domain.image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Integer> {

    @Query("select i from Image i where i.product.id = ?1")
    Image findByProduct_Id(Integer id);
}
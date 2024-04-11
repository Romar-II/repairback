package ee.shop.repairback.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Integer> {


    @Query("select m from Model m where m.brand.id = ?1 order by m.name")
    List<Model> findByBrandId (Integer brandId);
}
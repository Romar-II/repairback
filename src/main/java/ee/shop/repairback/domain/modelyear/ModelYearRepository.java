package ee.shop.repairback.domain.modelyear;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModelYearRepository extends JpaRepository<ModelYear, Integer> {
    @Query("select m from ModelYear m where m.model.id = ?1")
    List<ModelYear> findModelYearsBy(Integer modelId);
}
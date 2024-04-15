package ee.shop.repairback.domain.repairitem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepairItemRepository extends JpaRepository<RepairItem, Integer> {

    @Query("select r from RepairItem r where r.repairSubCategory.id = ?1")
    List<RepairItem> findRepairItemsBy(Integer repairSubCategoryId);
}
package ee.shop.repairback.domain.repairsubcategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepairSubCategoryRepository extends JpaRepository<RepairSubCategory, Integer> {


    @Query("select r from RepairSubCategory r where r.repairMainCategory.id = ?1 order by r.name DESC")
    List<RepairSubCategory> findRepairSubCategoriesBy (Integer repairMainCategoryId);
}
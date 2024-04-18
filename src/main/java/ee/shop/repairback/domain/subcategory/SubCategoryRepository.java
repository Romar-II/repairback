package ee.shop.repairback.domain.subcategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {

    @Query("select s from SubCategory s where s.category.id = ?1")
    List<SubCategory> findSubCategoryBy(Integer categoryId);
}
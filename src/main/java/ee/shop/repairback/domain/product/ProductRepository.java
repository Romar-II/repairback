package ee.shop.repairback.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("select p from Product p where p.subCategory.id = ?1")
    List<Product> findProductsBy(Integer subCategoryId);

    @Query("select p from Product p where p.category.id = ?1")
    List<Product> findProductsByCategoryId(Integer categoryId);

}
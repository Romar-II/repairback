package ee.shop.repairback.business.product;


import ee.shop.repairback.business.product.dto.ProductInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class ProductController {

    private ProductService productService;

    @GetMapping("/products")
    public List<ProductInfo> getProducts(@RequestParam Integer categoryId, @RequestParam Integer subCategoryId) {
        return productService.getProducts(categoryId, subCategoryId);
    }

}

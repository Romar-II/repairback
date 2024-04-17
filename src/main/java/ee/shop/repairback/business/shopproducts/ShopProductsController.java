package ee.shop.repairback.business.shopproducts;


import ee.shop.repairback.business.shopproducts.dto.ProductInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class ShopProductsController {

    private ShopProductsService shopProductsService;

@GetMapping("/shop/categories")
    public List<ProductInfo> getProducts(@RequestParam Integer categoryId, @RequestParam Integer subCategory){
    List<ProductInfo> products = shopProductsService.getProducts(categoryId, subCategory);
    return products;
}

}

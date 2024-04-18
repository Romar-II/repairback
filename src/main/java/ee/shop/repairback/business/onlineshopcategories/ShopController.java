package ee.shop.repairback.business.onlineshopcategories;

import ee.shop.repairback.business.onlineshopcategories.dto.CategoryWithSubCategoryInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ShopController {

    private ShopCategoriesService shopCategoriesService;

    @GetMapping("/shop/categories")
    public List<CategoryWithSubCategoryInfo> getCategoryInfo(){
        return shopCategoriesService.getCategoryInfos();
    }

}

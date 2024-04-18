package ee.shop.repairback.business.category;

import ee.shop.repairback.business.category.dto.CategoryInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<CategoryInfo> getCategoryInfos(){
        return categoryService.getCategoryInfos();
    }

}

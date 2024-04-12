package ee.shop.repairback.business.repairmaincategory;

import ee.shop.repairback.business.repairmaincategory.dto.RepairMainCategoryInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class RepairMainCategoryController {
    private RepairMainCategoryService repairMainCategoryService;
    @GetMapping("/repair/maincategories")


    public List<RepairMainCategoryInfo> getRepairMainCategory(){
        return repairMainCategoryService.getRepairMainCategories();
    }

}

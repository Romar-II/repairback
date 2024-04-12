package ee.shop.repairback.business.repairsubcategory;

import ee.shop.repairback.business.repairsubcategory.dto.RepairSubCategoryInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@AllArgsConstructor

public class RepairSubCategoryController {

    private final RepairSubCategoryService repairSubCategoryService;

    @GetMapping("/repair/subcategories/{selectedRepairMainCategoryId}")

    public List<RepairSubCategoryInfo> getSubCategoryService(@PathVariable Integer selectedRepairMainCategoryId) {
        List<RepairSubCategoryInfo> repairSubCategoryInfos = repairSubCategoryService.getSubCategories(selectedRepairMainCategoryId);
        return repairSubCategoryInfos;

    }


}

package ee.shop.repairback.business.repairitemcategory;

import ee.shop.repairback.business.repairitemcategory.dto.RepairItemInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class RepairItemCategoryController {

    private final RepairItemCategoryService repairItemCategoryService;



    @GetMapping("/repair/itemcategories/{selectedRepairSubCategoryId}")

    public List<RepairItemInfo> getRepairItemCategoryService(@PathVariable Integer selectedRepairSubCategoryId) {
       List<RepairItemInfo> repairItemInfos = repairItemCategoryService.getItemCategories(selectedRepairSubCategoryId);
       return repairItemInfos;

    }



}

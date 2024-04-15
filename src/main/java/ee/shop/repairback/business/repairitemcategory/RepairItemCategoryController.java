package ee.shop.repairback.business.repairitemcategory;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class RepairItemCategoryController {

    private final RepairItemCategoryService repairItemCategoryService;




    GetMapping("/repair/itemcategories/{selectedRepairSubCategoryId}")

   public  getRepairItemCategoryService(@PathVariable Integer selectedRepairSubCategoryId) {
       repairItemCategoryService.getItemCategories(selectedRepairSubCategoryId);
       return;

    }



}

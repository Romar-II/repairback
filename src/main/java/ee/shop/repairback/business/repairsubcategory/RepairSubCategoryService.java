package ee.shop.repairback.business.repairsubcategory;

import ee.shop.repairback.business.repairsubcategory.dto.RepairSubCategoryInfo;
import ee.shop.repairback.domain.repairsubcategory.RepairSubCategory;
import ee.shop.repairback.domain.repairsubcategory.RepairSubCategoryMapper;
import ee.shop.repairback.domain.repairsubcategory.RepairSubCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class RepairSubCategoryService {

    private final RepairSubCategoryRepository repairSubCategoryRepository;
    private final RepairSubCategoryMapper repairSubCategoryMapper;


    public List<RepairSubCategoryInfo> getSubCategories(Integer selectedRepairMainCategoryId) {
        List<RepairSubCategory> repairSubCategories = repairSubCategoryRepository.findRepairSubCategoriesBy(selectedRepairMainCategoryId);
        List<RepairSubCategoryInfo> repairSubCategoryInfos = repairSubCategoryMapper.toRepairSubCategoryInfos(repairSubCategories);
        return repairSubCategoryInfos;


    }
}

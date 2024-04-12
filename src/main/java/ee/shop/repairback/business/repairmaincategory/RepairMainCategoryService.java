package ee.shop.repairback.business.repairmaincategory;

import ee.shop.repairback.business.repairmaincategory.dto.RepairMainCategoryInfo;
import ee.shop.repairback.domain.repairmaincategory.RepairMainCategory;
import ee.shop.repairback.domain.repairmaincategory.RepairMainCategoryMapper;
import ee.shop.repairback.domain.repairmaincategory.RepairMainCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class RepairMainCategoryService {

    private final RepairMainCategoryRepository repairMainCategoryRepository;
    private final RepairMainCategoryMapper repairMainCategoryMapper;

    public List<RepairMainCategoryInfo> getRepairMainCategories() {
        List<RepairMainCategory> repairMainCategories = repairMainCategoryRepository.findAll();
        return repairMainCategoryMapper.toRepairMainCategoryInfos(repairMainCategories);

    }



}

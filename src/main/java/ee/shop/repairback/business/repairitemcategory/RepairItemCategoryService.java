package ee.shop.repairback.business.repairitemcategory;

import ee.shop.repairback.business.repairitemcategory.dto.RepairItemInfo;
import ee.shop.repairback.domain.repairitem.RepairItem;
import ee.shop.repairback.domain.repairitem.RepairItemMapper;
import ee.shop.repairback.domain.repairitem.RepairItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RepairItemCategoryService {

    private final RepairItemMapper repairItemMapper;
    private final RepairItemRepository repairItemRepository;

    public List<RepairItemInfo> getItemCategories(Integer selectedRepairSubCategoryId) {
        List<RepairItem> repairItems = repairItemRepository.findRepairItemsBy(selectedRepairSubCategoryId);
        List <RepairItemInfo> repairItemInfos = repairItemMapper.toRepairItemInfos(repairItems);

        return repairItemInfos;
    }


}

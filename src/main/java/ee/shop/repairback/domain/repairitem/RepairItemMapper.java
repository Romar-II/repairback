package ee.shop.repairback.domain.repairitem;

import ee.shop.repairback.business.repairitemcategory.dto.RepairItemInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RepairItemMapper {

    @Mapping(source = "id", target = "repairItemId")
    @Mapping(source = "name", target = "repairItemCategoryName")
   // @Mapping(source = "price", target = "price")  PS! hiljem kasutame

    RepairItemInfo toRepairItemInfo (RepairItem repairItem);
    List<RepairItemInfo> toRepairItemInfos (List<RepairItem> repairItem);

}
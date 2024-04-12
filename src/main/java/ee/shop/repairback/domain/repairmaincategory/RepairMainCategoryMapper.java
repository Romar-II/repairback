package ee.shop.repairback.domain.repairmaincategory;

import ee.shop.repairback.business.repairmaincategory.dto.RepairMainCategoryInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RepairMainCategoryMapper {

    @Mapping(source = "id", target = "repairMainCategoryId")
    @Mapping(source = "name", target = "repairMainCategoryName")
    RepairMainCategoryInfo toRepairMainCategoryInfo(RepairMainCategory repairMainCategory);
List<RepairMainCategoryInfo> toRepairMainCategoryInfos(List<RepairMainCategory> repairMainCategories);

 }
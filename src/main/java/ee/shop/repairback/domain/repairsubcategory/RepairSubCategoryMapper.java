package ee.shop.repairback.domain.repairsubcategory;

import ee.shop.repairback.business.repairsubcategory.dto.RepairSubCategoryInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RepairSubCategoryMapper {

    @Mapping(source = "id", target = "repairSubCategoryId")
    @Mapping(source = "name", target = "repairSubCategoryName")

    RepairSubCategoryInfo toRepairSubCategoryInfo(RepairSubCategory repairSubCategory);
    List<RepairSubCategoryInfo> toRepairSubCategoryInfos(List <RepairSubCategory> repairSubCategory);

}
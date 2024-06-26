package ee.shop.repairback.domain.subcategory;

import ee.shop.repairback.business.category.dto.SubCategoryInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SubCategoryMapper {

    @Mapping(source = "id",target = "subCategoryId")
    @Mapping(source = "name",target = "subCategoryName")

    SubCategoryInfo toSubcategoryInfo(SubCategory subCategory);
    List<SubCategoryInfo>  toSubCategoryInfos(List<SubCategory>  subCategory);

}
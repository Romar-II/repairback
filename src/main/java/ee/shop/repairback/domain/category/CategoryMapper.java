package ee.shop.repairback.domain.category;

import ee.shop.repairback.business.category.dto.CategoryInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {

    @Mapping(source = "id",target = "categoryId")
    @Mapping(source = "name",target = "categoryName")
    CategoryInfo toCategoryInfo(Category category);
    List<CategoryInfo> toCategoryInfos(List<Category> category);


}
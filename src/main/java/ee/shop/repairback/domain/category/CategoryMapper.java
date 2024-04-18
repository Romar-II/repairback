package ee.shop.repairback.domain.category;

import ee.shop.repairback.business.onlineshopcategories.dto.CategoryWithSubCategoryInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {

    @Mapping(source = "id",target = "categoryId")
    @Mapping(source = "name",target = "categoryName")
    CategoryWithSubCategoryInfo toCategory(Category category);
    List<CategoryWithSubCategoryInfo> toCategoryInfos(List<Category> category);


}
package ee.shop.repairback.business.onlineshopcategories.dto;

import ee.shop.repairback.domain.category.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link Category}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryWithSubCategoryInfo implements Serializable {
    private Integer categoryId;
    private String categoryName;
    private List<SubCategoryInfo> subCategoryInfoList;
}
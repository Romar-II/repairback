package ee.shop.repairback.business.category.dto;

import ee.shop.repairback.domain.category.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link Category}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryInfo implements Serializable {
    private Integer categoryId;
    private String categoryName;
    private List<SubCategoryInfo> subCategories;
}
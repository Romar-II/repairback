package ee.shop.repairback.business.onlineshopcategories.dto;

import ee.shop.repairback.domain.subcategory.SubCategory;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link SubCategory}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryInfo implements Serializable {
    Integer subCategoryId;
    Integer categoryId;
    @NotNull
    @Size(max = 255)
    String subCategoryName;
}
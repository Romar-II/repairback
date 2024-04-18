package ee.shop.repairback.business.category.dto;

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
    private Integer subCategoryId;
    @NotNull
    @Size(max = 255)
    private String subCategoryName;
}
package ee.shop.repairback.business.repairsubcategory.dto;

import ee.shop.repairback.domain.repairsubcategory.RepairSubCategory;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link RepairSubCategory}
 */
@Data
@AllArgsConstructor
public class RepairSubCategoryInfo implements Serializable {
    Integer repairSubCategoryId;
    @NotNull
    @Size(max = 255)
    String repairSubCategoryName;
}
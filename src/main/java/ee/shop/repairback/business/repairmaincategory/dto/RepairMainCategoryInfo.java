package ee.shop.repairback.business.repairmaincategory.dto;

import ee.shop.repairback.domain.repairmaincategory.RepairMainCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link RepairMainCategory}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RepairMainCategoryInfo implements Serializable {
    Integer repairMainCategoryId;
    String repairMainCategoryName;
}
package ee.shop.repairback.business.repairitemcategory.dto;

import ee.shop.repairback.domain.repairitem.RepairItem;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link RepairItem}
 */
@Value
public class RepairItemInfo implements Serializable {
    Integer repairItemId;
    @NotNull
    @Size(max = 255)
    String repairItemCategoryName;
    @NotNull
    BigDecimal price;
}
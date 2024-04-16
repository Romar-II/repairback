package ee.shop.repairback.business.year.dto;

import ee.shop.repairback.domain.modelyear.ModelYear;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link ModelYear}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelYearInfo implements Serializable {
    private Integer yearId;
    private Integer yearNumber;
    private Integer repairMultiplier;
}
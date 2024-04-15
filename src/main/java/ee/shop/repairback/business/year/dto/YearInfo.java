package ee.shop.repairback.business.year.dto;

import ee.shop.repairback.domain.model.Model;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Model} //model tuleb ilmselt muuta
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YearInfo implements Serializable {
    private Integer yearId;
    @NotNull
    @Size(max = 255)
    private String yearName;
}
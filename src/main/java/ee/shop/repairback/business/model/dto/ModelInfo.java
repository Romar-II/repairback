package ee.shop.repairback.business.model.dto;

import ee.shop.repairback.domain.model.Model;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Model}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelInfo implements Serializable {
    private Integer modelId;
    @NotNull
    @Size(max = 255)
    private String modelName;
}
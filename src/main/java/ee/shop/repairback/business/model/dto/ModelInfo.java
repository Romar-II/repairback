package ee.shop.repairback.business.model.dto;

import ee.shop.repairback.domain.model.Model;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link Model}
 */
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModelInfo implements Serializable {
    private Integer modelId;
    @NotNull
    @Size(max = 255)
    private String modelName;

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
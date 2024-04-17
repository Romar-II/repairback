package ee.shop.repairback.business.model;

import ee.shop.repairback.business.model.dto.ModelInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ModelController {

    private ModelService modelService;


    @GetMapping("/models/{brandId}")

   public List<ModelInfo> getModels(@PathVariable Integer brandId){

        return modelService.getModels(brandId);

    }
}

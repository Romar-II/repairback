package ee.shop.repairback.business.model;

import lombok.AllArgsConstructor;
import org.aspectj.asm.AsmManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ModelController {

    private ModelService modelService;


    @GetMapping("/repair/model/{brandId}")

   public List<ModelInfo> getModel(@PathVariable Integer brandId){
        return modelService.getModels(brandId);

   }
}

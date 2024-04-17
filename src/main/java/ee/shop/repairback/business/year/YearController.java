package ee.shop.repairback.business.year;

import ee.shop.repairback.business.year.dto.ModelYearInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class YearController {

    private YearService yearService;


    @GetMapping("/years/{modelId}")
    public List<ModelYearInfo> getModelYears(@PathVariable Integer modelId){
       return yearService.getModelYears(modelId);
    }
}
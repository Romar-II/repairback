package ee.shop.repairback.business.year;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class YearController {

    private YearService yearService;


    @GetMapping("/years/{modelId}")
    public void getModelYears(@PathVariable Integer modelId){
        yearService.getModelYears(modelId);
    }
}
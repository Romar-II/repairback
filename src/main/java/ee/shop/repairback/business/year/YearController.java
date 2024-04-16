package ee.shop.repairback.business.year;

import ee.shop.repairback.business.year.dto.YearInfo;
import ee.shop.repairback.domain.model.Model;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.Year;
import java.util.List;

@RestController
@AllArgsConstructor
public class YearController {

    private YearService yearService;


    @GetMapping("/years/{modelId}")

    public List<YearInfo> getYear(@PathVariable Integer modelId){
        List<YearInfo> years = yearService.getYears(modelId);

        return years;
    }
}
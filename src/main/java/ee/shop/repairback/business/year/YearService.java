package ee.shop.repairback.business.year;

import ee.shop.repairback.domain.modelyear.ModelYear;
import ee.shop.repairback.domain.modelyear.ModelYearRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;

@Service
@AllArgsConstructor
public class YearService {

    private ModelYearRepository modelYearRepository;


    public void getModelYears(Integer modelId) {

        List<ModelYear> modelYears = modelYearRepository.findModelYearsBy(modelId);


    }
}

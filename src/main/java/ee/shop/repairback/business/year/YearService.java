package ee.shop.repairback.business.year;

import ee.shop.repairback.business.year.dto.ModelYearInfo;
import ee.shop.repairback.domain.modelyear.ModelYear;
import ee.shop.repairback.domain.modelyear.ModelYearMapper;
import ee.shop.repairback.domain.modelyear.ModelYearRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;

@Service
@AllArgsConstructor
public class YearService {

    private ModelYearRepository modelYearRepository;
    private ModelYearMapper modelYearMapper;


    public List<ModelYearInfo> getModelYears(Integer modelId) {

        List<ModelYear> modelYearList = modelYearRepository.findModelYearsBy(modelId);
        List<ModelYearInfo> modelYearInfos = modelYearMapper.toModelYearInfos(modelYearList);
        return modelYearInfos;

    }
}

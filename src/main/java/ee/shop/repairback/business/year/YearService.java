package ee.shop.repairback.business.year;

import ee.shop.repairback.business.model.dto.ModelInfo;
import ee.shop.repairback.business.year.dto.YearInfo;
import ee.shop.repairback.domain.model.Model;
import ee.shop.repairback.domain.model.ModelMapper;
import ee.shop.repairback.domain.model.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;

@Service
@AllArgsConstructor

public class YearService {

    private final YearRepository yearRepository;
    private final YearMapper yearMapper;

    public List<YearInfo> getYears(Integer modelId) {
        List<Year> yearList = yearRepository.findYearsBy(modelId);
        List<YearInfo> yearInfos = yearMapper.toYearInfos(yearList);
        return yearInfos ;
    }


}

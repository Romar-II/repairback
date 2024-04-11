package ee.shop.repairback.business.model;

import ee.shop.repairback.business.model.dto.ModelInfo;
import ee.shop.repairback.domain.model.Model;
import ee.shop.repairback.domain.model.ModelMapper;
import ee.shop.repairback.domain.model.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelService {

    private final ModelRepository modelRepository;
    private final ModelMapper modelMapper;

    public List<ModelInfo> getModels(Integer brandId) {
        List<Model> modelList = modelRepository.findByBrandId(brandId);
        List<ModelInfo> modelInfos = modelMapper.toModelInfos(modelList);
        return modelInfos ;
    }


}

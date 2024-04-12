package ee.shop.repairback.domain.model;

import ee.shop.repairback.business.model.dto.ModelInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ModelMapper {

    @Mapping(source = "id", target = "modelId")
    @Mapping(source = "name", target = "modelName")
    ModelInfo toModelInfo(Model model);

    List<ModelInfo> toModelInfos(List<Model> modelInfos);

}
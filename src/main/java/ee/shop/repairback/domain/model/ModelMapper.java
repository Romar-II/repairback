package ee.shop.repairback.domain.model;

import ee.shop.repairback.business.model.dto.ModelInfo;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ModelMapper {

    @Mapping(source = "id", target = "modelId")
    @Mapping(source = "brand.id", target = "brandId")
    @Mapping(source = "name", target = "name")

    ModelInfo toModalInfos(Model model);
    List<ModalInfo> toModalInfos(Model model);

}
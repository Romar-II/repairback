package ee.shop.repairback.domain.modelyear;

import ee.shop.repairback.business.model.dto.ModelInfo;
import ee.shop.repairback.business.year.dto.ModelYearInfo;
import ee.shop.repairback.domain.model.Model;
import org.mapstruct.*;

import java.time.Year;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ModelYearMapper {

    @Mapping(source = "number", target ="yearNumber")
    @Mapping(source = "id", target = "yearId")
    ModelYearInfo toModelYearInfo(ModelYear modelYear);

    List<ModelYearInfo> toModelYearInfos(List<ModelYear> modelYears);

}
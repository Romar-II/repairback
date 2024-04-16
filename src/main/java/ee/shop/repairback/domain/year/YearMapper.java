package ee.shop.repairback.domain.year;

import ee.shop.repairback.business.model.dto.ModelInfo;
import ee.shop.repairback.business.year.dto.YearInfo;
import ee.shop.repairback.domain.model.Model;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.time.Year;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface YearMapper {

    @Mapping(source = "id", target = "yearId")
    @Mapping(source = "number", target = "yearNumber")
    YearInfo toYearInfo(ee.shop.repairback.domain.year.Year number);

    List<YearInfo> toYearInfos(List<Model> yearInfos);

}
package uz.buildia.inventoryservice.mapper.dto;

import org.mapstruct.Mapper;
import uz.buildia.inventoryservice.dto.common.PassportStageHistoryDto;
import uz.buildia.inventoryservice.entity.PassportStageHistory;
import uz.buildia.inventoryservice.mapper.base.BaseMapperConfig;
import uz.buildia.inventoryservice.mapper.base.DtoMapper;
import uz.buildia.inventoryservice.mapper.base.EntityMapper;

@Mapper(config = BaseMapperConfig.class)
public interface PassportStageHistoryMapper
    extends DtoMapper<PassportStageHistoryDto, PassportStageHistory>,
        EntityMapper<PassportStageHistory, PassportStageHistoryDto> {}

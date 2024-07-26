package uz.buildia.inventoryservice.mapper.dto;

import org.mapstruct.Mapper;
import uz.buildia.inventoryservice.dto.common.StageDto;
import uz.buildia.inventoryservice.entity.Stage;
import uz.buildia.inventoryservice.mapper.base.BaseMapperConfig;
import uz.buildia.inventoryservice.mapper.base.DtoMapper;
import uz.buildia.inventoryservice.mapper.base.EntityMapper;

@Mapper(config = BaseMapperConfig.class)
public interface StageMapper extends EntityMapper<Stage, StageDto>,
		DtoMapper<StageDto, Stage> {
}
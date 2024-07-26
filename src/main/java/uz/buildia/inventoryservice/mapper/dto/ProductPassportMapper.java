package uz.buildia.inventoryservice.mapper.dto;

import java.time.LocalDateTime;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import uz.buildia.inventoryservice.dto.common.ProductPassportDto;
import uz.buildia.inventoryservice.entity.ProductPassport;
import uz.buildia.inventoryservice.mapper.base.BaseMapperConfig;
import uz.buildia.inventoryservice.mapper.base.DtoMapper;
import uz.buildia.inventoryservice.mapper.base.EntityMapper;

@Mapper(config = BaseMapperConfig.class)
public interface ProductPassportMapper
		extends DtoMapper<ProductPassportDto, ProductPassport>, EntityMapper<ProductPassport, ProductPassportDto> {

	default void setCreatedAt(@MappingTarget ProductPassport productPassport) {
		productPassport.setCreatedAt(LocalDateTime.now());
	}

}

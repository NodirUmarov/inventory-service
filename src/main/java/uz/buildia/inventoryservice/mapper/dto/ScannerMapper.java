package uz.buildia.inventoryservice.mapper.dto;

import org.mapstruct.Mapper;
import uz.buildia.inventoryservice.dto.common.ScannerDto;
import uz.buildia.inventoryservice.entity.Scanner;
import uz.buildia.inventoryservice.mapper.base.BaseMapperConfig;
import uz.buildia.inventoryservice.mapper.base.DtoMapper;
import uz.buildia.inventoryservice.mapper.base.EntityMapper;

@Mapper(config = BaseMapperConfig.class)
public interface ScannerMapper extends DtoMapper<ScannerDto, Scanner>, EntityMapper<Scanner, ScannerDto> {
}

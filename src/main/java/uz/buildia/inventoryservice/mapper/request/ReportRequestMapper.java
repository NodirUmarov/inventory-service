package uz.buildia.inventoryservice.mapper.request;

import org.mapstruct.Mapper;
import uz.buildia.inventoryservice.dto.request.ReportRequest;
import uz.buildia.inventoryservice.entity.ProductPassport;
import uz.buildia.inventoryservice.mapper.base.BaseMapperConfig;
import uz.buildia.inventoryservice.mapper.base.EntityMapper;

@Mapper(config = BaseMapperConfig.class)
public interface ReportRequestMapper extends EntityMapper<ProductPassport, ReportRequest> {

	@Override
	ProductPassport toEntity(ReportRequest dto);

}

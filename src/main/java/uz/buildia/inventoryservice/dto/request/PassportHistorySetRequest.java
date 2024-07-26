package uz.buildia.inventoryservice.dto.request;

import lombok.Builder;
import uz.buildia.inventoryservice.dto.common.ProductPassportDto;

@Builder
public record PassportHistorySetRequest(ProductPassportDto productPassportDto,
                                        String scannerId) {
}

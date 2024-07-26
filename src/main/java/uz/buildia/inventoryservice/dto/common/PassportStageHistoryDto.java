package uz.buildia.inventoryservice.dto.common;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Builder;

/**
 * DTO for {@link uz.buildia.inventoryservice.entity.PassportStageHistory}
 */
@Builder
public record PassportStageHistoryDto(Long id,
                                      ProductPassportDto qr,
                                      ScannerDto scanner,
                                      String model,
                                      StageDto stage,
                                      LocalDateTime startedAt,
                                      LocalDateTime finishedAt,
                                      Long defectsQuantity) implements Serializable {
}
package uz.buildia.inventoryservice.dto.common;

import java.io.Serializable;
import lombok.Builder;
import uz.buildia.inventoryservice.entity.Stage;

/**
 * DTO for {@link uz.buildia.inventoryservice.entity.Stage}
 */

@Builder
public record StageDto(Long id,
                       String model,
                       String stageName,
                       Stage nextStage) implements Serializable {
}
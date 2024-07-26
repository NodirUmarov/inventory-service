package uz.buildia.inventoryservice.dto.common;

import java.io.Serializable;
import lombok.Builder;

/**
 * DTO for {@link uz.buildia.inventoryservice.entity.Scanner}
 */
@Builder
public record ScannerDto(String hrId) implements Serializable {
}
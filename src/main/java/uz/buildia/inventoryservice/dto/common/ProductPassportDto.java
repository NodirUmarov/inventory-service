package uz.buildia.inventoryservice.dto.common;

import java.io.Serializable;
import java.time.LocalDateTime;
import uz.buildia.inventoryservice.constants.status.PassportStatus;
import uz.buildia.inventoryservice.entity.ProductPassport;

/** DTO for {@link ProductPassport} */
public record ProductPassportDto(
    String qrId,
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    LocalDateTime handOveredAt,
    String model,
    ProductPassport joinedWith,
    Boolean isMain,
    PassportStatus passportStatus)
    implements Serializable {}

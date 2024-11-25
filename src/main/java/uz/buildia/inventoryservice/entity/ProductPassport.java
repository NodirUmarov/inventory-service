package uz.buildia.inventoryservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import uz.buildia.inventoryservice.constants.status.PassportStatus;

@Builder
@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_passport", schema = "utj7l3hq3han256u")
public class ProductPassport {
    @Id
    @Column(name = "qr_id", nullable = false)
    private String qrId;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "hand_overed_at")
    private LocalDateTime handOveredAt;

    @Column(name = "model", nullable = false)
    private String model;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "joined_with", referencedColumnName = "qr_id")
    private ProductPassport joinedWith;

    @Column(name = "is_main", nullable = false)
    private Boolean isMain;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "passport_status", nullable = false)
    private PassportStatus passportStatus;

}
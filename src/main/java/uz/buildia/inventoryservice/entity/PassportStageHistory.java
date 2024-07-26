package uz.buildia.inventoryservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;
import uz.buildia.inventoryservice.constants.status.PassportHistoryStatus;

@Builder
@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "passport_stage_history", schema = "inventory_service")
public class PassportStageHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Exclude
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "qr_id", referencedColumnName = "qr_id", nullable = false)
    private ProductPassport productPassport;

    @Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "scanner_id", referencedColumnName = "hr_id", nullable = false)
    private Scanner scanner;

    @Column(name = "model", nullable = false)
    private String model;

    @Exclude
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "stage_id", referencedColumnName = "id", nullable = false)
    private Stage stage;

    @Column(name = "started_at", nullable = false)
    private LocalDateTime startedAt;

    @Column(name = "finished_at", nullable = false)
    private LocalDateTime finishedAt;

    @Column(name = "defects_quantity", nullable = false)
    private Long defectsQuantity;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "passport_history_status", nullable = false)
    private PassportHistoryStatus passportHistoryStatus;

}
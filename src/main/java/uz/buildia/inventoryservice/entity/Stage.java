package uz.buildia.inventoryservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Builder
@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "stages", schema = "utj7l3hq3han256u")
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "stage_name", nullable = false)
    private String stageName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "previous_stage", referencedColumnName = "id")
    @Exclude
    private Stage previousStage;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "next_stage", referencedColumnName = "id")
    @Exclude
    private Stage nextStage;

}
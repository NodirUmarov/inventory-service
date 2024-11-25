package uz.buildia.inventoryservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "scanners", schema = "utj7l3hq3han256u")
public class Scanner {
    @Id
    @Column(name = "hr_id", nullable = false)
    private String hrId;

}
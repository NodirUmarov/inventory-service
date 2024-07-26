package uz.buildia.inventoryservice.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.buildia.inventoryservice.entity.Stage;

@Repository
public interface StageRepository extends JpaRepository<Stage, Long> {

    Optional<Stage> findStageByPreviousStageIdIs(Long id);

    Boolean existsByIdAndNextStageIsNotNull(Long id);
    Boolean existsByIdAndPreviousStageIsNotNull(Long id);

    Optional<Stage> findByModelAndPreviousStageIsNull(String model);

}
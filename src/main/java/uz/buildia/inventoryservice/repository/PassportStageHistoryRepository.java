package uz.buildia.inventoryservice.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.buildia.inventoryservice.constants.status.PassportHistoryStatus;
import uz.buildia.inventoryservice.entity.PassportStageHistory;

@Repository
public interface PassportStageHistoryRepository extends JpaRepository<PassportStageHistory, Long> {
  Boolean existsByPassportHistoryStatusIsAndProductPassportQrIdIs(
      PassportHistoryStatus passportHistoryStatus, String qrId);

  Optional<PassportStageHistory> findByProductPassportQrIdAndPassportHistoryStatus(
      String qrId, PassportHistoryStatus passportHistoryStatus);

  PassportStageHistory findFirstByProductPassportQrIdOrderByFinishedAtDesc(String qrId);
}

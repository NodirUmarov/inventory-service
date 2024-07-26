package uz.buildia.inventoryservice.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uz.buildia.inventoryservice.constants.LogTemplate;
import uz.buildia.inventoryservice.constants.messages.StageMessages;
import uz.buildia.inventoryservice.dto.common.StageDto;
import uz.buildia.inventoryservice.mapper.dto.StageMapper;
import uz.buildia.inventoryservice.repository.StageRepository;
import uz.buildia.inventoryservice.service.StageService;

@Slf4j
@Service
@RequiredArgsConstructor
public class StageServiceImpl implements StageService {

  private final StageMapper stageMapper;
  private final StageRepository stageRepository;

  @Override
  public Boolean hasNextStage(Long id) {
    String methodNameForLog = "hasNextStage(id)";
    log.info(LogTemplate.METHOD_CALL_TEMPLATE.getTemplate(), methodNameForLog, id);
    return stageRepository.existsByIdAndNextStageIsNotNull(id);
  }

  @Override
  public Boolean hasPreviousStage(Long id) {
    String methodNameForLog = "hasNextStage(id)";
    log.info(LogTemplate.METHOD_CALL_TEMPLATE.getTemplate(), methodNameForLog, id);
    return stageRepository.existsByIdAndPreviousStageIsNotNull(id);
  }

  @Override
  public StageDto getNextStageById(Long id) {
    String methodNameForLog = "getNextStageById(id)";
    log.info(LogTemplate.METHOD_CALL_TEMPLATE.getTemplate(), methodNameForLog, id);

    return stageRepository
        .findStageByPreviousStageIdIs(id)
        .map(stageMapper::toDto)
        .orElseThrow(
            () -> {
              log.error(
                  LogTemplate.ERROR_LOG_TEMPLATE.getTemplate(),
                  methodNameForLog,
                  StageMessages.UNABLE_TO_RETRIEVE_NEXT_STAGE.getMessage(),
                  id);
              return new EntityNotFoundException(
                  StageMessages.UNABLE_TO_RETRIEVE_NEXT_STAGE.getMessage());
            });
  }

  @Override
  public StageDto getFirstStageByModel(String model) {
    String methodNameForLog = "getFirstStageByModel(model)";
    return stageRepository
        .findByModelAndPreviousStageIsNull(model)
        .map(stageMapper::toDto)
        .orElseThrow(
            () -> {
              log.error(
                  LogTemplate.ERROR_LOG_TEMPLATE.getTemplate(),
                  methodNameForLog,
                  StageMessages.STAGE_FOR_MODEL_NOT_FOUND.getMessage(),
                  model);
              return new EntityNotFoundException(
                  StageMessages.STAGE_FOR_MODEL_NOT_FOUND.getMessage());
            });
  }
}

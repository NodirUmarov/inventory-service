package uz.buildia.inventoryservice.service;

import uz.buildia.inventoryservice.dto.common.StageDto;

public interface StageService {

    Boolean hasNextStage(Long id);
    StageDto getNextStageById(Long id);
    Boolean hasPreviousStage(Long id);
    StageDto getFirstStageByModel(String model);
}

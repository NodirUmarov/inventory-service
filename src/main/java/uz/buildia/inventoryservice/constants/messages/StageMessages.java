package uz.buildia.inventoryservice.constants.messages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StageMessages {

    UNABLE_TO_RETRIEVE_NEXT_STAGE("unable_to_retrieve_next_stage"),
    STAGE_FOR_MODEL_NOT_FOUND("stage_for_model_not_found"),
    FINAL_STAGE_COMPLETED("final_stage_completed");

    private final String message;

}

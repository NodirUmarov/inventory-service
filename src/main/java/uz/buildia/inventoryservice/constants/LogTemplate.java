package uz.buildia.inventoryservice.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LogTemplate {

    METHOD_CALL_TEMPLATE("Method {} called with arguments: {}"),
    METHOD_EXIT_TEMPLATE("Method {} exited with result: {}"),
    ERROR_LOG_TEMPLATE("An error occurred in method {} with message {} for arguments {}"),
    WARNING_LOG_TEMPLATE("Warning in method {}: {}"),
    INFO_LOG_TEMPLATE("Info in method {}: {}");

    private final String template;

}

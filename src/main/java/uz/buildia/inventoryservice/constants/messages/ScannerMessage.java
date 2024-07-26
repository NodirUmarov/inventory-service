package uz.buildia.inventoryservice.constants.messages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ScannerMessage {

	SCANNER_ID_IS_NULL("scanner_id_is_null"),
	UNKNOWN_SCANNER_ID("unknown_scanner_id");

	private final String message;

}

package uz.buildia.inventoryservice.service.impl;

import jakarta.persistence.EntityNotFoundException;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uz.buildia.inventoryservice.constants.LogTemplate;
import uz.buildia.inventoryservice.dto.common.ScannerDto;
import uz.buildia.inventoryservice.mapper.dto.ScannerMapper;
import uz.buildia.inventoryservice.repository.ScannerRepository;
import uz.buildia.inventoryservice.service.ScannerService;

import static uz.buildia.inventoryservice.constants.LogTemplate.ERROR_LOG_TEMPLATE;
import static uz.buildia.inventoryservice.constants.messages.ScannerMessage.SCANNER_ID_IS_NULL;
import static uz.buildia.inventoryservice.constants.messages.ScannerMessage.UNKNOWN_SCANNER_ID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ScannerServiceImpl implements ScannerService {

	private final ScannerMapper scannerMapper;
	private final ScannerRepository scannerRepository;

	@Override
	public ScannerDto getScannerByHrId(String hrId) {
		String methodNameForLog = "getScannerByHrId(hrId)";

		log.info(LogTemplate.METHOD_CALL_TEMPLATE.getTemplate(), methodNameForLog, hrId);

		if (Objects.isNull(hrId)) {
			log.error(ERROR_LOG_TEMPLATE.getTemplate(), methodNameForLog, SCANNER_ID_IS_NULL.getMessage(), hrId);
			throw new NullPointerException(SCANNER_ID_IS_NULL.getMessage());
		}

		return scannerRepository.findById(hrId)
				.map(scannerMapper::toDto)
				.orElseThrow(() -> {
					log.error(ERROR_LOG_TEMPLATE.getTemplate(), methodNameForLog, UNKNOWN_SCANNER_ID.getMessage(), hrId);
					return new EntityNotFoundException(UNKNOWN_SCANNER_ID.getMessage());
				});
	}
}

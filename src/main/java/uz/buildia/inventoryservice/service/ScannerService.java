package uz.buildia.inventoryservice.service;

import uz.buildia.inventoryservice.dto.common.ScannerDto;

public interface ScannerService {

     ScannerDto getScannerByHrId(String hrId);

}

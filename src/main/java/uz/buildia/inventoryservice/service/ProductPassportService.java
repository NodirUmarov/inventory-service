package uz.buildia.inventoryservice.service;

import uz.buildia.inventoryservice.dto.common.ProductPassportDto;
import uz.buildia.inventoryservice.dto.request.ReportRequest;

public interface ProductPassportService {

  ProductPassportDto report(ReportRequest reportRequest, String scannerId);

  String generateNewPassportId();
}

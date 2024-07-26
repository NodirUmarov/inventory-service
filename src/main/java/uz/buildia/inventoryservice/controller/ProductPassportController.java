package uz.buildia.inventoryservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.buildia.inventoryservice.dto.common.ProductPassportDto;
import uz.buildia.inventoryservice.dto.request.ReportRequest;
import uz.buildia.inventoryservice.service.ProductPassportService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product-passport")
public class ProductPassportController {

  private final ProductPassportService productPassportService;

  @PostMapping
  public ResponseEntity<ProductPassportDto> scanPassport(
      @RequestParam String scannerId,
      @RequestBody ReportRequest reportRequest) {
    return ResponseEntity.ok(productPassportService.report(reportRequest, scannerId));
  }
}

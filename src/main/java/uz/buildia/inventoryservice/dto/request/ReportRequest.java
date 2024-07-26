package uz.buildia.inventoryservice.dto.request;

import lombok.Builder;

@Builder
public record ReportRequest(String qrId, String model, Boolean isMain) {}

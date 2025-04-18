package br.com.ldf.medium.monorepo.api.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record PaymentCreateRequest(
        @NotBlank(message = "Code cannot be blank")
        String code,
        @Min(value = 1, message = "Origin account must be greater than 0")
        @NotNull(message = "Origin account cannot be null")
        Integer originAccount,
        @Min(value = 1, message = "Origin account must be greater than 0")
        @NotNull(message = "Destination account cannot be null")
        Integer destinationAccount,
        @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
        @NotNull(message = "Amount cannot be null")
        BigDecimal amount
) {
}

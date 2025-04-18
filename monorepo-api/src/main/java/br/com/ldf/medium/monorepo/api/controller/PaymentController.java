package br.com.ldf.medium.monorepo.api.controller;

import br.com.ldf.medium.monorepo.api.mappers.PaymentApplicationMapper;
import br.com.ldf.medium.monorepo.application.service.CreatePaymentService;
import br.com.ldf.medium.monorepo.api.request.PaymentCreateRequest;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PaymentController {

    CreatePaymentService createPaymentService;
    PaymentApplicationMapper paymentApplicationMapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> processPayment(@RequestBody @Validated PaymentCreateRequest paymentCreateRequest) {
        createPaymentService.processPayment(paymentApplicationMapper.toDomain(paymentCreateRequest));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}

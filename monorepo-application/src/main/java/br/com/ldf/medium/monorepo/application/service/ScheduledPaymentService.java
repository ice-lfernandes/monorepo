package br.com.ldf.medium.monorepo.application.service;

import br.com.ldf.medium.monorepo.application.provider.PaymentProvider;
import br.com.ldf.medium.monorepo.domain.model.Payment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ScheduledPaymentService {

    private final PaymentProvider paymentProvider;

    public void scheduledPayment(Payment payment) {
        paymentProvider.savePayment(payment);
        log.info("Payment processed: {}", payment);
    }

}

package br.com.ldf.medium.monorepo.application.service;

import br.com.ldf.medium.monorepo.application.provider.PaymentProvider;
import br.com.ldf.medium.monorepo.domain.model.Payment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreatePaymentService {

    private final PaymentProvider paymentProvider;

    public void processPayment(Payment payment) {
        // simulates a payment integration with some external system
        // save the payment in the database
        paymentProvider.savePayment(payment);
        log.info("Payment processed: {}", payment);
    }

    public void processScheduledPayment() {
        paymentProvider.findAllScheduledPayments()
            .parallelStream()
            .forEach(this::processPayment);
        log.info("Scheduled payments processed");
    }

}

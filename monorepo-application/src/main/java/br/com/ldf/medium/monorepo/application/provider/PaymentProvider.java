package br.com.ldf.medium.monorepo.application.provider;

import br.com.ldf.medium.monorepo.domain.model.Payment;

import java.util.List;

public interface PaymentProvider {

    void savePayment(Payment payment);

    List<Payment> findAllScheduledPayments();
}

package br.com.ldf.medium.monorepo.application.provider;

import br.com.ldf.medium.monorepo.domain.model.Payment;

public interface PaymentProvider {

    void savePayment(Payment payment);
}

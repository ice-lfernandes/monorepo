package br.com.ldf.medium.monorepo.infrastructure.provider;

import br.com.ldf.medium.monorepo.application.provider.PaymentProvider;
import br.com.ldf.medium.monorepo.domain.model.Payment;
import br.com.ldf.medium.monorepo.infrastructure.mappers.PaymentInfrastructureMapper;
import br.com.ldf.medium.monorepo.infrastructure.persistence.repository.PaymentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PaymentProviderImpl implements PaymentProvider {

    PaymentRepository paymentRepository;
    PaymentInfrastructureMapper mapper;

    @Override
    public void savePayment(Payment payment) {
        var paymentEntity = mapper.toEntity(payment);
        paymentRepository.save(paymentEntity);
        log.info("Payment saved: {}", payment);
    }
}

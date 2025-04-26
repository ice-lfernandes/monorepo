package br.com.ldf.medium.monorepo.infrastructure.mappers;

import br.com.ldf.medium.monorepo.domain.model.Payment;
import br.com.ldf.medium.monorepo.infrastructure.persistence.entity.PaymentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentInfrastructureMapper {

    PaymentEntity toEntity(Payment payment);

    List<Payment> toDomain(List<PaymentEntity> paymentEntities);

    Payment toDomain(PaymentEntity paymentEntity);
}

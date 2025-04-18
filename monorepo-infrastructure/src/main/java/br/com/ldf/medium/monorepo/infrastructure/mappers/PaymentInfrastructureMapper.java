package br.com.ldf.medium.monorepo.infrastructure.mappers;

import br.com.ldf.medium.monorepo.domain.model.Payment;
import br.com.ldf.medium.monorepo.infrastructure.persistence.entity.PaymentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentInfrastructureMapper {

    PaymentEntity toEntity(Payment payment);
}

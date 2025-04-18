package br.com.ldf.medium.monorepo.api.mappers;

import br.com.ldf.medium.monorepo.api.request.PaymentCreateRequest;
import br.com.ldf.medium.monorepo.domain.model.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaymentApplicationMapper {

    @Mapping(target = "status", constant = "CREATED")
    @Mapping(target = "scheduledDate", ignore = true)
    Payment toDomain(PaymentCreateRequest paymentCreateRequest);
}

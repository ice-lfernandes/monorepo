package br.com.ldf.medium.monorepo.subscriber.mapper;

import br.com.ldf.medium.monorepo.domain.model.Payment;
import br.com.ldf.medium.monorepo.subscriber.event.PaymentEvent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SubscriberPaymentMapper {

    @Mapping(target = "status", constant = "SCHEDULED")
    Payment toDomain(PaymentEvent event);
}

package br.com.ldf.medium.monorepo.subscriber.event;

import br.com.ldf.medium.monorepo.domain.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentEvent(
        String code,
        String originAccount,
        String destinationAccount,
        BigDecimal amount,
        LocalDateTime creationDate,
        PaymentStatus status,
        LocalDateTime scheduledDate
) {
}

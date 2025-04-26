package br.com.ldf.medium.monorepo.subscriber.event;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentEvent(
        String code,
        String originAccount,
        String destinationAccount,
        BigDecimal amount,
        LocalDateTime creationDate,
        LocalDateTime scheduledDate
) {
}

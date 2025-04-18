package br.com.ldf.medium.monorepo.domain.model;

import br.com.ldf.medium.monorepo.domain.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Payment {
    final String code;
    final String originAccount;
    final String destinationAccount;
    final BigDecimal amount;
    final LocalDateTime creationDate = LocalDateTime.now();
    PaymentStatus status;
    final LocalDateTime scheduledDate;

}

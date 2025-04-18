package br.com.ldf.medium.monorepo.infrastructure.persistence.entity;

import br.com.ldf.medium.monorepo.domain.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "payment")
@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentEntity {
    @Id
    @Column(name = "id_payment")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "code", nullable = false, unique = true)
    String code;
    @Column(name = "origin_account", nullable = false)
    String originAccount;
    @Column(name = "destination_account", nullable = false)
    String destinationAccount;
    @Column(name = "amount", nullable = false)
    BigDecimal amount;
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    PaymentStatus status;
    @Column(name = "creation_date", nullable = false)
    LocalDateTime creationDate;
    @Column(name = "scheduled_date", nullable = false)
    LocalDateTime scheduledDate;
}

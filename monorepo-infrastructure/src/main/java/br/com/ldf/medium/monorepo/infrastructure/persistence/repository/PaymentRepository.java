package br.com.ldf.medium.monorepo.infrastructure.persistence.repository;

import br.com.ldf.medium.monorepo.infrastructure.persistence.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}

package br.com.ldf.medium.monorepo.infrastructure.persistence.repository;

import br.com.ldf.medium.monorepo.infrastructure.persistence.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

    @Query(value = """
            SELECT p.*
            FROM payment p
            WHERE p.scheduled_date = CURRENT_DATE
            AND p.status = 'SCHEDULED'
        """, nativeQuery = true)
    List<PaymentEntity> findAllByPaymentScheduledForToday();
}

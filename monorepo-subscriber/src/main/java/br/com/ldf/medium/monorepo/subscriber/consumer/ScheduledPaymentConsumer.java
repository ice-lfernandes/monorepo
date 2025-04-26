package br.com.ldf.medium.monorepo.subscriber.consumer;

import br.com.ldf.medium.monorepo.application.service.ScheduledPaymentService;
import br.com.ldf.medium.monorepo.subscriber.event.PaymentEvent;
import br.com.ldf.medium.monorepo.subscriber.mapper.SubscriberPaymentMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ScheduledPaymentConsumer {

    SubscriberPaymentMapper mapper;
    ScheduledPaymentService scheduledPaymentService;

    @KafkaListener(topics = "schedule-payment-topic", groupId = "consumer-group-monorepo",
            autoStartup = "true",
            containerFactory = "kafkaListenerContainerFactory")
    public void schedulePaymentListener(final PaymentEvent event) {
        log.info("stage=schedule-payment-consumer-init, event={}", event);
        scheduledPaymentService.scheduledPayment(mapper.toDomain(event));
        log.info("stage=schedule-payment-consumer-finished, event={}", event);
    }
}

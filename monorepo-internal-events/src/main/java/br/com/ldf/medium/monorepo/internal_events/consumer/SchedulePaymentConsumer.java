package br.com.ldf.medium.monorepo.internal_events.consumer;

import br.com.ldf.medium.monorepo.internal_events.event.PaymentEvent;
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
public class SchedulePaymentConsumer {

    @KafkaListener(topics = "schedule-payment-topic", groupId = "consumer-group-monorepo",
            autoStartup = "true",
            containerFactory = "kafkaListenerContainerFactory")
    public void schedulePaymentListener(final PaymentEvent event) {
        log.info("stage=schedule-payment-consumer, event={}", event);
    }
}

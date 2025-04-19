package br.com.ldf.medium.monorepo.internal_events.config;

import br.com.ldf.medium.monorepo.application.ApplicationConfig;
import br.com.ldf.medium.monorepo.infrastructure.InfrastructureConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ApplicationConfig.class, InfrastructureConfig.class})
public class SubscriberConfig {
}

package br.com.ldf.medium.monorepo.infrastructure;

import br.com.ldf.medium.monorepo.infrastructure.persistence.PersistenceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PersistenceConfig.class})
@ComponentScan(basePackages = {"br.com.ldf.medium.monorepo.infrastructure"})
public class InfrastructureConfig {
}

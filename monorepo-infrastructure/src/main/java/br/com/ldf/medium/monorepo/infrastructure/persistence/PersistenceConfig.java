package br.com.ldf.medium.monorepo.infrastructure.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "br.com.ldf.medium.monorepo.infrastructure.persistence.repository")
@EntityScan("br.com.ldf.medium.monorepo.infrastructure.persistence.entity")
@EnableTransactionManagement
@RequiredArgsConstructor
public class PersistenceConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE")
                .username("sa")
                .driverClassName("org.h2.Driver")
                .password("")
                .build();
    }
}

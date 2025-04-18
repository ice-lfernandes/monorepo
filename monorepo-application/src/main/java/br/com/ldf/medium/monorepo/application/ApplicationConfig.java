package br.com.ldf.medium.monorepo.application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "br.com.ldf.medium.monorepo.application"
})
public class ApplicationConfig {
}

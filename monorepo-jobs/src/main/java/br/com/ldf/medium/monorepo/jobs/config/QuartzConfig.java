package br.com.ldf.medium.monorepo.jobs.config;

import br.com.ldf.medium.monorepo.jobs.schedule.ProcessScheduledPaymentJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail jobDetail() {
        return JobBuilder.newJob(ProcessScheduledPaymentJob.class)
                .withIdentity(ProcessScheduledPaymentJob.class.getSimpleName())
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger trigger(JobDetail jobDetail) {
        return TriggerBuilder.newTrigger()
                .forJob(jobDetail)
                .withIdentity("simpleTrigger")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInHours(24)
                        .repeatForever())
                .build();
    }
}
package br.com.ldf.medium.monorepo.jobs.schedule;

import br.com.ldf.medium.monorepo.application.service.CreatePaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProcessScheduledPaymentJob implements Job {

    private final CreatePaymentService createPaymentService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("stage=process-scheduled-payment-job-init");
        createPaymentService.processScheduledPayment();
        log.info("stage=process-scheduled-payment-job-finished");
    }

}

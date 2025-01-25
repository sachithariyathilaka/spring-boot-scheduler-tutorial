package io.github.sachithariyathilaka.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Cron scheduler class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2025/01/25
 */
@Component
public class CronExpressionScheduler {

    /**
     * Cron job scheduler method.
     */
    @Scheduled(cron = "0 2-5 21 * * ?")
    public void schedulePrint() {
        System.out.println("Cron Schedule Triggered At: " + LocalDateTime.now());
    }
}

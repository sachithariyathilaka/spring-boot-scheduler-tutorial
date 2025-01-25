package io.github.sachithariyathilaka.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Fixed rate scheduler class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2025/01/25
 */
@Component
public class FixedRateScheduler {

    /**
     * Fixed rate job scheduler method.
     */
    @Scheduled(fixedRate = 1000)
    public void schedulePrint() {
        System.out.println("Fixed Rate Schedule Triggered At: " + LocalDateTime.now());
    }
}

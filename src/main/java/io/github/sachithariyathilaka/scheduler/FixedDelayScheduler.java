package io.github.sachithariyathilaka.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Fixed delay scheduler class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2025/01/25
 */
@Component
public class FixedDelayScheduler {

    /**
     * Fixed delay job scheduler method.
     */
    @Scheduled(fixedDelay = 1000, initialDelay = 2000)
    public void schedulePrint() {
        System.out.println("Fixed Delay Schedule Triggered At: " + LocalDateTime.now());
    }
}

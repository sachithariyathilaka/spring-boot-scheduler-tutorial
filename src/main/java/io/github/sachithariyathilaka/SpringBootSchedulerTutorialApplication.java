package io.github.sachithariyathilaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Main class of the application.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2025/01/25
 */
@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulerTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulerTutorialApplication.class, args);
	}

}

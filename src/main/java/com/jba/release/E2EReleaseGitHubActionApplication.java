package com.jba.release;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author judebarnabasantony
 *
 */

@SpringBootApplication
public class E2EReleaseGitHubActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(E2EReleaseGitHubActionApplication.class, args);
	}

	// restart the application
	void restartApplication() {
		SpringApplication.exit(SpringApplication.run(E2EReleaseGitHubActionApplication.class));
	}

	
}
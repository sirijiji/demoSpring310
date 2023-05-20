package com.example.demoSpring310;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.PostgreSQLContainer;

@Configuration
public class DemoSpring310ApplicationTests {

	@Bean
	@RestartScope
	@ServiceConnection
	public PostgreSQLContainer postgreSQLContainer(){
		PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:15.0-alpine");
		postgreSQLContainer.withInitScript("data.sql");
		return postgreSQLContainer;
	}


	public static void main(String[] args) {

		SpringApplication
				.from(DemoSpring310Application::main)
				.with(DemoSpring310ApplicationTests.class)
				.run(args);
	}

}

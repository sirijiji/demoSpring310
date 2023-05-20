package com.example.demoSpring310;

import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
public class DemoSpring310TestcontainersTest {

    @Container
//    @RestartScope
    @ServiceConnection
    public static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:15.0-alpine");


    static {
        postgreSQLContainer.withInitScript("data.sql");
        postgreSQLContainer.withReuse(true);
    }

}

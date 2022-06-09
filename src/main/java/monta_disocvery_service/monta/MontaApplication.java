package monta_disocvery_service.monta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MontaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MontaApplication.class, args);
    }

}

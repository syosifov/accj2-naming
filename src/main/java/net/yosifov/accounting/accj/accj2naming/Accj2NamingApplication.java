package net.yosifov.accounting.accj.accj2naming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Accj2NamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Accj2NamingApplication.class, args);
	}

}

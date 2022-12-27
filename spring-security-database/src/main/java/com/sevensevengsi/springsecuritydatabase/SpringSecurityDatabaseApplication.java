package com.sevensevengsi.springsecuritydatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.sevensevengsi.springsecuritydatabase"})
@EnableJpaRepositories(basePackages = {"com.sevensevengsi.springsecuritydatabase.repository"})
@EntityScan(basePackages = {"com.sevensevengsi.springsecuritydatabase.model"})
public class SpringSecurityDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDatabaseApplication.class, args);
	}

}

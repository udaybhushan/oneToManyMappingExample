package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class OneToManyMappingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingExampleApplication.class, args);

		/*
		 * ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("GMT"));
		 * System.out.println("ZonedDateTime fromat ="+ zonedDateTime);
		 * System.out.println("Instant format with GMT zone Id =" +
		 * Instant.now().atZone(ZoneId.of("GMT")));
		 * System.out.println("Plain Instant format ="+Instant.now());
		 * System.out.println("OffsetDateTime format with GMT = "+OffsetDateTime.now(
		 * ZoneId.of("GMT")));
		 * System.out.println("Plain OffsetDateTime format = "+OffsetDateTime.now());
		 * System.out.println("Date =" + zonedDateTime.toLocalDate());
		 * System.out.println("Hours = "+ zonedDateTime.getHour());
		 * System.out.println("Minutes = "+zonedDateTime.getMinute());
		 * System.out.println("seconds = "+zonedDateTime.getSecond());
		 * System.out.println("Milli Seconds "+zonedDateTime.getNano());
		 */
	}

	@Bean
	public Docket getDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				// .withClassAnnotation(RestController.class)
				.paths(PathSelectors.any()).build();
	}

	@Bean
	public AuditorAware<String> auditorProvider() {
		 String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return () -> Optional.ofNullable(name);
	}

}

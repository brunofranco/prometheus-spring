package com.example.actuator.prometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrometheusMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrometheusMonitoringApplication.class, args);
	}
}

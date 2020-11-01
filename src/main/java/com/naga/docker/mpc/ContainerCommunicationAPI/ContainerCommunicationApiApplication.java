package com.naga.docker.mpc.ContainerCommunicationAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.naga.docker.mpc.Services")
@SpringBootApplication
public class ContainerCommunicationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainerCommunicationApiApplication.class, args);
	}

}

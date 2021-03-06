package com.server.pedidosyventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PedidosyventasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidosyventasApplication.class, args);
	}

}

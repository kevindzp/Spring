package com.example.proyItem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProyItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyItemApplication.class, args);
	}

}

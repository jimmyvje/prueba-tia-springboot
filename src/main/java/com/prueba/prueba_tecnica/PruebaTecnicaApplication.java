package com.prueba.prueba_tecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.prueba.prueba_tecnica") // Escanea todos los paquetes dentro de "com.prueba.prueba_tecnica"
@EnableJpaRepositories(basePackages = "com.prueba.prueba_tecnica.repositories") // Escanea los repositorios JPA
public class PruebaTecnicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaApplication.class, args);
	}

}

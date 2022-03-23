package com.juandieruiz.di;

import com.juandieruiz.di.profiles.EnvironmentService;
import com.juandieruiz.di.qualifiers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.juandieruiz.di.inyection.Coche;


@SpringBootApplication
public class DependencyInyectionApplication {

	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);

		EnvironmentService environmentService = context.getBean(EnvironmentService.class);

		log.info("Active Environment: {}", environmentService.getEnvironment());


		/* Nido nido = context.getBean(Nido.class);
		nido.imprimir(); */

		/* log.info("Objeto {}", objeto.getNombre()); */

	}


}

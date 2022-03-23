package com.juandieruiz.di;

import com.juandieruiz.di.profiles.EnvironmentService;
import com.juandieruiz.di.qualifiers.*;
import com.juandieruiz.di.scopes.EjemploScopeService;
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

		EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);
		EjemploScopeService ejemploScopeService2 = context.getBean(EjemploScopeService.class);


		log.info("Are beans equal {} ", ejemploScopeService1.equals(ejemploScopeService2));
		log.info("Are beans == {} ", ejemploScopeService1 == ejemploScopeService2);


		/*
		Profiles
		log.info("Active Environment: {}", environmentService.getEnvironment());

		Qualifiers
		Nido nido = context.getBean(Nido.class);
		nido.imprimir();

		Inyection
		log.info("Objeto {}", objeto.getNombre()); */

	}


}

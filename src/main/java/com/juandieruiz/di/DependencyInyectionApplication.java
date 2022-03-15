package com.juandieruiz.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.juandieruiz.di.atributo.Coche;


@SpringBootApplication
public class DependencyInyectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);

		Coche coche = context.getBean(Coche.class);

		System.out.println(coche);

	}


}

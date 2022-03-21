package com.juandieruiz.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // El Qualifier hace que tome pajarito como valor, si no estuviera ese bean iría a Primary
public class Pajaro extends Animal implements Volador {

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    public Pajaro(@Value("Flappy") String nombre,@Value("7")  Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        log.info("Estoy volando");
    }

}

package com.juandieruiz.di.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary  Para que sea el bean por defecto, si llegase haber un qualifier daría error
public class Perro extends Animal {

    public Perro(@Value("Rocky") String nombre,@Value("4")  Integer edad) {
        super(nombre, edad);
    }
}

package com.juandieruiz.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// CICLOS DE VIDA DE UN BEAN
@Component
@Scope("prototype") //Debido a que el scope es prototype, no se ejecuta el PreDestroy
public class LifeCycleBean implements BeanNameAware {
    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);


    @Override
    public void setBeanName(String name) {
        log.info("--*Bean name Aware in construction for {}", name);
    }

    /**
     *  Se ejecutará despúes de la inyección de dependencias
     *  No se pueden pasar parámetros ni argumentos a los métodos de inicialización
     * Anotaciones no dadas por spring!
     * ExplicitBean Class(Go to see)
    * */
    @PostConstruct
    public void init(){ // NO SE PUEDE RECIBIR PARAMETROS
        log.info("Bean initialized - Post Construct");
    }

    /**
     * Se ejecutará antes de la destrucción del bean
     * No se ejecutaran para beans prototype
     * Solo se ejecutan durante una terminacion del la VM de forma normal
     * (SI HACEMOS KILL -9 NO SE EJECUTA)
     */

    @PreDestroy
    public void destroy(){
        log.info("App Off, Pre destroy");
    }
}

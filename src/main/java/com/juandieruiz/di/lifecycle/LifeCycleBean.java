package com.juandieruiz.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// CICLOS DE VIDA DE UN BEAN
@Component
// @Scope("prototype") Debido a que el scope es prototype, no se ejecuta el PreDestroy en beans de este tipo
// Los Beans Prototype son por default lazy
@Lazy(false) // Si el Bean es Lazy no se inicializara a menos que se inyecte
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {
    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

    /**
     *  Se ejecutará durante la construcción el bean "BeanNameAware"
     */
    @Override
    public void setBeanName(String name) {
        log.info("1.Bean name Aware in construction for {}", name);
    }

    /**
     *  Se ejecutará despúes de la inyección de dependencias
     *  No se pueden pasar parámetros ni argumentos a los métodos de inicialización
     * Anotaciones no dadas por spring!
     * ExplicitBean Class(Go to see)
    * */
    @PostConstruct
    public void init(){ // NO SE PUEDE RECIBIR PARAMETROS
        log.info("2.Bean initialized - Post Construct");
    }

    /**
     * Se ejecutará antes de la destrucción del bean
     * No se ejecutaran para beans prototype
     * Solo se ejecutan durante una terminacion del la VM de forma normal
     * (SI HACEMOS KILL -9 NO SE EJECUTA)
     */

    @PreDestroy
    public void destroyBean(){
        log.info("3.App Off, Pre destroy");
    }

    /**
     * El implements InitializingBean nos hace implementar este metodo
     *
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("4.After properties set method");
    }

    /**
     *  El implements DisposableBean nos hace implementar este metodo
     *
     */
    @Override
    public void destroy() throws Exception {
        log.info("5.After destroy method");
    }

    /**
     * Primero se ejecutan las aware interfaces
     * Segundo los callbacks con @PostConstruct
     * Tercero AfterPropertiesSet
     * Cuarto - aqui se inicializa la aplicacion
     * Pero antes de destruirla
     * Primero los metodos con @PreDestroy
     * y al final el metodo destroy de la interface DisposableBean
     */
}

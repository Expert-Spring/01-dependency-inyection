package com.juandieruiz.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// CICLOS DE VIDA DE UN BEAN
@Component
public class LifeCycleBean implements BeanNameAware {
    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

    @Override
    public void setBeanName(String name) {
        log.info("Bean name Aware in construction for {}", name);
    }

    @PostConstruct
    public void init(){ // NO SE PUEDE RECIBIR PARAMETROS
        log.info("Bean initialized");
    }

    @PreDestroy
    public void destroy(){
        log.info("App Off, active Pre destroy");
    }
}

package com.juandieruiz.di.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
// @Scope( "singleton" ) Crea una sola instancia del bean por contenedor de Spring
// @Scope("prototype") //Crea una nueva instancia cada vez que se solicita
public class EjemploScopeService {

    //      log.info("Are beans equal {} ", ejemploScopeService1.equals(ejemploScopeService2)); true con singleton
    //		log.info("Are beans == {} ", ejemploScopeService1 == ejemploScopeService2); true con singleton

    //      log.info("Are beans equal {} ", ejemploScopeService1.equals(ejemploScopeService2)); false con prototype
    //		log.info("Are beans == {} ", ejemploScopeService1 == ejemploScopeService2); false con prototype


}

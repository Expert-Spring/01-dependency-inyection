package com.juandieruiz.di.lifecycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class BeanA {

    Logger log = LoggerFactory.getLogger(BeanB.class);

    @PostConstruct
    public void init() {
        log.info("Init Bean A");
    }
}

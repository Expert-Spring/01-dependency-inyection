package com.juandieruiz.di.lifecycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;

@Lazy
public class BeanB {

    Logger log = LoggerFactory.getLogger(BeanB.class);

    @PostConstruct
    public void init() {
        log.info("Init Bean B");
    }
}

package com.juandieruiz.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplicitBean {

    Logger log = LoggerFactory.getLogger(ExplicitBean.class);

    public void init() {
        log.info("6.Init method from ExplicitBean");
    }

    public void destroy() {
        log.info("7.Destroy method from ExplicitBean");
    }
}

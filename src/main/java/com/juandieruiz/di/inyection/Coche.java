package com.juandieruiz.di.inyection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coche {

    private String owner;

    private Integer model;

    private Motor motor;

    public Coche() {
    }

    public String getOwner() {
        return owner;
    }
    @Value("Tesla")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getModel() {
        return model;
    }
    @Value("2020")
    public void setModel(Integer model) {
        this.model = model;
    }

    public Motor getMotor() {
        return motor;
    }
    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Características Coche = {" +
                "owner='" + owner + '\'' +
                ", model=" + model +
                ", motor=" + motor +
                '}';
    }
}

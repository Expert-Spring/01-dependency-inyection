package com.juandieruiz.di.atributo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coche {

    private String owner;

    private Integer model;

    private Motor motor;

    @Autowired
    public Coche(@Value("Tesla") String owner,@Value("2020") Integer model, Motor motor) {
        this.owner = owner;
        this.model = model;
        this.motor = motor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Motor getMotor() {
        return motor;
    }

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

package com.juandieruiz.di.atributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {

    private String type;
    private Integer year;



    public Motor(@Value("Electric") String type, @Value("2016") Integer year) {
        this.type = type;
        this.year = year;
    }

    public String getElectric() {
        return type;
    }

    public void setElectric(String type) {
        this.type = type;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Características {" +
                "type='" + type + '\'' +
                ", year=" + year +
                '}';
    }
}

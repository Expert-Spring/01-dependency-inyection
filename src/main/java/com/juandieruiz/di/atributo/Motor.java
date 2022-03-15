package com.juandieruiz.di.atributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {

    private String type;
    private Integer year;

    public Motor() {
    }

    public String getType() {
        return type;
    }
    @Value("Electric")
    public void setType(String type) {
        this.type = type;
    }

    public Integer getYear() {
        return year;
    }
    @Value("2019")
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

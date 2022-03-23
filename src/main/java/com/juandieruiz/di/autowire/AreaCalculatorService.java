package com.juandieruiz.di.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaCalculatorService {

    @Autowired
    private List<Figure> figureLists;

    public double calcAreas() {
        double area=0;
        for (Figure figure : figureLists) {
            area+= figure.calculateArea();
        }

            return area;
    }
}

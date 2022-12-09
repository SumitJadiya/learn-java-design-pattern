package com.java.pattern.design.factoryMethod.serviceImpl;

import com.java.pattern.design.factoryMethod.service.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

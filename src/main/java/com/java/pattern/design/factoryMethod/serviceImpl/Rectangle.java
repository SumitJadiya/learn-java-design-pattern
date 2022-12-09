package com.java.pattern.design.factoryMethod.serviceImpl;

import com.java.pattern.design.factoryMethod.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

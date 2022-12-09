package com.java.pattern.design.factoryMethod.factory;

import com.java.pattern.design.factoryMethod.service.*;
import com.java.pattern.design.factoryMethod.serviceImpl.Circle;
import com.java.pattern.design.factoryMethod.serviceImpl.Rectangle;
import com.java.pattern.design.factoryMethod.serviceImpl.Square;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}

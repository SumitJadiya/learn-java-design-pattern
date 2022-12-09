package com.java.pattern.design.factoryMethod.factory;

import com.java.pattern.design.factoryMethod.model.Circle;
import com.java.pattern.design.factoryMethod.model.Rectangle;
import com.java.pattern.design.factoryMethod.model.Shape;
import com.java.pattern.design.factoryMethod.model.Square;

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

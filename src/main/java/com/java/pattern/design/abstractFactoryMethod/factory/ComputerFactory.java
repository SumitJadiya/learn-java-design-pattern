package com.java.pattern.design.abstractFactoryMethod.factory;

import com.java.pattern.design.abstractFactoryMethod.abstractFactory.ComputerAbstractFactory;
import com.java.pattern.design.abstractFactoryMethod.model.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}

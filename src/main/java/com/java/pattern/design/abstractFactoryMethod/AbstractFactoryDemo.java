package com.java.pattern.design.abstractFactoryMethod;

import com.java.pattern.design.abstractFactoryMethod.abstractFactory.PCFactory;
import com.java.pattern.design.abstractFactoryMethod.abstractFactory.ServerFactory;
import com.java.pattern.design.abstractFactoryMethod.model.Computer;

import static com.java.pattern.design.abstractFactoryMethod.factory.ComputerFactory.getComputer;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}

package com.java.pattern.design.abstractFactoryMethod.abstractFactory;

import com.java.pattern.design.abstractFactoryMethod.model.Computer;
import com.java.pattern.design.abstractFactoryMethod.model.PC;

public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}

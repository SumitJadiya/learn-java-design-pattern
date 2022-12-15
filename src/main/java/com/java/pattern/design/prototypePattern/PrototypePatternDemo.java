package com.java.pattern.design.prototypePattern;

import com.java.pattern.design.prototypePattern.prototype.Employees;

import java.util.List;

public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emp = new Employees();
        emp.loadData();

        System.out.println(emp.getEmpList());
        System.out.println("----------------");

        Employees newEmp = (Employees) emp.clone();
        List<String> newEmpList = newEmp.getEmpList();
        newEmpList.add("Rohit");

        System.out.println(emp.getEmpList());
        System.out.println(newEmp.getEmpList());
        System.out.println("----------------");

        newEmpList.remove("Yuzi");

        System.out.println(emp.getEmpList());
        System.out.println(newEmp.getEmpList());
    }
}

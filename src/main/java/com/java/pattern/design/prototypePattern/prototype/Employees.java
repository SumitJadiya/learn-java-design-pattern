package com.java.pattern.design.prototypePattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        this.empList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        empList.add("Kuldeep");
        empList.add("Virat");
        empList.add("Yuzi");
        empList.add("Ashwin");
    }

    public List<String> getEmpList() {
        return this.empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<String>();

        for (String s : this.getEmpList())
            tempList.add(s);

        return new Employees(tempList);
    }
}

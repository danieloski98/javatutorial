package org.example;


import org.enums.Status;

public class Parent {
    String name;
    boolean hasDiabities;
    boolean isWealth;

    Status livingClass;

    public Parent() {}

    Parent(String name, boolean hasDiabities, boolean isWealth, Status livingClass) {
        this.name = name;
        this.hasDiabities = hasDiabities;
        this.isWealth = isWealth;
        this.livingClass = livingClass;
    }

}

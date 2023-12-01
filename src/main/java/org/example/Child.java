package org.example;

import org.enums.Status;

public class Child extends Parent {
    Child() {
        super();
    }

    Child(String name, boolean hasDiabities, boolean isWealth, Status livingClass) {
        super(name, hasDiabities, isWealth, livingClass);
    }

    public String toString() {
        return this.name + "\n" + this.isWealth + "\n" + this.hasDiabities + "\n" + this.livingClass;
    }
}

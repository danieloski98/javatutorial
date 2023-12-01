package org.Practice1;

public class BiologyStudent extends Students {

    int biology;
    BiologyStudent(String id, int physics, int chemistry, int biology) {
        super(id, physics, chemistry);
        this.biology = biology;
    }


    public String toString() {
        return super.toString() + "\n" + this.biology;
    }

    int getBiology() {
        return this.biology;
    }
}

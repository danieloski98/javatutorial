package org.Practice1;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Random;
import com.github.javafaker.Faker;

public class Students {
    String id;
    String name;
    int physics;
    int chemistry;

    LocalDateTime dateJoined =  LocalDateTime.now();


    Students(String id,int physics, int chemistry) {
        this.chemistry = chemistry;
        this.physics = physics;
        this.id = id;
        Faker faker = new Faker();
        this.name = faker.name().firstName() + " " + faker.name().lastName();
    }

    public String toString() {
        return this.name + "\n" + this.id + "\n" + this.physics + "\n" + this.chemistry;
    }

    int getPhysics() {
        return this.physics;
    }

    int getChemistry() {
        return this.chemistry;
    }

    String getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

}

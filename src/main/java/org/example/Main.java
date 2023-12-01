package org.example;

import org.enums.Status;
import org.example.Multithreading;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Child daniel = new Child();
        daniel.livingClass = Status.WEALTHY;
        daniel.hasDiabities = false;
        daniel.name = "Daniel";
        daniel.isWealth = true;

        System.out.println(daniel.toString());
    }
}
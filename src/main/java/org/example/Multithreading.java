package org.example;

import java.util.Objects;

public class Multithreading extends Thread {

    private final String number;

    public Multithreading(String URL) {
        this.number = URL;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " From thread " + this.number);
            if (Objects.equals(number, "3")) {
                throw new RuntimeException("Exception from thread " + this.number);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package org.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[10];

        PriorityQueue<UserProfile> userProfiles = new PriorityQueue<>(
                Comparator.comparing(UserProfile::getAge)
        );

        userProfiles.offer(new UserProfile("Dandolla", 20));
        userProfiles.offer(new UserProfile("Str", 30));
        userProfiles.offer(new UserProfile("Dandolla98", 20));

        System.out.println(userProfiles.poll().getAge());
    }
}

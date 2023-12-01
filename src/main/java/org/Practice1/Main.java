package org.Practice1;

import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;
import java.util.*;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        final  int COUNTER = 10;
        Random random = new Random();

        // list to hold generated UUID to make sure they are unique
        List<String> uuidList = new ArrayList<>();

        for(int i = 0; i < COUNTER; i++){
            UUID uuid = UUID.randomUUID();
            if (uuidList.isEmpty()) {
                uuidList.add(uuid.toString());
            }
            if (!uuidList.contains(uuid.toString())) {
                uuidList.add(uuid.toString());
                // generate random grades
                int phy = random.nextInt(0, 100);
                int chem = random.nextInt(0,100);
                int bio = random.nextInt(0,100);
                BiologyStudent bioStudent = new BiologyStudent(uuid.toString(), phy, chem, bio);
                System.out.println("ID " + bioStudent.id);
                System.out.println("NAME : " + bioStudent.getName());
                System.out.println("-----------------*RESULTS*-----------------");
                System.out.println("PHYSICS : " + bioStudent.getPhysics());
                System.out.println("CHEMISTRY : " + bioStudent.getChemistry());
                System.out.println("BIOLOGY : " + bioStudent.getBiology());
                System.out.println("TOTAL MARKS -> " + (phy + chem + bio));
                String Remark = (phy + chem + bio) > 149 ? "PASS" : "FAIL";
                System.out.println("FINAL REMARKS -> " + Remark);
                System.out.println("ENTRY DATE -> " + bioStudent.dateJoined.format(DateTimeFormatter.ISO_LOCAL_DATE));
                System.out.println("ENTRY TIME -> " + bioStudent.dateJoined.format(DateTimeFormatter.ISO_LOCAL_TIME));
                System.out.println("---------------------------------------------------------------");
            }
        }
        System.out.println("Generated IDS");
        System.out.println(uuidList);


    }
}

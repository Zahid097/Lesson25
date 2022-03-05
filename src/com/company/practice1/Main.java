package com.company.practice1;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> sandar = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> evenNumber = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int sandar1 = random.nextInt(1, 100);
            sandar.add(sandar1);

            if (sandar.get(i) % 2 == 0) {
                oddNumber.add(sandar.get(i));
            } else {
                evenNumber.add(sandar.get(i));
            }
        }
        System.out.println("\n" + sandar + " ");
        System.out.println("\n" + oddNumber + " " + "\n");
        System.out.println(evenNumber);
    }
}

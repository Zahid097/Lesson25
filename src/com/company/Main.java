package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

import static com.company.Kurs.JAVA;
import static com.company.Kurs.JS;

public class Main {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList
                (new Student("Azat", (byte) 33, JAVA),
                        new Student("Seyitbek", (byte) 32, JAVA),
                        new Student("Kuba", (byte) 30, JS),
                        new Student("Jakyp", (byte) 29, JAVA),
                        new Student("Kylych", (byte) 28, JS),
                        new Student("Altynbek", (byte) 27, JAVA),
                        new Student("Azamat", (byte) 26, JS),
                        new Student("Nursultan", (byte) 25, JAVA),
                        new Student("Max", (byte) 24, JS),
                        new Student("Ulan", (byte) 23, JAVA),
                        new Student("Abdu-Nuur", (byte) 22, JS),
                        new Student("Habib", (byte) 21, JAVA),
                        new Student("Cholponbek", (byte) 20, JS),
                        new Student("Adilet", (byte) 19, JAVA),
                        new Student("Nurseit", (byte) 18, JS),
                        new Student("Bakyt", (byte) 36, JAVA),
                        new Student("Alym", (byte) 37, JS),
                        new Student("Mansur", (byte) 38, JAVA),
                        new Student("Nurlan", (byte) 39, JS),
                        new Student("Almaz", (byte) 30, JAVA),
                        new Student("Nurgazy", (byte) 15, JS));


        System.out.println("\n" + "Java students: " + "\n");
        System.out.println(getAllJavaStudent(students));

        System.out.println("Java Script students: " + "\n");
        System.out.println(getAllJsStudent(students));

        System.out.println("Students from eighteen to twenty-five: " + "\n");
        System.out.println(AgeFilter(students));

        System.out.println("Students over thirty: " + "\n");
        System.out.println(MoreThanThirty(students));

        System.out.print("Remove students: " + "\n");
        System.out.println(remove(students));

        System.out.print("Students name beginning with letter A: " + "\n");
        System.out.println(filterByName(students));

        System.out.println("Students name beginning with letter K in Java Script: " + "\n");
        System.out.println(StudentsWithKInName(students));

    }

    private static List<Student> getAllJavaStudent(List<Student> students) {
        ArrayList<Student> newStudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getKurs().equals(JAVA)) {
                newStudents.add(students.get(i));
            }
        }
        return newStudents;
    }

    private static List<Student> getAllJsStudent(List<Student> students) {
        ArrayList<Student> newStudents1 = new ArrayList<>();
        for (Student student : students) {
            if (student.getKurs().equals(JS)) {
                newStudents1.add(student);
            }
        }
        return newStudents1;
    }

    private static List<Student> AgeFilter(List<Student> students) {
        ArrayList<Student> ageStudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() > 17 && students.get(i).getAge() < 25) {
                ageStudents.add(students.get(i));
            }
        }
        return ageStudents;
    }

    private static List<Student> MoreThanThirty(List<Student> students) {
        ArrayList<Student> moreThanThirty = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() > 30) {
                moreThanThirty.add(students.get(i));
            }
        }
        return moreThanThirty;
    }

    private static List<Student> remove(List<Student> students) {
        List<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() < 17) {
                System.out.println(students.get(i));
                newArrayList.remove(students.get(i));
            }
        }
        return newArrayList;
    }

    private static List<Student> filterByName(List<Student> students) {
        List<Student> filterCharName = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().charAt(0) == 'A') {
                filterCharName.add(students.get(i));
            }
        }
        return filterCharName;
    }

    private static List<Student> StudentsWithKInName(List<Student> students) {
        List<Student> filterKName = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains("K")) {
                filterKName.add(student);
            }
        }
        return filterKName;
    }
}

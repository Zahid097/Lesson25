package com.company;

public class Student {
    private String name;
    private byte age;
    private Kurs kurs;

    public Student() {
    }

    public Student(String name, byte age, Kurs kurs) {
        this.name = name;
        this.age = age;
        this.kurs = kurs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    @Override
    public String toString() {
        return "Student: " + "name= " + name +
                ", age= " + age + ", kurs= " + kurs+ "\n";
    }
}

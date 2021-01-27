package com.company;

public class Student {
    int id;
    String name;
    int age;

    void run(){
        eat();
        System.out.println(this.name + " Running..."); // có thể viết tắt là name thay vì this.name
    }

    void eat(){
        System.out.println(this.name + " eating...");
    }
}

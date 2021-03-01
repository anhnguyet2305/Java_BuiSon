package LabS5;

import java.util.Scanner;

public class Person {
    public String name;
    public String sex;
    public String date;
    public String address;

    public Person() {
    }

    public Person(String name, String sex, String date, String address) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex(){
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputPerson(){
        Scanner p = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        setName(p.nextLine());
        System.out.println("Nhap gioi tinh : ");
        setSex(p.nextLine());
        System.out.println("Nhap ngay sinh : ");
        setDate(p.nextLine());
        System.out.println("Nhap dia chi : ");
        setAddress(p.nextLine());
    }

    public void printPerson(){
        System.out.println("Ho ten : ");
        System.out.println(getName());
        System.out.println("Gioi tinh : ");
        System.out.println(getSex());
        System.out.println("Ngay sinh : ");
        System.out.println(getDate());
        System.out.println("Dia chi : ");
        System.out.println(getAddress());
    }

}


package LabS5;

import java.util.Scanner;

public class Student extends Person{
    public int maSv;
    public float diemThi;
    public String email;

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

        System.out.println("Nhap ma sv : ");
        setMaSv(p.nextInt());
        System.out.println("Nhap diem thi : ");
        setDiemThi(p.nextFloat());
        System.out.println("Nhap email");
        setEmail(p.next());
    }



    public void printPerson(){
        System.out.println("Ho ten : " +getName());
        System.out.println("Gioi tinh: " + getSex());
        System.out.println("ngay sinh : " + getDate());
        System.out.println("dia chi : " + getAddress());
        System.out.println("ma sv : " + getMaSv());
        System.out.println("diem thi : " + getDiemThi());
        System.out.println("email : " + getEmail());
    }

    public void kiemTraHocBong(){
        if (getDiemThi() > 8.0){
            System.out.println("hoc sinh co hoc bong");

        }else {
            System.out.println("hoc sinh k co hoc bong");
        }
    }
}

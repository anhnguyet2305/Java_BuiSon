package LabS5;

import LabS5.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person {
    ArrayList<String> danhSachLop;
    double mucLuong;
    int soMonGiangDay;
    ArrayList<String> danhSachMonHoc;

    public GiaoVien() {
        danhSachLop = new ArrayList<>();
        danhSachMonHoc = new ArrayList<>();
    }

    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }

    public int getSoMonGiangDay() {
        return soMonGiangDay;
    }

    public void setSoMonGiangDay(int soMonGiangDay) {
        this.soMonGiangDay = soMonGiangDay;
    }
    
    public void inputPerson(){
        super.inputPerson();
        Scanner sc = new Scanner(System.in);
        System.out.println("Muc luong : ");
        setMucLuong(sc.nextDouble());
        System.out.println("so mon giang day : ");
        setSoMonGiangDay(sc.nextInt());
        sc.nextLine();
        System.out.println("danh sach cac mon : ");
        for (int i = 0; i<getSoMonGiangDay(); i++){
            danhSachMonHoc.add(sc.nextLine());
        }
        System.out.println("so lop giang day :");
        int sl = sc.nextInt();
        sc.nextLine();
        System.out.println("danh sach lop : ");
        for (int i = 0; i < sl; i++){
            danhSachLop.add(sc.nextLine());
        }
    }
    public void printPerson(){
        super.printPerson();
        System.out.println("Muc luong:"+getMucLuong());
        System.out.println("So mon hoc dang day:"+getSoMonGiangDay());
        System.out.println("Danh sach mon hoc:");
        for(String s: danhSachMonHoc){
            System.out.println(s);
        }
        System.out.println("Danh sach lop hoc:");
        for(String s: danhSachLop){
            System.out.println(s);
        }
    }
}


package LabS2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen to : ");
        x = sc.nextInt();
        SoNguyen snt = new SoNguyen(x);
    }

}

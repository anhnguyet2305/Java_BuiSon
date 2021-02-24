package ass.ass2;

import java.util.Scanner;

public class Fraction {
    private int ts;
    private int ms;

    Fraction(){
        ts=0;
        ms=1;
    }

    Fraction(int ts,int ms){
        this.ts = ts;
        this.ms = ms;
    }

    public int getTu() {
        return ts;
    }
    public void setTu(int i) {
        this.ts = ts;
    }
    public int getMau() {
        return ms;
    }
    public void setMau(int i) {
        this.ms = ms!=0?ms:1;
    }

    public void printFraction(){
        System.out.println("Phan so: "+getTu()+"/"+getMau());
    }

    public void NhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap tu so:");
            setTu(sc.nextInt());
            System.out.println("Nhap mau so:");
            setMau(sc.nextInt());

            if(ms == 0)
                System.out.println("Mau so phai khac 0. Hay kiem tra lai");
        }while (ms == 0);
    }

    public void inPhanSo(){
        if(getTu() == 0)
            System.out.print("0");
        else if (getMau() == 0)
            System.out.print(getTu());
        else if(getMau() < 0 )
            System.out.print("-" + getTu() + "/" +getMau());
        else
            System.out.print(getTu() + "/" +getMau());

    }

    public int USCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public void rutGon()
    {
        int i= USCLN(this.getTu(),this.getMau());
        this.setTu((int) (this.getTu()/i));
        this.setMau((int) (this.getMau()/i));
    }

    public void NghichDao(){
        int ms = getMau();
        if (getTu()!=0){
            setMau(getTu());
            setTu(ms);
        }else {
            System.out.println("ko the nghich dao!");
        }
    }

    public Fraction cong(Fraction ps){
        Fraction kq = new Fraction();
        kq.ms = this.getMau() * ps.getTu();
        kq.ts = this.getTu() * ps.getMau() + this.getMau() * ps.getTu();
        kq.setTu(ts);
        kq.setMau(ms);
        kq.rutGon();
        return kq;
    }

    public Fraction tru(Fraction ps){
        Fraction kq = new Fraction();
        kq.ms = this.getMau() * ps.getTu();
        kq.ts = this.getTu() * ps.getMau() - this.getMau() * ps.getTu();
        kq.setTu(ts);
        kq.setMau(ms);
        kq.rutGon();
        return kq;
    }

    public Fraction nhan(Fraction ps){
        Fraction kq = new Fraction();
        kq.ms = this.getMau() * ps.getTu();
        kq.ts = this.getTu() * ps.getMau();
        kq.setTu(ts);
        kq.setMau(ms);
        kq.rutGon();
        return kq;
    }
    public Fraction chia(Fraction ps){
        Fraction kq = new Fraction();
        kq.ms = this.getTu() * ps.getMau();
        kq.ts = this.getMau() * ps.getTu();
        kq.setTu(ts);
        kq.setMau(ms);
        kq.rutGon();
        return kq;
    }


}
package SinhVien;

import java.util.ArrayList;

public class Class {
    int Malop;
    String Tenlop;
    String Phonghoc;
    ArrayList<SinhVien> Danhsachsinhvien;

    public Class() {
        Danhsachsinhvien = new ArrayList<SinhVien>();
    }

    public int getMalop() { return Malop; }
    public void setMalop(int malop) { Malop = malop; }

    public String getTenlop() { return Tenlop; }
    public void setTenlop(String tenlop) { Tenlop = tenlop; }

    public String getPhonghoc() { return Phonghoc; }
    public void setPhonghoc(String phonghoc) { Phonghoc = phonghoc; }

    public ArrayList<SinhVien> getDanhsachsinhvien(){
        return Danhsachsinhvien;
    }
    public void addSv(SinhVien sv){
        getDanhsachsinhvien().add(sv);
    }
    public void removeSV(int index){
        getDanhsachsinhvien().remove(index);
    }
    public void printDS(){
        for (SinhVien s:Danhsachsinhvien){
            System.out.println("Ma SV :" + s.getMaso());
            System.out.println("Ten : " + s.getHovaten());
            System.out.println("sdt : " + s.getSdt());
            System.out.println("dia chi : " + s.getDiachi());
        }
    }

}

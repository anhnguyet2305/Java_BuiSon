package SinhVien;

import java.util.ArrayList;

public class Class {
    String Malop;
    String Tenlop;
    String Phonghoc;
    ArrayList<SinhVien> Danhsachsinhvien;

    public Class() {
        Danhsachsinhvien = new ArrayList<SinhVien>();
    }

    public String getMalop() { return Malop; }
    public void setMalop(String malop) { Malop = malop; }

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
        System.out.println("danh sách sinh viên trong lớp : "+ Danhsachsinhvien);
    }

}

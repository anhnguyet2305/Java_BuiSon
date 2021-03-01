package SinhVien;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setMaso(1);
        sv1.setHovaten("hoàng sơn");
        sv1.setDiachi("bắc giang");
        sv1.setSdt("12344456");


        SinhVien sv2 = new SinhVien();
        sv2.setMaso(2);
        sv2.setHovaten("bùi sơn");
        sv2.setDiachi("hà nội");
        sv2.setSdt("2341678");

        Class lh = new Class();
        lh.setMalop(8);
        lh.setTenlop("T2008M");
        lh.setPhonghoc("phong so 2");

        lh.addSv(sv1);
        lh.addSv(sv2);

        System.out.println("danh sach sinh vien trong lop:");
        lh.printDS();
    }
}

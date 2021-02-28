package SinhVien;

public class Main {
    public static void main(String[] args) {
        SinhVien r = new SinhVien();
        r.setMaso(1);
        r.setHovaten("hoàng sơn");
        r.setDiachi("bắc giang");
        r.setSdt(12344456);


        SinhVien r1 = new SinhVien();
        r1.setMaso(2);
        r1.setHovaten("bùi sơn");
        r1.setDiachi("hà nội");
        r1.setSdt(2341678);

        Class lh = new Class();
        lh.setMalop("a8");
        lh.setTenlop("T2008M");
        lh.setPhonghoc("phong so 2");


        lh.addSv(r);
        lh.addSv(r);
        lh.addSv(r);
        lh.addSv(r1);
        lh.addSv(r1);
        lh.addSv(r1);

        System.out.println("danh sach sinh vien trong lop:");
        for (SinhVien p : lh.getDanhsachsinhvien()) {
            System.out.println("Mã SV:"+p.getMaso() + "\n" + "Họ và tên :"+p.getHovaten() + "\n" +"Địa Chỉ :"+ p.getDiachi() + "\n"+"Sdt:"+ p.getSdt());
            System.out.println();
        }
    }
}

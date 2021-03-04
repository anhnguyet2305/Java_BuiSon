package ass6;

public class Main {
    public static void main(String[] args){
        MonHocDaICuong pb = new MonHocDaICuong();
        pb.themLopHoc("T2008M", 22);
        pb.themLopHoc("T2008M", 33);
        pb.themLopHoc("T20010M", 44);
        pb.inDanhSach();
        System.out.println("Sắp xếp lại");
        pb.sort();
        pb.inDanhSach();
    }
}

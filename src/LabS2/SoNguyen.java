package LabS2;

public class SoNguyen {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


    public SoNguyen(){
        a = 0;
    }
    boolean  isSoNguyenTo(int x){
        if (x < 2) return false;
        int squareRoot = (int) Math.sqrt(x);
        for (int i = 2; i<= squareRoot; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public int timSoNguyenToTiepTheo(){
        int songuyentotieptheo;
        int i=0;
        while (true){
            if(isSoNguyenTo(getA() + ++i) == true){
                return getA() + i;
            }
        }
    }
    public SoNguyen(int x){
        if (isSoNguyenTo(x) == true){
            this.a = x;
            System.out.printf("%d la so nguyen to \n", x);
            System.out.println("So nguyen to tiep theo la " + timSoNguyenToTiepTheo());
        }else {
            System.out.println("không set vi nho hon 2");
        }
    }
}
package ass1;

public class TamGiac {
    int a,b,c;

    void TamGiac() {
        System.out.println("Cạnh thứ 1 : " + a);
        System.out.println("Cạnh thứ 2 : " + b);
        System.out.println("Cạnh thứ 3 : " + c);
    }
    boolean CheckEdge(){
        if ((a + b > c) && (b + c > a) && (c + a > b)) return true;
        return false;
    }
    double Chuvi(){
        double cv=0;
        cv = a + b + c;
        return cv;
    }
    double DienTich(){
        double s;
        float p;
        p = (float)(a+b+c)/2;
        s = (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}

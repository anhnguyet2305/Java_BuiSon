package ass.ass2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Fraction ft1 = new Fraction();
        ft1.setTu(1);
        ft1.setMau(2);
        Fraction ft2 = new Fraction();
        ft2.setTu(1);
        ft2.setMau(3);

        Fraction t = ft1.cong(ft2);
        t.printFraction();
    }
}

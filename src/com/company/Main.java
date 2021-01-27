package com.company;

public class Main {

    public static void main(String[] args) {
        Product sp1 = new Product();
        sp1.id = 1;
        sp1.name = "ip1";
        sp1.price = 1000;
        sp1.amount = 1;
        sp1.unit = "pc";
        sp1.in4_Product();

        Product sp2 = new Product();
        sp2.id = 2;
        sp2.name = "ip2";
        sp2.price = 2000;
        sp2.amount = 2;
        sp2.unit = "pc";
        sp2.in4_Product();

        Product sp3 = new Product();
        sp3.id = 3;
        sp3.name = "ip3";
        sp3.price = 3000;
        sp3.amount = 3;
        sp3.unit = "pc";
        sp3.in4_Product();

        if(sp1.checkStock()){
            System.out.println("San pham "+sp1.name + " con " + sp1.amount + " sp");
        }else{
            System.out.println("San pham " + sp1.name + " het hang");
        }
    }
}

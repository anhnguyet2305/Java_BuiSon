package com.company;

public class Product {
    int id;
    String name;
    double price;
    int amount;
    String unit;

    void in4_Product(){
        id();
        name();
        price();
        amount();
        unit();
    }
    void unit(){
        System.out.println("Unit : " +this.unit  + "\n");
    }

    void id(){
        System.out.println("product code : " +this.id);
    }

    void name(){
        System.out.println("product name : " +this.name);
    }

    void price(){
        System.out.println("product price : " +this.price);
    }

    void amount(){
        System.out.println("product amount : " +this.amount);
    }

    void  changeQty(int q){
        amount += q;
    }
    void changePrice(double p){
        price = p;
    }
    boolean checkStock(){
        if(amount > 0) return  true;
        return false;
    }
}

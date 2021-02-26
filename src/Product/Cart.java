package Product;

import java.util.ArrayList;

public class Cart {
    int id;
    ArrayList<String> customer;
    float grandTotal;
    String city;
    ArrayList<String> productList;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public float getGrandTotal(){
        return grandTotal;
    }
    public void setGrandTotal(float grandTotal){
        this.grandTotal = grandTotal;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public Cart(){
        customer = new ArrayList<String>();
        productList = new ArrayList<String>();
    }

    public void addCart(String sp){
        productList.add(sp);
    }
    public void removeCart(String sp){
        productList.remove(sp);
    }
}

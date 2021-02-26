package Product;

import java.util.ArrayList;

public class Product {
    int id;
    String productName;
    int qty;
    float price;
    ArrayList<String> Product;
    public Product(){
        Product = new ArrayList<String>();
    }

    public String getProductName(){
        return  productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getQty(int qty){
        return qty;
    }
    public void setQty(int qty){
        if(qty > 0){
            this.qty = qty;
        }else {
            System.out.println("sản phẩm đã hết");
        }
    }

    public void getPrice(float price){
       this.price = price;
    }
    public void setPrice(float price){
        if (price>=0){
            this.price = price;
        }
        else {
            System.out.println("ko set");
        }
    }
}

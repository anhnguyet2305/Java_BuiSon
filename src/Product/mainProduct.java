package Product;

public class mainProduct {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.setId(1);
        p1.setPrice(200000);
        p1.setProductName("Dong ho ");
        p1.setQty(3);
        Product p2 = new Product();
        p2.setId(4);
        p2.setPrice(5000);
        p2.setProductName("Vay ");
        p2.setQty(6);

        Cart c = new Cart();
        c.setId(1);
        c.setCustomer("Nguyen Van A");
        c.setCity("ha noi");
        c.addProduct(p1);
        c.addProduct(p1);
        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(p2);
        c.addProduct(p2);


        System.out.println("Danh sach san pham:");
        for (Product p : c.getProductList()){
            System.out.println(p.getId()+"- "+p.getProductName()+"-"+p.getPrice());
        }
        System.out.println("Tong tien:"+c.finalGrandTotal());
    }
}

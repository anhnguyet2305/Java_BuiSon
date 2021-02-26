package Product;

public class mainCart {
    public static void main(String[] args){
        Cart c = new Cart();
        c.addCart("abc");
        c.addCart("def");
        c.addCart("def");
        c.removeCart("def");

    }
}

package ass1;

public class Main {
    public static void main(String[] args) {
        TamGiac tg = new TamGiac();
        tg.a = 3;
        tg.b = 4;
        tg.c = 5;
        tg.TamGiac();

        if(tg.CheckEdge()){
            System.out.println(tg.a + ", " + tg.b + ", " + tg.c + "là ba cạnh của tam giác");
        }else{
            System.out.println(tg.a + ", " + tg.b + ", " + tg.c + "không phải là ba cạnh của tam giác");
        }

        System.out.println("\n Chu vi của tam giác = " + tg.Chuvi());

        System.out.println(("\n Diện tích của tam giác là = " + tg.DienTich()));
    }
}

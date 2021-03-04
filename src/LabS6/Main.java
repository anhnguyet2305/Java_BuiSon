package LabS6;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Sơn","0335950503");
        pb.insertPhone("Sơn","0335950502");
        pb.insertPhone("Huy","0987654321");
        pb.printPhoneList();
        pb.sort();
        pb.printPhoneList();
    }
}

package LabS3;

public class Main_room {
    public static void main(String[] args){
        Room r = new Room();
        r.setName("phong so 1 ");
        r.getPosition("tran duy hung");
        r.addUser("hoang anh tu");
        r.addUser("hoang anh son");
        r.addUser("hoang anh quang");
        r.removeUser(2);
        r.printRoom();
    }
}

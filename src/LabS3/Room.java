package LabS3;

import java.util.ArrayList;
public class Room{
    String name;
    String position;
    ArrayList<String> users;

    public Room(){
        users = new ArrayList<String>();
    }

    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public String getPosition(String position){
        return position;
    }

    public void setPosition(){
        this.position = position;
    }

    public void addUser(String u){
        users.add(u);
    }

    public void removeUser(int index){
        users.remove(index);
    }

    public void printRoom(){
        System.out.println("room : "+getName());
        System.out.println("position : "+getPosition("tran "));
        System.out.println("Users : "+users);
    }
}



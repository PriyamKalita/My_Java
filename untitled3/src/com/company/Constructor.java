package com.company;

class Abc{
    private int id;
    private String name;

    public Abc(){
        id = 45;
        name = "Your Name is ";
    }

    public Abc(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public Abc(String myName){
        id = 12;
        name = myName;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class Constructor {
    public static void main(String[] args) {
        Abc WORLD = new Abc("HelloWorld", 4);
        Abc WORLD1 = new Abc();
        Abc WORLD2 = new Abc("ONGC");

        System.out.println(WORLD.getId());
        System.out.println(WORLD.getName());

        System.out.println(WORLD1.getId());
        System.out.println(WORLD1.getName());

        System.out.println(WORLD2.getId());
        System.out.println(WORLD2.getName());


    }
}

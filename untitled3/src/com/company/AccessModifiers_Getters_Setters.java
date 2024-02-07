package com.company;

class AMGS{

    private int id;
    private String name;

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

public class AccessModifiers_Getters_Setters {
    public static void main(String[] args) {

        AMGS Hello = new AMGS();
        //Hello .id = 45;
        //Hello.name = "Hello World";     // Throws an error due to private access modifier
        Hello.setName("Hello World");
        System.out.println(Hello.getName());

        Hello.setId(70);
        System.out.println(Hello.getId());
    }
}

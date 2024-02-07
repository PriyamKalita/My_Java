package com.company;

class Employee2{
    private int id;
    private String name;

    public  String getName(){
        return  name;
    }
    public  void  setName(String n){
        this.name = n;
    }
    public  void setId(int i){
        this.id = i;
    }
    public  int getId(){
        return id;
    }
}
public class ACCESSMODIFIERS_GETTERS_CONSTRUCTOR {
    public static void main(String[] args) {

        Employee2 DEF = new Employee2();
        //DEF.id = 45;
        //DEF.name = "Food"; ----> those on error due to private access modifier
        DEF.setName("Food");
        System.out.println(DEF.getName());


    }
}

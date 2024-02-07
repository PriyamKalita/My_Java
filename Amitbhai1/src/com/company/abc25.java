package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    public void setid(int i){
        id = i;
    }


    public  int getId(){
        return id;
    }
}

public class abc25 {
    public static void main(String[] args) {
        MyEmployee Raju = new MyEmployee();
//        Raju.id = 45;
//        Raju.name = "hello Raju";
        Raju.setName("hello Raju");
        System.out.println(Raju.getName());



    }
}

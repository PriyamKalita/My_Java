package com.company;

class myemployee3{
    private  int id;
    private String name;

    public  myemployee3(String myname, int myid) {
        id = myid;
        name = myname;
    }
    public  String getName(){
        return  name;
    }
    public void setName(String n){
        this.name = n;
    }
    public  void  setId(int i){
        this.id = i;

    }
    public  int getId(){
        return  id;
    }
}
public class CONSTRUCTORS {
    public static void main(String[] args) {

        myemployee3 GHI = new myemployee3("HOME", 12);
//        GHI.setName("HOME");
//        GHI.setId(34);
        System.out.println(GHI.getName());
        System.out.println(GHI.getId());


    }
}

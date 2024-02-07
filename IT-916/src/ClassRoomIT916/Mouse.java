package ClassRoomIT916;

public class Mouse {
    String Cname;
    String type;
    float price;

    Mouse(String Cname, String type, float price){
        this.Cname = Cname;
        this.type = type;
        this.price = price;
        show();
    }
    void show(){
        System.out.println("Company = " + this.Cname);
        System.out.println("Type of the mouse = " + this.type);
        System.out.println("Price = " + this.price);
    }
}

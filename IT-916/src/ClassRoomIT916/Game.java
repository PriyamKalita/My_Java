package ClassRoomIT916;

public class Game {
    String PName;
    int points;
     Game(String PName, int points){
         this.PName = PName;
         this.points = points;
     }
     void show(){
         System.out.println("Name = " + this.PName);
         System.out.println("Points " + this.points);
     }
     Game check(Game g){
         if (this.points > g.points){
             return this;
         }
         else {
             return g;
         }
     }
}

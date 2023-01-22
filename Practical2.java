class Player
{
   void play()
   {
       String name  = "Tharun";
       int age = 20;
       System.out.println("Name :" + name);
       System.out.println("Age :" + age);
   }
}
class CricketPlayer extends Player
{
   void show() 
     { 
           System.out.println("cricketplayer is a cricketer who plays cricket ");
       }
 }
class FootballPlayer extends Player
{
       void show()
       {
           System.out.println("FootballPlayer is a player who plays football");
         }
}
class HockeyPlayer extends Player
{
    void show()
    {
         System.out.println("HockeyPlayer is a player who plays hockey");
    }
}
public class Practical2 {
     public static void main(String args[])
  {
     CricketPlayer cp = new CricketPlayer();
     FootballPlayer fp = new FootballPlayer();
    HockeyPlayer hp = new HockeyPlayer();
    cp.show(); 
    fp.show();
    hp.show();
    hp.play();
   }
}
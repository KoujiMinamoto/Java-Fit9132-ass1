
import java.util.*;
public class Game
{
    Player player = new Player();
    LuckyGuessGenerator lucky = new LuckyGuessGenerator();
    public void displaymenu()
    {
        System.out.println("Welcome to the Lucky Vending Machine");
        System.out.println("====================================");
        System.out.println("(1) Set Up New Player");
        System.out.println("(2) Guess A Prize");
        System.out.println("(3) What Have I Won So Far?");
        System.out.println("(4) Display Game Help");
        System.out.println("(5) Exit Game");
        System.out.println("Choose an option:");
    }
    
    public String getPrizeName(int number)
   {
       String prizeName = null;
       switch(number)
       {
           case 1: prizeName = "PEN"; break;
           case 2: prizeName = "BOOK"; break;
           case 3: prizeName = "DVD"; break;
           case 4: prizeName = "Mouse"; break;
           case 5: prizeName = "Keyboard"; break;
       }
       return prizeName;
   }
   
   public int getPrizeWorth(int number)
   {
       int prizeWorth = 0;
       switch(number)
       {
           case 1: prizeWorth = 10; break;
           case 2: prizeWorth = 20; break;
           case 3: prizeWorth = 30; break;
           case 4: prizeWorth = 40; break;
           case 5: prizeWorth = 50; break;
       }
       return prizeWorth;
    }
   
   
   public int getChoice()
   {
       Scanner choiceScanner = new Scanner(System.in);
       int choice;
       displaymenu();
       choice = choiceScanner.nextInt();
       return choice;
       
   }
   
   
   public void prizeWonSoFar()
   {
       System.out.println("Player " + player.getplayerName() + " has won these prizes :");
       System.out.println("\t" + player.getprizesWon());
       System.out.println("worth a total $" + player.getWorth());
       System.out.println("Total amount spent is $" + player.getSpending());
       
   }
    
    
}

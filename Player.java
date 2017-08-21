import java.util.*;
public class Player
{
    private boolean isCreated;
    private String prizesWon;
    private String playerName;
    private int spending;
    private int worth;


    public Player()
    {
        // initialise instance variables
        isCreated = false;
        prizesWon = "";
        playerName = "";
        spending = 0;
        worth = 0;
       
    }
    
    public void setNewPlayer()
    {
        String name = "";
        Scanner playerNameScanner = new Scanner(System.in);
        System.out.print("Enter Player's Name: ");
        name = playerNameScanner.nextLine();
        if(name.isEmpty())
        {
            System.out.println("Error: The Player's name must not be blank!");
        }
        else
        {
            spending = 0;
            worth = 0;
            playerName = name;
            prizesWon = "";
            isCreated = true;
        }
        
    }
    
    public void addPrizeWon(String prizeName, int prizeValue)
    {
        prizesWon = prizesWon + " " + prizeName;
        worth = worth + prizeValue;
    }
    
    public void exitGame()
    {
        isCreated = false;
        prizesWon = "";
        playerName = "";
        spending = 0;
        worth = 0;
    }
    
    public boolean getisCreated()
    {
        return isCreated;
    }
    
    public String getplayerName()
    {
        return playerName;
    }
    
    public String getprizesWon()
    {
        return prizesWon;
    }
    
    public void setSpending(int spent)
    {
        spending = spending + spent;
    }
    
    public int getSpending()
    {
        return spending;
    }
    
    public int getWorth()
    {
        return worth;
    }
    
    public void help()
    {
    System.out.println("NumberGenerated  Price Won  Price Worth   Cost to player");
    System.out.println("1                Pen        $10           $1");
    System.out.println("2                Book       $20           $2");
    System.out.println("3                DVD        $30           $3");
    System.out.println("4                Mouse      $40           $4");
    System.out.println("5                Keyboard   $50           $5");
    
    
    }
    
}

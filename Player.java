import java.util.*;
public class Player
{
    
    private String prizesWon = "";
    private int spending;
    private int worth;

    public void addPrizeWon(String prizeName, int prizeValue)
    {
        prizesWon = prizesWon + " " + prizeName;
        worth = worth + prizeValue;
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
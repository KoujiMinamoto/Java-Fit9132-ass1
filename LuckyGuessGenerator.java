
import java.util.*;
public class LuckyGuessGenerator
{
    
  
    

   public void vending()
   {
            Scanner keyboard = new Scanner(System.in);

            int num = 1 + (int)(Math.random() * 5);

            System.out.println("Guess a number between 1-5 : ");
            int item = keyboard.nextInt();
       

        if ( (item > 0)&&(item < 6))
        {
            if (item == num)
            {
            System.out.println("Your Guess : " + item);
            System.out.println("My Guess : " + num);
            switch(item){
            case 1 :        
            System.out.println("Congratulations! You have won a PEN, worth $10.");
            break;
            case 2 :        
            System.out.println("Congratulations! You have won a BOOK, worth $20. ");
            break;
            case 3 :        
            System.out.println("Congratulations! You have won a DVD, worth $30. ");
            break;
            case 4 :        
            System.out.println("Congratulations! You have won a MOUSE, worth $40.");
            break;
            case 5 :        
            System.out.println("Congratulations! You have won a KEYBOARD, worth $50. ");
            break;
        }    
            }
            else
            System.out.println("Your Guess : " + item);
            System.out.println("My Guess : " + num);
            System.out.println("What a shame! You have won absolutely NOTHING!");;
            System.out.println("Please try again. " );
    }
        else
        System.out.print("Error : only choose 1-5 ");
        

    }
}

public class Run
{  
    
    LuckyGuessGenerator lucky = new LuckyGuessGenerator();
    Game game = new Game();
    Player player = new Player();
    public void runGame()
   {
       boolean exit = false;
       while (!exit)
       {
           switch(game.getChoice())
           {
                case 1: player.setNewPlayer(); 
                        break;
                case 2: if(player.getisCreated())
                        {
                            game.vending();
                            
                        }
                        else
                        {
                            System.out.println("Error : player has not been set up!");
                        }
                        break;
                case 3: if(player.getisCreated())
                        {
                            game.prizeWonSoFar();
                            
                        }
                        else
                        {
                            System.out.println("Error : player has not been set up!");
                        }   
                        break;
                case 4: player.help();
                        break;
                case 5: exit = true;
                        System.out.println("Goodbye. Thank you for playing.");
                        break;
        
               
            }
               
                   
           
        
       }
       
   }
    
    
}

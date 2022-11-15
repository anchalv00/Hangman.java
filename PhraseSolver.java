/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;
  private String x;

  /* your code here - constructor(s) */ 
  public PhraseSolver()
  {
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;
    x = "";
  }
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */

  public void play()
  {
    
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your guess: ");
    String sc = input.nextLine();

    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */

    if(currentPlayer == 1)
    {
      x = game.getSolvedPhrase();
      System.out.println(x);
      if(game.guessLetter(sc)){
        System.out.println("Enter your guess: ");
        sc = input.nextLine();
      }

      System.out.println("goes thru if statement");
      currentPlayer = 2;
    }
    else
    {
      x = game.getSolvedPhrase();
      System.out.println(x);
      System.out.println("goes thru else statement");
      
      game.guessLetter(sc);
      currentPlayer = 1;

    }

    if(game.isSolved(x)){
      solved = true;
    }
    
      /* your code here - determine how game ends */
    }
  } 


      
   
  

}
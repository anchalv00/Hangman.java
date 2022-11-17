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
  private int currentPlayer;

  /* your code here - constructor(s) */ 
  public PhraseSolver()
  {
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;
    String x = "";
    currentPlayer = 1;
  }
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */



  public void play()
  {
    

    //boolean correct = true;

    while (!solved) 
    {

      //PLAYER 1
      if(currentPlayer == 1){
        Scanner sc = new Scanner(System.in);
        System.out.println(player1.getName() +" enter your guess: ");
        String input1 = sc.nextLine();

        //if letter is correct
        if(game.guessLetter(input1)){
          System.out.println(player1.getName() + ": " + game.getSolvedPhrase());
          player1.addToPoints(game.getLetterValue());
        }else{
          System.out.println(player1.getName() + ": " + game.getSolvedPhrase());
        }


        //if phrase is correct
        if(game.isSolved(input1) || game.getSolvedPhrase() == game.getPhrase()){
          solved = true;
          System.out.println(player1.getName() + " has guessed the correct phrase");
          player1.addToPoints(game.getLetterValue());
          System.out.println(player1.getPoints());
        }

        currentPlayer = 2;

      //PLAYER 2
      }else{
        Scanner sc = new Scanner(System.in);
        System.out.println(player2.getName() + " enter your guess: ");
        String input2 = sc.nextLine();

        //if letter is correct
        if(game.guessLetter(input2)){
          
          System.out.println(player2.getName() + ": " + game.getSolvedPhrase());
          player1.addToPoints(game.getLetterValue());
        }else{
          System.out.println(player2.getName() + ": " + game.getSolvedPhrase());

        }

        //if phrase is correct
        if(game.isSolved(input2) || game.getSolvedPhrase().replaceAll(" ", "").equals(game.getPhrase().replaceAll(" ", ""))){
          solved = true;
          System.out.println(player2.getName() + " has guessed the correct phrase");
          player1.addToPoints(game.getLetterValue());
          System.out.println(player1.getPoints());
          
        }

        currentPlayer = 1;
      }
    }





















      /* your code here - game logic */

      /* 
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
  */
      /* your code here - determine how game ends */
    }
  } 


      
   
  


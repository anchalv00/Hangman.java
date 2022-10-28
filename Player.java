/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{

  /* your code here - attributes */
  private String name;
  private int points;

  System.out.println("Enter your name: ");
  Scanner sc = new Scanner(System.in);
  String newName = sc.nextLine();

  /* your code here - constructor(s) */ 
public Player()
{
  name = newName;
  System.out.println("Welcome, " + name + ", to the game!");
  points = 0;

}

public Player(String inputName)
{
  name = inputName;
  points = 0;
}
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}
import java.util.*;

/**
   This program runs a TicTacToe game. It prompts the
   user to set positions on the board. The computer 
   then takes a turn and prints out the results.
*/
public class TicTacToeGame
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      TicTacToeBoard game = new TicTacToeBoard();
      ITicTacToeStrategy strategy = new BasicTicTacToeStrategy();
      System.out.println(game.toString());

      while (true)
      {
         // User's turn
         System.out.println(
               "Enter your move, a row (1-3) and column (1-3): " );
         String move = in.nextLine();
         int row = Character.getNumericValue(move.charAt(0));
         int col = Character.getNumericValue(move.charAt(1));
         if (game.isEmpty(row-1,col-1)) {
            game.makeMove(move, "x");
            System.out.println(game.toString());
         }
         else{
            System.out.println("This move was not valid!");
            System.out.println("You lost your turn!");
         }
         if (game.isOver()) {
            System.out.println("User Won!");
            break;
         }
         
         // Computer's turn 
         move = strategy.getMove(game);   
         System.out.println("Computer's move: " + move); // computer will always choose the first free spot so no need to check "is.Empty"
         game.makeMove(move, "o");
         System.out.println(game.toString());                     
         if (game.isOver()) {
            System.out.println(strategy.getName() + " Won!");
            break;
         }
      }
   }
}

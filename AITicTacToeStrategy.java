/**
   Describes any class that computes the next move for a
   tic tac toe game, using any strategy.
*/
public interface AITicTacToeStrategy
{
   /**
      TicTacToe's 3x3 setup information
   */
   public static final int ROWS = 3;
   public static final int COLUMNS = 3;
   public static final int FIRST_ROW  = 1;
   public static final int LAST_ROW = 3;
   public static final int FIRST_COLUMN = 1;
   public static final int LAST_COLUMN = 3;

   /*
      Computes the next move a computer makes.
      @param a tic tac toe board
      @return a string containing the row and column for the next move
   */
   String getBestMove(TicTacToeBoard b);

   /**
      Returns the author of this strategy.
      @return a string containing the name of the CS student who
      implemented this interface
   */
   String getName();
}

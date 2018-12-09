/**
   Mock strategy for a computer to pick the next move
   on a 3 x 3 tic-tac-toe board. This strategy
   searches for the first unoccupied square.
*/
public class BasicTicTacToeStrategy implements ITicTacToeStrategy
{


  public String getMove(TicTacToeBoard b)
  {

    /*String place = b.toString();
    int i = 0;
    int j = 0;
    while ( i < ROWS) {
          while(j < COLUMNS){
            if (b[i][j].equals (" ")) {
              b[i][j] = "o";
            }
            else{
              j++;
            }
          }
          i++;
    }
    return null;*/

    String place = b.toString();
    int findSpot = place.indexOf(" ");
    int allBoard = 6;
    int row = findSpot / allBoard +1 ;
    int column = findSpot % allBoard;
      return row + " " + column;

  }




  public String getName()
  {
    String my_name = "Sepid";
    return my_name;
  }

}

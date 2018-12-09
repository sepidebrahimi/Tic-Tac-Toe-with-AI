
public class AdvancedTicTacToeStrategy implements AITicTacToeStrategy {


    public String getBestMove(TicTacToeBoard b) {

        String board = b.toString();

        String statement = "";

        if (board.charAt(1) == 'x') {
            if (board.charAt(2) == ' '){
                if (board.charAt(3) == ' '){
                    statement = "1 3";
                }
            }

        }

        if (board.charAt(13) == 'o') {
            if (board.charAt(14) == 'o') {
                if (board.charAt(15) == ' ') {
                    statement = "3 3";
                }
            }
        }
        if (board.charAt(1) == 'x') {
            if (board.charAt(7) == 'x') {
                if (board.charAt(13) == ' ') {
                    statement = "3 1";
                }
            }
        }
        if (board.charAt(7) == 'x') {
            if (board.charAt(8) == 'x') {
                if (board.charAt(9) == ' ') {
                    statement = "2 3";
                }
            }
        }

        if (board.charAt(1) == 'x') {
            if (board.charAt(8) == 'x') {
                if (board.charAt(15) == ' ') {
                    statement = "3 3";
                }
            }
        }


        if (board.charAt(3) == 'o') {
            if (board.charAt(9) == ' ') {
                if (board.charAt(15) == ' ') {
                    statement = "2 3";
                }
            }
        }



        return statement ;

    }

    public String getName()
    {
        String my_name = "Advanced AI";
        return my_name;
    }

}

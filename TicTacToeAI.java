import java.util.Scanner;

public class TicTacToeAI {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        TicTacToeBoard game = new TicTacToeBoard();
        ITicTacToeStrategy strategy = new BasicTicTacToeStrategy();
        AITicTacToeStrategy aiStrategy = new AdvancedTicTacToeStrategy();

        while (true)
        {
            String move;

            // Computer's turn
            move = strategy.getMove(game);
            System.out.println("Computer's move: " + move);
            game.makeMove(move, "x");
            System.out.println(game.toString());
            if (game.isOver()) {
                System.out.println(strategy.getName() + " Won!");
                break;
            }

            // Advanced AI's Turn

            move = aiStrategy.getBestMove(game);
            System.out.println("AI's move: " + move);
            game.makeMove(move, "o");
            System.out.println(game.toString());
            if (game.isOver()) {
                System.out.println(aiStrategy.getName() + " Won!");
                break;
            }
        }
    }
}

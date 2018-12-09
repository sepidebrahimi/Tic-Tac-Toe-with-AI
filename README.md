TicTacToe Revisited with Interfaces
by Sepid Ebrahimi


OVERVIEW

**OldTicTacToeGame.java :
Driver program that has 2 human players to shows a working TicTacToe game. This is for reference only. For both players, the program reads user input for a move on the board.

**TicTacToeGame.java :
Driver program that has 1 human player and one computer player. It read the user's moves from the terminal and automatically plays the computer's moves on the board.

**TicTacToeBoard.java :
This class represents the 3x3 board and its state. This class provides methods to display the board and manipulate the board.

**ITicTacToeStrategy.java
Template of playing strategy.

**BasicTicTacToeStrategy :
Basic AI strategy. It simply chooses the first available empty spot on the board.

**AdvancedTicTacToeStrategy :
Smarter AI strategy that can beat the basic version.

# Tic-Tac-Toe Game

This Java program implements a simple Tic-Tac-Toe game using a 2D array. It allows two players to take turns marking X's and O's on a 3x3 grid and checks for a winner after each move.

## Game Features

- **2D Array Representation**: The game board is represented using a 3x3 2D array.
- **Player Turns**: Players alternate turns to place their marks.
- **Win Condition Check**: The game checks for a winning condition after each move.
- **Draw Condition**: The game detects if the board is full with no winner.

## Usage

1. **Clone the Repository:**
   - Open your terminal.
   - Clone the repository using:
     ```bash
     https://github.com/Joe1Jun/TicTacToeGame.git
     ```

2. **Compile the Java Code:**
   - Navigate to the project directory and compile the Java file using:
     ```bash
     javac TicTacToeGame.java
     ```

3. **Run the Game:**
   - Run the compiled program with:
     ```bash
     java TicTacToeGame
     ```

4. **Play the Game:**
   - The game will prompt players to enter their moves. The board is represented by numbers 1-9 corresponding to the grid cells:
     ```
     1 | 2 | 3
     ---------
     4 | 5 | 6
     ---------
     7 | 8 | 9
     ```
   - Players will input the number corresponding to the cell where they want to place their mark (X or O).

## Example Gameplay

```
Player X, enter your move (1-9): 1
X |   |  
---------
  |   |  
---------
  |   |  
Player O, enter your move (1-9): 5
X |   |  
---------
  | O |  
---------
  |   |  
```

## Game Logic

- The game continues until either a player wins or the board is full.
- The winner is determined if a player has three marks in a row (horizontally, vertically, or diagonally).
- If all cells are filled and no player has won, the game ends in a draw.

## Files Included

- `TicTacToe.java`: The main Java class containing the game logic and user interaction.

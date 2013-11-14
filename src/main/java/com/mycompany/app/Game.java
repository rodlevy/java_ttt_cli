package com.mycompany.app;

public class Game {

  public static Interface newInterface;
  public static Board newBoard;
  public static Computer newComputer;

	public Game(Board board, Interface newInterface, Computer computer ){
		newBoard = board;
		newInterface = newInterface;
		newComputer = computer;
	}

	public static void play(){
	  String grid = newBoard.grid;
	  newInterface.printBoard(grid);
	  int location = newInterface.getMove();
	  if(newBoard.isOccupied(grid, location)){
	    newInterface.denied();
	    play();
	  }
	  newBoard.storePosition(location, 'X');
	  if(newBoard.playerMoves() + newBoard.computerMoves() == 9){
	    newInterface.catsGame();
	    return;
	  }
	  if(newBoard.checkForWinner('X')){
	    newInterface.playerWins();
	  }else{
	    newComputer.computerMove(newBoard);
	    if(newBoard.checkForWinner('O')){
	      newInterface.printBoard(newBoard.grid);
	      newInterface.computerWins();
	      return;
	    }
	    play();
	  }

	}
}

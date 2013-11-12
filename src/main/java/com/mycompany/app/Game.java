package com.mycompany.app;

public class Game {
  
  public static Interface newInterface;
  public static Board newboard;

	public Game(Board board, Interface newInterface, Computer computer ){
		newboard = board;
		newInterface = newInterface;
		computer = computer;	
	}
	
	public static void play(){
	  newInterface.printBoard(newboard.grid);
	}
}

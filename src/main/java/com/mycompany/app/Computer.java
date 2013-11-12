package com.mycompany.app;

public class Computer {

	public static void firstMove(Board board){
		if(board.isOccupied(board.grid, 4)){
			board.storePosition(0, 'O');
		}else{
			board.storePosition(4, 'O');
		}
	}

	public static void secondMove(Board board){
		if(board.oppositeCorners()){
			board.storePosition(3, 'O');
		  System.out.println("opposite corner" + board.grid);
		}else if(board.leftCornerComputerBottomRtPlayer()){
			board.storePosition(2, 'O');
		  System.out.println("lftCorner" + board.grid);
		}else if(!board.isOccupied(board.grid, 0)){
			board.storePosition(0,'O');
		  System.out.println("free top corner" + board.grid);
		}else{
			board.storePosition(8, 'O');
			System.out.println("none" + board.grid);
		}
	}
	
	public static void computerMove(Board board){
	  int playerMoves = board.playerMoves();
	}

}

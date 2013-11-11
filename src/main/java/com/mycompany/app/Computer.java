package com.mycompany.app;

public class Computer {
	
	public static void firstMove(Board board){
		if(board.isOccupied(board.grid, 4)){
			board.storePosition(0, 'O');
		}else{
			board.storePosition(4, 'O');
		}
	}

}

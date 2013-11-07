package com.mycompany.app;

import java.util.ArrayList;

public class Board {

	public static final String[] WINPOS = new String[]{"012", "345", "678", "036","147","258","048"};
	public static String grid = "---------";

	public static String printBoard(){

		//		final String WINNINGPOSSIBILITIES = "hi";
		System.out.println("newerboard");
		return "";
	}

	public static boolean checkForWinner(char player) {
		for(String winner : WINPOS){

			char firstSpot = grid.charAt(Character.getNumericValue(winner.charAt(0)));
			char secondSpot = grid.charAt(Character.getNumericValue(winner.charAt(1)));
			char thirdSpot = grid.charAt(Character.getNumericValue(winner.charAt(2)));

			if((firstSpot) == (player) && (secondSpot) == (player) && (thirdSpot) == (player)){
				return true;
			}
		}
		return false;
	}

	public static boolean checkForTie(){
		if(!grid.contains("-") && !checkForWinner('X') && !checkForWinner('O')){
			return true;
		}
		return false;
	}
	public static boolean isOccupied(String grid, int location){
		if(grid.charAt(location) != '-' ) {
			return true;
		}
		return false;
	}

	public static ArrayList<Integer> availableMoves(String grid) {
		ArrayList<Integer> openMoves = new ArrayList<Integer>();
		int length = grid.length();
		for(int i=0; i< length; i++ ){
			if(grid.charAt(i) == ('-')){
				openMoves.add(i);
			}
		}
		return openMoves;
	}

	public static String take_turn(String player) {
		return player.equals("X") ? "O" : "X" ;	
	}

	public static void storePosition(int position, char player) {
		StringBuilder replacer = new StringBuilder(Board.grid);
		replacer.setCharAt(position, player);
		Board.grid = replacer.toString();
		
	}
	
}

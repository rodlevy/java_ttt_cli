package com.mycompany.app;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class Board {

	public static final String[] WINPOS = new String[]{"012", "345", "678", "036","147","258","048"};
	public static String grid = "---------";

//	public static String printBoard(){
//
//		//		final String WINNINGPOSSIBILITIES = "hi";
//		System.out.println("newerboard");
//		return "";
//	}

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
	
	public static boolean checkParticipantWin(String grid, char player){
	  for(int i = 0; i <= 8; i ++){
	    if(!isOccupied(grid,i)){
	      storePosition(i, player);
	        if(checkForWinner(player)){
	          if(player == 'O'){
	            return true;
	          }else{
	            storePosition(i, 'O');
	            return false;
	          }
	        }else{
	          removePosition(i);
	          return false;
	        }
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

	public static String takeTurn(String player) {
		return player.equals("X") ? "O" : "X" ;	
	}

	public static void storePosition(int position, char player) {
		StringBuilder replacer = new StringBuilder(Board.grid);
		replacer.setCharAt(position, player);
		Board.grid = replacer.toString();
	}
	
	public static void removePosition(int position) {
    StringBuilder replacer = new StringBuilder(Board.grid);
    replacer.setCharAt(position, '-');
    Board.grid = replacer.toString();
  }
	
	public static boolean oppositeCorners(){
	  if (grid.charAt(0) == 'X' && grid.charAt(8) =='X' || grid.charAt(0) == 'O' && grid.charAt(8) == 'O' ||
	      grid.charAt(2) == 'X' && grid.charAt(6) == 'X' || grid.charAt(2) == 'O' && grid.charAt(6) == 'O'){
			return true;
		}
		return false;
	}
	
	public static boolean leftCornerComputerBottomRtPlayer(){
    if (grid.charAt(0) == 'O' && grid.charAt(8) == 'X'){
      return true;
    }
    return false;
  }
	public static boolean edgeCase(){
    if (grid.charAt(1) == 'X' && grid.charAt(3) == 'X' && grid.charAt(8) == 'X'){
      return true;
    }
    return false;
  }
	
	public static Integer playerMoves(){
	  int count = StringUtils.countMatches(Board.grid, "X");
	  return count;
	  }
	
	
}

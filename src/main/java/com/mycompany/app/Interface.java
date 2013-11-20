package com.mycompany.app;

import java.io.Console;
import java.util.*;


public class Interface {

	public static void main( String[] args )
	{
		Interface newInterface = new Interface();

	}
	public static void printBoard(String grid){

		System.out.println("\n\n" + grid.substring(0,3));
		System.out.println(grid.substring(3,6));
		System.out.println(grid.substring(6,9));
	}

	public static int getMove(){
		int finalMove = 0;
		boolean isNotValid = true;
		while(isNotValid){

			Scanner in = new Scanner(System.in);
			String move = in.next();

			if (isValidMove(move)){
				finalMove = Integer.parseInt(move);
				isNotValid = false;
			}
//			}else{
//				System.out.println("Please enter a valid number");
//			}
		}
		return finalMove;
	}

	public static boolean isValidMove( String input ) {
		try {
			Integer.parseInt( input );
			if(Integer.parseInt(input) > 8){
			  System.out.println("Please enter a number less than 8");
			  return false;
			}else{
			return true;
			}
		}
		catch( Exception e ) {
		  System.out.println("Please enter a valid number");
			return false;
		}
	}
	public static void denied(){
		System.out.println( "Already occupied, try again");
	}

	public static void catsGame(){
		System.out.println("CATS GAME");
	}

	public static void computerWins(){
		System.out.println("Computer wins!  Again");
	}

	public static void playerWins(){
		System.out.println( "Human wins!  Impossible!");
	}


}

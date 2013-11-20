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

			if (isInteger(move)){
				finalMove = Integer.parseInt(move);
				isNotValid = false;
			}else{
				System.out.println("Please enter a valid number");
			}
		}
		return finalMove;
	}

	public static boolean isInteger( String input ) {
		try {
			Integer.parseInt( input );
			return true;
		}
		catch( Exception e ) {
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

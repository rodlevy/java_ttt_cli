package com.mycompany.app;

import java.util.Scanner;


public class Interface {

	public static void main( String[] args )
	{
		Interface newInterface = new Interface();
		System.out.println("TEST");
		newInterface.printBoard("---------");
	}
	public static void printBoard(String grid){

		System.out.println(grid.substring(0,3));
		System.out.println(grid.substring(3,6));
		System.out.println(grid.substring(6,9));
		String moves = getInput();
		System.out.println(moves);
	}

	public static String getInput(){
	  	Scanner in = new Scanner(System.in);
	  	String move = in.nextLine();
    	in.close();
    	return move;
	}

	public static void denied(){
		System.out.println( "Already occupied, try again");
	}

	public static void cats_game(){
		System.out.println( "CATS GAME!")        ;
	}

	public static void computer_wins(){
		System.out.println( "Computer wins!  Again");
	}

	public static void player_wins(){
		System.out.println( "Human wins!  Impossible!");
	}


}

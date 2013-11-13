package com.mycompany.app;

import java.util.Scanner;


public class Interface {

	public static void main( String[] args )
	{
		Interface newInterface = new Interface();
		System.out.println("this workds");

	}
	public static void printBoard(String grid){

		System.out.println(grid.substring(0,3));
		System.out.println(grid.substring(3,6));
		System.out.println(grid.substring(6,9));
	}

	public static int getMove(){

	  	Scanner in = new Scanner(System.in);
	  	int move = in.nextInt();
//    	in.close();
    	return move;
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

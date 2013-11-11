package com.mycompany.app;

public class Interface {

	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		Interface newInterface = new Interface();
		newInterface.printBoard("------X--");
	}
	public static void printBoard(String board){
	
		System.out.println(board.substring(0,3));
		System.out.println(board.substring(3,6));
		System.out.println(board.substring(6,9));
	}

}

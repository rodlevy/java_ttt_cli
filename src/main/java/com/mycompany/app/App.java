package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        funny();
        Board newBoard = new Board();
        newBoard.printBoard();
    }

    public static void funny(){
    	System.out.println( "funny" );
    }


}

package com.mycompany.app;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Board newBoard = new Board();
        newBoard.grid = "-----XX--";
        Interface newInterface = new Interface();
        Computer newComputer = new Computer();
        
        Game newGame = new Game(newBoard, newInterface, newComputer);
        newGame.play();
    }

    public static void funny(){
    	System.out.println( "funniest" );
    }


}

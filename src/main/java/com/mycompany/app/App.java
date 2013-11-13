package com.mycompany.app;

public class App
{
    public static Game newGame;

    public static void main( String[] args )
    {
        initialize();
        newGame.play();
    }

    public static void initialize(){

        Board newBoard = new Board();
        Interface newInterface = new Interface();
        Computer newComputer = new Computer();
        newGame = new Game(newBoard, newInterface, newComputer);
        newBoard.grid = "---------";
        System.out.println( "Let's Play Tic-Tac-Toe\n" );
        System.out.println( "012\n345\n678" );
        System.out.println("Where do you want to put your X?\n");
    }


}

package com.mycompany.app;

public class Computer {

  public static void firstMove(Board board){
    if(board.isOccupied(board.grid, 4)){
      board.storePosition(0, 'O');
    }else{
      board.storePosition(4, 'O');
    }
  }

  public static void secondMove(Board board){
    if(board.oppositeCorners()){
      board.storePosition(3, 'O');
    }else if(board.leftCornerComputerBottomRtPlayer()){
      board.storePosition(2, 'O');
    }else if(!board.isOccupied(board.grid, 0)){
      board.storePosition(0,'O');
    }else{
      board.storePosition(8, 'O');
    }
  }

  public static void computerMove(Board board){
    int playerMoves = board.playerMoves();
    if(playerMoves == 1){firstMove(board);}

    board.checkParticipantWin(board.grid, 'O');
    if(board.computerMoves() < board.playerMoves()){
      board.checkParticipantWin(board.grid, 'X');
      if(board.computerMoves() < board.playerMoves()){
        if (board.playerMoves() == 2) {
          secondMove(board);
          return;
        }
        if (board.playerMoves() == 3 && board.edgeCase()){
          board.storePosition(6, 'O');
          return;
        }
        if (board.playerMoves() > board.computerMoves()){
          board.randomFill();
          return;
        }
      }
    }

  }

}

package com.mycompany.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

import org.junit.Before;
import org.junit.Test;


public class ComputerTest {
  Board board;
  
  @Before 
  public void initialize(){
    board = new Board();
  }
  
	@Test
	public void test_first_move() throws Exception {
		board.grid = "-X-------";
		Computer.firstMove(board);
		assertTrue(board.grid.equals("-X--O----"));
	}
	
	@Test
	public void test_second_move() throws Exception{
    board.grid = "X---O---X";
    Computer.secondMove(board);
    assertTrue(board.grid.equals("X--OO---X"));
	}
	
	@Test
	public void test_computer_move() throws Exception{
	  board.grid = "X---O---X";
	  Computer.computerMove(board);
	  assertTrue(board.grid.equals("X--OO---X"));
	}
	 @Test
	  public void test_another_second_computer_move() throws Exception{
	    board.grid = "XX--O----";
	    Computer.computerMove(board);
	    assertTrue(board.grid.equals("XXO-O----"));
	  }
	 @Test
	 public void test_third_computer_move() throws Exception{
	    board.grid = "X--OO--XX";
	    Computer.computerMove(board);
	    assertTrue(board.grid.equals("X--OOO-XX"));
	  }
}

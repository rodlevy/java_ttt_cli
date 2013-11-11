package com.mycompany.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

import org.junit.Test;


public class ComputerTest {
	@Test
	public void test_first_move() throws Exception {
		Board board = new Board();
		board.grid = "-X-------";
		Computer.firstMove(board);
		System.out.println(board.grid);
		assertTrue(board.grid.equals("-X--O----"));
	}
	
}

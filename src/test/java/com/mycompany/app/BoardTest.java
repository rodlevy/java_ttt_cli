package com.mycompany.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.asList;

import org.junit.Test;

public class BoardTest {
	@Test
	public void testWinningPossibilities() throws Exception {

		String winner = "012";
		assertTrue(Arrays.asList(Board.WINPOS).contains(winner));
	}
	
	@Test
	
	public void should_createNewGrid() throws Exception {
		assertEquals(Board.grid.length(), 9 );
	}
	
	@Test
	public void should_checkForWinner() throws Exception {
		char player = 'X';
		Board.grid = "XXX--OO-O";
		assertTrue(Board.checkForWinner(player));
	}
	
	@Test
	public void should_checkForTie() throws Exception {
		Board.grid = "OXOXXOOOX";
		assertTrue(Board.checkForTie());
	}
	
	@Test
	public void should_checkIfOccupied() throws Exception {
		String grid = "OX-XXOOOX";
		assertFalse(Board.isOccupied(grid, 2));
		assertTrue(Board.isOccupied(grid, 0));
	}
	
	@Test
	public void should_return_availableMoves() throws Exception{
		String grid = "OX-XXOO-X";
		List<Integer> returnedList = new ArrayList<Integer>(asList(2,7));
		assertTrue(Board.availableMoves(grid).equals(returnedList));
	}
	
	@Test
	public void players_should_take_turns() throws Exception{
		String player = "X";
		assertTrue(Board.take_turn(player).equals("O"));
	}
	@Test
	public void board_should_store_position_of_player_moves() throws Exception{
		int position = 2;
		char player = 'X';

		Board.grid = "X--------";
		Board.storePosition(position, player);
		assertTrue(Board.grid.equals("X-X------"));
	}
	
	
}

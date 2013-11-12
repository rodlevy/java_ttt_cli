package com.mycompany.app;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    assertTrue(Board.takeTurn(player).equals("O"));
  }
  @Test
  public void board_should_store_position_of_player_moves() throws Exception{
    int position = 2;
    char player = 'X';

    Board.grid = "X--------";
    Board.storePosition(position, player);
    assertTrue(Board.grid.equals("X-X------"));
  }

  @Test
  public void board_should_remove_position_of_player_moves() throws Exception{
    int position = 2;

    Board.grid = "X-X------";
    Board.removePosition(position);
    assertTrue(Board.grid.equals("X--------"));
  }

  @Test
  public void board_should_check_if_same_player_opposite_corners() throws Exception{
    Board.grid = "X-------X";
    assertTrue(Board.oppositeCorners());
  }

  @Test
  public void board_should_check_top_left_corner_computer_bottom_rt_player() throws Exception{
    Board.grid = "O-------X";
    assertTrue(Board.leftCornerComputerBottomRtPlayer());
  }

  @Test
  public void board_should_check_edge_case() throws Exception{
    Board.grid = "-X-X----X";
    assertTrue(Board.edgeCase());
  }


  @Test
  public void board_should_check_for_participant_win() throws Exception{
    Board.grid = "XX--O----";
    Board.checkParticipantWin(Board.grid, 'X');
    assertTrue(Board.grid.equals("XXO-O----"));
  }

  @Test
  public void board_should_return_the_number_of_player_moves() throws Exception{
    Board.grid = "XX--O----";
    assertTrue(Board.playerMoves().equals(2));
  }


}

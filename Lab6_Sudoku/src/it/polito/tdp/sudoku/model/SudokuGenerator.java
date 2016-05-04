package it.polito.tdp.sudoku.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SudokuGenerator {
	
	// source:
	// https://github.com/SomeKittens/Sudoku-Project/blob/master/SudokuGenerator.java

	public static final int BOARD_WIDTH = 9;
	public static final int BOARD_HEIGHT = 9;
	int[][] board;
	private List<String> posizioniVietate;
	
	/**
	 * Constructor. Resets board to zeros
	 */
	public SudokuGenerator() {
		board = new int[BOARD_WIDTH][BOARD_HEIGHT];
		posizioniVietate = new ArrayList<>();
	}

	/**
	 * Driver method for nextBoard.
	 * 
	 * @param difficult
	 *            the number of blank spaces to insert
	 * @return board, a partially completed 9x9 Sudoku board
	 */
	public int[][] nextBoard(int difficulty) {
		board = new int[BOARD_WIDTH][BOARD_HEIGHT];
		nextCell(0, 0);
		makeHoles(difficulty);
		return board;
	}

	/**
	 * Recursive method that attempts to place every number in a cell.
	 *
	 * @param x
	 *            x value of the current cell
	 * @param y
	 *            y value of the current cell
	 * @return true if the board completed legally, false if this cell has no
	 *         legal solutions.
	 */
	public boolean nextCell(int x, int y) {
		int nextX = x;
		int nextY = y;
		int[] toCheck = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Random r = new Random();
		int tmp = 0;
		int current = 0;
		int top = toCheck.length;

		for (int i = top - 1; i > 0; i--) {
			current = r.nextInt(i);
			tmp = toCheck[current];
			toCheck[current] = toCheck[i];
			toCheck[i] = tmp;
		}

		for (int i = 0; i < toCheck.length; i++) {
			if (legalMove(x, y, toCheck[i])) {
				board[x][y] = toCheck[i];
				if (x == 8) {
					if (y == 8)
						return true;// We're done! Yay!
					else {
						nextX = 0;
						nextY = y + 1;
					}
				} else {
					nextX = x + 1;
				}
				if (nextCell(nextX, nextY))
					return true;
			}
		}
		board[x][y] = 0;
		return false;
	}

	/**
	 * Given a cell's coordinates and a possible number for that cell, determine
	 * if that number can be inserted into said cell legally.
	 *
	 * @param x
	 *            x value of cell
	 * @param y
	 *            y value of cell
	 * @param current
	 *            The value to check in said cell.
	 * @return True if current is legal, false otherwise.
	 */
	private boolean legalMove(int x, int y, int current) {
		for (int i = 0; i < 9; i++) {
			if (current == board[x][i])
				return false;
		}
		for (int i = 0; i < 9; i++) {
			if (current == board[i][y])
				return false;
		}
		int cornerX = 0;
		int cornerY = 0;
		if (x > 2)
			if (x > 5)
				cornerX = 6;
			else
				cornerX = 3;
		if (y > 2)
			if (y > 5)
				cornerY = 6;
			else
				cornerY = 3;
		for (int i = cornerX; i < 10 && i < cornerX + 3; i++)
			for (int j = cornerY; j < 10 && j < cornerY + 3; j++)
				if (current == board[i][j])
					return false;
		return true;
	}

	/**
	 * Given a completed board, replace a given amount of cells with 0s (to
	 * represent blanks)
	 * 
	 * @param holesToMake
	 *            How many 0s to put in the board.
	 */
	public void makeHoles(int holesToMake) {
		/*
		 * We define difficulty as follows: Easy: 32+ clues (49 or fewer holes)
		 * Medium: 27-31 clues (50-54 holes) Hard: 26 or fewer clues (54+ holes)
		 * This is human difficulty, not algorighmically (though there is some
		 * correlation)
		 */
		double remainingSquares = 81;
		double remainingHoles = (double) holesToMake;

		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++) {
				double holeChance = remainingHoles / remainingSquares;
				if (Math.random() <= holeChance) {
					board[i][j] = 0;
					remainingHoles--;
				}
				remainingSquares--;
			}
	}
	
	public int[][] solution(){
		for(int i=0; i<BOARD_WIDTH; i++){
			for(int j=0; j<BOARD_HEIGHT; j++){
				if(board[i][j]!=0)
					posizioniVietate.add(i+"-"+j);
			}
		}
		this.run(0, 0, 0);
		return board;
	}
	
	public boolean checkOk(int r, int c){
		String s = r+"-"+c;
		for(String temp:posizioniVietate){
			if(s.compareTo(temp)==0)
				return false;
		}
		return true;
	}
	
	
	public boolean isComplete(){
		int count=0;
		for(int i=0; i<BOARD_WIDTH; i++){
			for(int j=0; j<BOARD_HEIGHT; j++){
				if(board[i][j]!=0)
					count++;
			}
		}
		if(count==81)
			return true;
		return false;
	}
	
	public void run(int riga, int colonna, int taboo){
		if(this.isComplete())
			return;
		if(this.checkOk(riga, colonna)){
			if(taboo>0)
				board[riga][colonna] = 0;
			for(int i=taboo+1; i<10; i++){
				if(this.legalMove(riga, colonna, i)){
					board[riga][colonna] = i;
					System.out.println(riga+"-"+colonna+"  numero "+i);
					if(colonna<BOARD_HEIGHT-1){
						run(riga, colonna+1, 0);
					}
					else if(riga<BOARD_WIDTH-1){
						run(riga+1, 0, 0);
					}
				}
			}
			if(board[riga][colonna]==0 || board[riga][colonna]==taboo){
				if(colonna==0 && riga>0){
						int temp = board[riga-1][BOARD_HEIGHT-1];
						run(riga-1, BOARD_HEIGHT-1, temp);
					}			
				else{
						int temp = board[riga][colonna-1];
						run(riga, colonna-1, temp);
					}					
			}	
		}
		else if(taboo==0){
			if(colonna<BOARD_HEIGHT-1)
				run(riga, colonna+1, 0);
			else if(riga<BOARD_WIDTH-1)
				run(riga+1, 0, 0);
		}
		else {
			if(colonna==0 && riga>0){
				int temp = board[riga-1][BOARD_HEIGHT-1];
				run(riga-1,  BOARD_HEIGHT-1, temp);
			}
			else if(colonna>0){
				int temp = board[riga][colonna-1];
				run(riga, colonna-1, temp);
			}
		}		
	}
	
}

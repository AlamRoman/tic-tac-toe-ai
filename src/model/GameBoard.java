package model;

public class GameBoard {

	private char[][] board;
	
	public GameBoard() {
		board = new char[3][3];
	}
	
	public char getCell(int row, int col) {
		return board[row][col];
	}
	
	public void setCell(char value, int row, int col) {
		board[row][col] = value;
	}
	
	public void clearBoard() {
		board = new char[3][3];
	}
}

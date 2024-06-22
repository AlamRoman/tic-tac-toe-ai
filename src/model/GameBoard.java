package model;

public class GameBoard {

	private char[][] board;
	private boolean pleyersTurn;
	
	public GameBoard() {
		board = new char[3][3];
		pleyersTurn = true;
	}
	
	public char getCell(int row, int col) {
		return board[row][col];
	}
	
	public void setCell(char value, int row, int col) {
		board[row][col] = value;
	}
	
	public void playMove(int row, int col) {
		if (pleyersTurn) {
			setCell('X', row, col);
			pleyersTurn = false;
		}else {
			setCell('O', row, col);
			pleyersTurn = true;
		}
		
		System.out.println(board.toString());
	}
	
	public void clearBoard() {
		board = new char[3][3];
	}
	
}

package model;

public class GameBoard {

	private String[][] board;
	private boolean pleyersTurn;
	private boolean isGameFinished;
	private Minimax minimax;
	
	public GameBoard() {
		board = new String[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = "";
			}
		}
		
		minimax = new Minimax();
		
		pleyersTurn = true;
		isGameFinished = true;
	}
	
	public String getCell(int row, int col) {
		return board[row][col];
	}
	
	public void setCell(String value, int row, int col) {
		board[row][col] = value;
	}
	
	public void pleyerMove(int row, int col) {
		setCell("X", row, col);
		pleyersTurn = false;
		
		computerMove();
	}
	
	private void computerMove() {
		Move move = minimax.bestMove(board);
		
		if (move!=null) {
			setCell("O", move.getRow(), move.getCol());
			pleyersTurn = true;
		}
	}
	
	public void clearBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = "";
			}
		}
	}
	
	public String[][] getBoard() {
		return board;
	}

	public boolean isGameFinished() {
		return isGameFinished;
	}

	public void setGameFinished(boolean isGameFinished) {
		this.isGameFinished = isGameFinished;
	}
	
	
}

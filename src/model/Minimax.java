package model;

public class Minimax {
	
	public Move bestMove(String[][] board) {
		
		int bestScore = Integer.MIN_VALUE;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j].equalsIgnoreCase("")) {
					return new Move(i, j);
				}
			}
		}
		
		return null;
	}
}

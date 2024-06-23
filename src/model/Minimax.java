package model;

public class Minimax {
	
	public Move bestMove(String[][] board) {
		
		String[][] b = new String[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = board[i][j];
			}
		}
		
		int bestScore = Integer.MAX_VALUE;
		Move bestMove = null;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (b[i][j].equalsIgnoreCase("")) {
					b[i][j] = "O";
					
					int score = minimax(b, 0, true);
					
					if (score < bestScore) {
						bestScore = score;
						
						bestMove = new Move(i, j);
					}
					
					b[i][j] = "";
				}
			}
		}
		
		return bestMove;
	}
	
	private int minimax(String[][] b, int depth, boolean isMaximizing) {
		Integer winner = wincheck(b);
		
		if (winner != null) {
			
			if (winner == 1) {
				//maximizer win
				return 10 - depth;
			}else if(winner == -1) {
				//minimizer win
				return -10 + depth;
			}else {
				//draw
				return 0;
			}
			
			
		}
		
		/*
		 * for an easy game
		 * 
		if (depth >= 1) {
			return 0;
		}
		*/
		
		if (isMaximizing) {
			
			int bestScore = Integer.MIN_VALUE;
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (b[i][j].equalsIgnoreCase("")) {
						b[i][j] = "X";
						
						int score = minimax(b, depth + 1, false);
						
						bestScore = Math.max(score, bestScore);
						
						b[i][j] = "";
					}
				}
			}
			
			return bestScore;
			
		}else {
			int bestScore = Integer.MAX_VALUE;
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (b[i][j].equalsIgnoreCase("")) {
						b[i][j] = "O";
						
						int score = minimax(b, depth + 1, true);
						
						bestScore = Math.min(score, bestScore);
						
						b[i][j] = "";
					}
				}
			}
			
			return bestScore;
		}
	}
	
	public Integer wincheck(String[][] board) {
		int size = board.length;

        // Check rows
        for (int i = 0; i < size; i++) {
            if (!board[i][0].equals("") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                
                if (board[i][0].equalsIgnoreCase("X")) {
					return 1;
				}else {
					return -1;
				}
            }
        }

        // Check columns
        for (int i = 0; i < size; i++) {
            if (!board[0][i].equals("") && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
            	if (board[0][i].equalsIgnoreCase("X")) {
					return 1;
				}else {
					return -1;
				}
            }
        }

        // Check diagonal (top-left to bottom-right)
        if (!board[0][0].equals("") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
        	if (board[0][0].equalsIgnoreCase("X")) {
				return 1;
			}else {
				return -1;
			}

        }

        // Check diagonal (top-right to bottom-left)
        if (!board[0][2].equals("") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
        	if (board[0][2].equalsIgnoreCase("X")) {
				return 1;
			}else {
				return -1;
			}
        }
        
        //check for draw
        for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (board[i][j].equalsIgnoreCase("")) {
					//not draw
					return null;
				}
			}
		}
        
        //draw
        return 0;
       
	}
}

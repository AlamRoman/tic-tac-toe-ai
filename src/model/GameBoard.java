package model;

public class GameBoard {

	private String[][] board;
	private boolean computersTurnFirst;
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
		
		computersTurnFirst = false;
		isGameFinished = false;
	}
	
	public String getCell(int row, int col) {
		return board[row][col];
	}
	
	public void setCell(String value, int row, int col) {
		if (!isGameFinished) {
			board[row][col] = value;
		}
	}
	
	public void playerMove(int row, int col) {
		setCell("X", row, col);
	}
	
	public void computerMove() {
		Move move = minimax.bestMove(board);
		
		if (move!=null) {
			setCell("O", move.getRow(), move.getCol());
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
	
	public Integer wincheck() {
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

	public boolean isComputersTurnFirst() {
		return computersTurnFirst;
	}

	public void setComputersTurnFirst(boolean computersTurnFirst) {
		this.computersTurnFirst = computersTurnFirst;
	}

	

}

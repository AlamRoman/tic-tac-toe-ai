package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GameBoard;
import model.Score;
import view.MyPanel;

public class Controller implements ActionListener{
	private MyPanel panel;
	private GameBoard gameBoard;
	private Score score;
	
	public Controller(MyPanel panel, GameBoard gameBoard, Score score) {
		this.panel = panel;
		this.gameBoard = gameBoard;
		this.score = score;
		
		panel.addListenerToButtons(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		
		
		if (e.getActionCommand().contains("btn")) {
			if (e.getActionCommand().equalsIgnoreCase("btn1")) {
				playerMove(0, 0);
			}else if (e.getActionCommand().equalsIgnoreCase("btn2")) {
				playerMove(0, 1);
			}else if (e.getActionCommand().equalsIgnoreCase("btn3")) {
				playerMove(0, 2);
			}else if (e.getActionCommand().equalsIgnoreCase("btn4")) {
				playerMove(1, 0);
			}else if (e.getActionCommand().equalsIgnoreCase("btn5")) {
				playerMove(1, 1);
			}else if (e.getActionCommand().equalsIgnoreCase("btn6")) {
				playerMove(1, 2);
			}else if (e.getActionCommand().equalsIgnoreCase("btn7")) {
				playerMove(2, 0);
			}else if (e.getActionCommand().equalsIgnoreCase("btn8")) {
				playerMove(2, 1);
			}else if (e.getActionCommand().equalsIgnoreCase("btn9")) {
				playerMove(2, 2);
			}
		}
	
		if (e.getActionCommand().equalsIgnoreCase("playAgain")) {
			if (gameBoard.isGameFinished()) {
				newGame();
			}
		}
		
		panel.updateButtons(gameBoard.getBoard());
	}
	
	private void playerMove(int r, int c) {
		
		Integer winner;
			
		boolean validMove = gameBoard.playerMove(r, c);
		
		if (!validMove) {
			return;
		}
		
		winner = gameBoard.wincheck();
		
		if (winner != null) {
			gameBoard.setGameFinished(true);
			panel.disableButtons();
			panel.showWinMessage(winner);
			
			updateScore(winner);
			
			return;
		}
		
		gameBoard.computerMove();
		
		winner = gameBoard.wincheck();
		
		if (winner != null) {
			gameBoard.setGameFinished(true);
			panel.disableButtons();
			panel.showWinMessage(winner);
			
			updateScore(winner);
		}
			
	}
	
	private void newGame() {
		gameBoard.clearBoard();
		gameBoard.setGameFinished(false);
		gameBoard.setMove_count(0);
		panel.clearWinMessage();
		panel.enableButtons();
		
		gameBoard.setComputersTurnFirst(!gameBoard.isComputersTurnFirst());
		
		if (gameBoard.isComputersTurnFirst()) {
			gameBoard.computerMove();
		}
	}
	
	private void updateScore(int winner) {
		
		if (winner == 1) {
			score.incrementScoreX();
			panel.setScoreO(score.getScoreX());
		}else if (winner == -1) {
			score.incrementScoreO();
			panel.setScoreO(score.getScoreO());
		}else {
			score.incrementDrawCount();
			panel.setDrawCount(score.getDrawCount());
		}
	}
}

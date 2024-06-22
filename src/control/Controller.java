package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.GameBoard;
import view.MyPanel;

public class Controller implements ActionListener{
	private MyPanel panel;
	private GameBoard gameBoard;
	
	public Controller(MyPanel panel, GameBoard gameBoard) {
		this.panel = panel;
		this.gameBoard = gameBoard;
		
		panel.addListenerToButtons(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		ArrayList<String> btnsActionCommands = panel.getButtonsActionCommand();
		
		for (int i = 0; i < btnsActionCommands.size(); i++) {
			
			if (e.getActionCommand().equalsIgnoreCase(btnsActionCommands.get(i))) {
				
			}
		}
		*/
		
		if (e.getActionCommand().equalsIgnoreCase("btn1")) {
			gameBoard.pleyerMove(0, 0);
		}else if (e.getActionCommand().equalsIgnoreCase("btn2")) {
			gameBoard.pleyerMove(0, 1);
		}else if (e.getActionCommand().equalsIgnoreCase("btn3")) {
			gameBoard.pleyerMove(0, 2);
		}else if (e.getActionCommand().equalsIgnoreCase("btn4")) {
			gameBoard.pleyerMove(1, 0);
		}else if (e.getActionCommand().equalsIgnoreCase("btn5")) {
			gameBoard.pleyerMove(1, 1);
		}else if (e.getActionCommand().equalsIgnoreCase("btn6")) {
			gameBoard.pleyerMove(1, 2);
		}else if (e.getActionCommand().equalsIgnoreCase("btn7")) {
			gameBoard.pleyerMove(2, 0);
		}else if (e.getActionCommand().equalsIgnoreCase("btn8")) {
			gameBoard.pleyerMove(2, 1);
		}else if (e.getActionCommand().equalsIgnoreCase("btn9")) {
			gameBoard.pleyerMove(2, 2);
		}
		
		if (e.getActionCommand().equalsIgnoreCase("playAgain")) {
			if (gameBoard.isGameFinished()) {
				gameBoard.clearBoard();
			}
		}
		
		panel.updateButtons(gameBoard.getBoard());
	}
	
	
}

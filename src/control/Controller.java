package control;

import model.GameBoard;
import view.MyPanel;

public class Controller {
	private MyPanel panel;
	private GameBoard gameBoard;
	
	public Controller(MyPanel panel, GameBoard gameBoard) {
		this.panel = panel;
		this.gameBoard = gameBoard;
	}
	
	
}

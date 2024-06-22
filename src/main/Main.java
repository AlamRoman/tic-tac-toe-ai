package main;

import control.Controller;
import model.GameBoard;
import view.MyFrame;

public class Main {
	public static void main(String[] args) {
		GameBoard gameBoard = new GameBoard();
		MyFrame frame = new MyFrame();
		
		Controller controller = new Controller(frame.getContentPane(), gameBoard);
	}
}

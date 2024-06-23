package main;

import control.Controller;
import model.GameBoard;
import model.Score;
import view.MyFrame;

public class Main {
	public static void main(String[] args) {
		GameBoard gameBoard = new GameBoard();
		Score score = Score.getInstance();
		MyFrame frame = new MyFrame();
		
		Controller controller = new Controller(frame.getContentPane(), gameBoard, score);
	}
}

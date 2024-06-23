package view;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import control.Controller;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;


public class MyPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton[][] buttons;
	private JButton btnPlayAgain;
	private JLabel lblmsg;
	private JLabel lblScoreX;
	private JLabel lblScoreO;
	private JLabel lblDrawCount;
	
	public MyPanel() {
		setLayout(null);
		
		//button panel
		JPanel panel = new JPanel();
		panel.setBounds(26, 26, 430, 430);
		add(panel);
		panel.setLayout(new GridLayout(3,3));
		
		buttons = new JButton[3][3];
		
		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Arial Black", Font.BOLD, 80));
		panel.add(btn1);
		btn1.setActionCommand("btn1");
		buttons[0][0] = btn1;
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Arial Black", Font.BOLD, 80));
		panel.add(btn2);
		btn2.setActionCommand("btn2");
		buttons[0][1] = btn2;
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Arial Black", Font.BOLD, 80));
		panel.add(btn3);
		btn3.setActionCommand("btn3");
		buttons[0][2] = btn3;
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Arial Black", Font.BOLD, 80));
		panel.add(btn4);
		btn4.setActionCommand("btn4");
		buttons[1][0] = btn4;
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Arial Black", Font.BOLD, 80));
		panel.add(btn5);
		btn5.setActionCommand("btn5");
		buttons[1][1] = btn5;
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Arial Black", Font.BOLD, 80));
		panel.add(btn6);
		btn6.setActionCommand("btn6");
		buttons[1][2] = btn6;
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Arial Black", Font.BOLD, 80));
		panel.add(btn7);
		btn7.setActionCommand("btn7");
		buttons[2][0] = btn7;
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Arial Black", Font.BOLD, 80));
		panel.add(btn8);
		btn8.setActionCommand("btn8");
		buttons[2][1] = btn8;
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Arial Black", Font.BOLD, 80));
		panel.add(btn9);
		btn9.setActionCommand("btn9");
		buttons[2][2] = btn9;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j].setFocusable(false);
				buttons[i][j].setBackground(Color.WHITE);
			}
		}
		
		//score panel
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(507, 151, 200, 150);
		add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(100, 0, 19, 125);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 40, 200, 13);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(19, 8, 65, 23);
		panel_1.add(lblNewLabel);
		
		JLabel lblO = new JLabel("O");
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblO.setBounds(116, 9, 65, 23);
		panel_1.add(lblO);
		
		lblScoreX = new JLabel("00");
		lblScoreX.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreX.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblScoreX.setBounds(0, 61, 98, 23);
		panel_1.add(lblScoreX);
		
		lblScoreO = new JLabel("00");
		lblScoreO.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreO.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblScoreO.setBounds(100, 61, 100, 23);
		panel_1.add(lblScoreO);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 125, 200, 13);
		panel_1.add(separator_1_1);
		
		lblDrawCount = new JLabel("Draw : 00");
		lblDrawCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrawCount.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrawCount.setBounds(0, 125, 200, 25);
		panel_1.add(lblDrawCount);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(0, 1, 200, 13);
		panel_1.add(separator_1_2);
		
		//play again button
		btnPlayAgain = new JButton("Play again");
		btnPlayAgain.setBounds(547, 361, 123, 40);
		btnPlayAgain.setActionCommand("playAgain");
		btnPlayAgain.setFocusable(false);
		add(btnPlayAgain);
		
		lblmsg = new JLabel("");
		lblmsg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblmsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblmsg.setBounds(507, 49, 200, 40);
		add(lblmsg);

	}
	
	public void addListenerToButtons(Controller controller) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j].addActionListener(controller);
			}
		}
		btnPlayAgain.addActionListener(controller);
	}
	
	public void updateButtons(String[][] board) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j].setText(board[i][j]+"");
			}
		}
	}
	
	public ArrayList<String> getButtonsActionCommand(){
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				list.add(buttons[i][j].getActionCommand());
			}
		}
		
		return list;
	}
	
	public void showWinMessage(int winner) {
		if (winner == 1) {
			lblmsg.setText("You won");
		}else if(winner == -1){
			lblmsg.setText("Computer won");
		}else if(winner == 0){
			lblmsg.setText("The game is draw");
		}
	}
	
	public void clearWinMessage() {
		lblmsg.setText("");
	}
	
	public void disableButtons() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j].setEnabled(false);
			}
		}
	}
	
	public void enableButtons() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j].setEnabled(true);
			}
		}
	}
	
	public void setScoreX(int score) {
		DecimalFormat formatter = new DecimalFormat("00");
		lblScoreX.setText(formatter.format(score)+"");
	}
	
	public void setScoreO(int score) {
		DecimalFormat formatter = new DecimalFormat("00");
		lblScoreO.setText(formatter.format(score)+"");
	}
	
	public void setDrawCount(int count) {
		DecimalFormat formatter = new DecimalFormat("00");
		lblDrawCount.setText("Draw : " + formatter.format(count));
	}
}

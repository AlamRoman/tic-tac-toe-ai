package view;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import control.Controller;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JRadioButton;

public class MyPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	ArrayList<JButton> buttons;
	
	public MyPanel() {
		setLayout(null);
		
		//button panel
		JPanel panel = new JPanel();
		panel.setBounds(26, 26, 430, 430);
		add(panel);
		panel.setLayout(new GridLayout(3,3));
		
		buttons = new ArrayList<JButton>();
		
		JButton btn1 = new JButton("X");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel.add(btn1);
		btn1.setActionCommand("btn1");
		buttons.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel.add(btn2);
		btn2.setActionCommand("btn2");
		buttons.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel.add(btn3);
		btn3.setActionCommand("btn3");
		buttons.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel.add(btn4);
		btn4.setActionCommand("btn4");
		buttons.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel.add(btn5);
		btn5.setActionCommand("btn5");
		buttons.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel.add(btn6);
		btn6.setActionCommand("btn6");
		buttons.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel.add(btn7);
		btn7.setActionCommand("btn7");
		buttons.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel.add(btn8);
		btn8.setActionCommand("btn8");
		buttons.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel.add(btn9);
		btn9.setActionCommand("btn9");
		buttons.add(btn9);
		
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setFocusable(false);
		}
		
		//score panel
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(507, 112, 200, 150);
		add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(100, 0, 19, 150);
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
		
		JLabel lblNewLabel_2 = new JLabel("00");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(19, 81, 65, 23);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("00");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(116, 81, 65, 23);
		panel_1.add(lblNewLabel_3);
		
		//play again button
		JButton btnNewButton = new JButton("Play again");
		btnNewButton.setBounds(569, 332, 79, 19);
		add(btnNewButton);

	}
	
	public void addListenerToButtons(Controller controller) {
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).addActionListener(controller);
		}
	}
	
	public ArrayList<String> getButtonsActionCommand(){
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < buttons.size(); i++) {
			list.add(buttons.get(i).getActionCommand());
		}
		
		return list;
	}
}

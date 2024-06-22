package view;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public MyPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 44, 430, 430);
		add(panel);

	}
}

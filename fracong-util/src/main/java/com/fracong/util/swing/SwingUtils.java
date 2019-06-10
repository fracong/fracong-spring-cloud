package com.fracong.util.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwingUtils {
	
	public static void test() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createAndShowGUI();
			}
		});
	}

	protected static void createAndShowGUI() {
		JFrame frame = new JFrame("login");
		frame.setSize(450, 300);
		frame.setLocationRelativeTo(null);
		frame.dispose();
		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);
		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {
		panel.setLayout(null);
		JLabel userLabel = new JLabel("user:");
		userLabel.setBounds(30,20,80,25);
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        
        JLabel passwordLabel = new JLabel("password:");
        passwordLabel.setBounds(30,50,80,25);
        panel.add(passwordLabel);
        
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
        
        JButton loginButton = new JButton("login");
        loginButton.setBounds(100, 100, 80, 25);
        panel.add(loginButton);
	}
}

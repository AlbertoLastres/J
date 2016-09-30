package CalculadoraConBorder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraConBorder {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraConBorder window = new CalculadoraConBorder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculadoraConBorder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 272, 258);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		
		JButton btnNewButton_8 = new JButton("1");
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton = new JButton("2");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_10 = new JButton("3");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("4");
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("5");
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("6");
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_12 = new JButton("7");
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_15 = new JButton("8");
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_9 = new JButton("9");
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_16 = new JButton("0");
		btnNewButton_16.setToolTipText("");
		panel_1.add(btnNewButton_16);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton btnNewButton_2 = new JButton("+");
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("-");
		panel_3.add(btnNewButton_4);
		
		JButton btnX = new JButton("*");
		panel_3.add(btnX);
		
		JButton button = new JButton("/");
		panel_3.add(button);
		
		JButton button_1 = new JButton("=");
		panel_3.add(button_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		textField.setText("0");
		frame.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
	}

}

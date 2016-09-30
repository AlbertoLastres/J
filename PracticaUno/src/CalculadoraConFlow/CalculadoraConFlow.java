package CalculadoraConFlow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CalculadoraConFlow {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraConFlow window = new CalculadoraConFlow();
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
	public CalculadoraConFlow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Inicializacion del Frame donde va la calculadora.
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 209);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//Lista con todos los botones añadidos por orden en el FlowLayout
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("2");
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("6");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1 = new JButton("9");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_9);
		
		//Campo de texto del resultado de la operación
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 49));
		frame.getContentPane().add(textField);
		textField.setColumns(9);
		
		
		//Botones de operaciones
		JButton button_1 = new JButton("+");
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(button_2);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(btnX);
		
		JButton button_3 = new JButton("/");
		button_3.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(button_3);
		
		JButton button = new JButton("=");
		button.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		frame.getContentPane().add(button);
	}

}

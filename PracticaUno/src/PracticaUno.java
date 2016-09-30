import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.FlowLayout;

public class PracticaUno {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PracticaUno window = new PracticaUno();
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
	public PracticaUno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Esto inicia la interfaz, establece el fondo a negro, y con el exit_on_close se cierra la aplicación dandole a la X.
		frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 321, 236);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		//Esto crea el panel donde está ubicado el resultado, de color amarillo en el fondo.
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		//Esto crea campo de texto donde debería ir el resultado de las operaciones
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setAlignmentX(Component.LEFT_ALIGNMENT);
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 42));
		textField.setText("0");
		panel.add(textField);
		textField.setColumns(4);
		
		//Esto crea un jpanel con gridlayout, en el cual irán todos los botones integrados, y es de color gris :D
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		frame.getContentPane().add(panel_1);
		
		//El 4 y el 3 hacen referencia a las filas y columnas.
		panel_1.setLayout(new GridLayout(4, 3, 0, 0));
		
		
		//Todos los JButton de la calculadora:
		JButton button = new JButton("1");
		button.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(button);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_11 = new JButton("X");
		btnNewButton_11.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_3);
		
		JButton button_1 = new JButton("5");
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(button_1);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("/");
		btnNewButton_8.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_5 = new JButton("C");
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("=");
		btnNewButton_12.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(btnNewButton_12);
		
		
		JButton button_2 = new JButton("+");
		button_2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		panel_1.add(button_2);
		
		//El action listener ha sido creado causa de hacer doble click en el botón, creo.
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}

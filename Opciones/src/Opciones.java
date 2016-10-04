import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Opciones {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opciones window = new Opciones();
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
	public Opciones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 191, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Error");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡¡Debes introducir todos los campos!!", "Error de entrada", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnNewButton.setBounds(47, 62, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object [] textoOpciones = {"Si adelante", "Ahora no", "Login"};
				int opcion = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Titulo",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						textoOpciones,
						textoOpciones[0]);
				if (opcion == 2) {
					Login l = new Login();
					
					//JFrame framedellogin = 1.getframe();
					//framedellogin.setvisible(true);
				}
			}
		});
		btnNewButton_1.setBounds(47, 94, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login loguear = new Login();
					if (JOptionPane.showConfirmDialog(frame, loguear, "Valor", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)==0) {
						System.out.println("Has pulsado aceptar");
						
					}
						else {
							System.out.println("Has pulsado cancelar");
						
						
						
					}
			}
		});
		btnNewButton_2.setBounds(47, 128, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Principal {

	private JFrame frmMiProgramaDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmMiProgramaDe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiProgramaDe = new JFrame();
		frmMiProgramaDe.setTitle("Mi programa de prueba");
		frmMiProgramaDe.setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/alberto/Desktop/photo_2016-09-23_09-41-52.jpg"));
		frmMiProgramaDe.setBounds(100, 100, 450, 450);
		frmMiProgramaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiProgramaDe.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(281, 373, 117, 29);
		frmMiProgramaDe.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxSoyUnTextbox = new JCheckBox("Recuerda mi respuesta");
		chckbxSoyUnTextbox.setSelected(true);
		chckbxSoyUnTextbox.setBounds(88, 316, 230, 23);
		frmMiProgramaDe.getContentPane().add(chckbxSoyUnTextbox);
		
		JLabel lblNewLabel = new JLabel("Texto");
		lblNewLabel.setBounds(25, 200, 250, 16);
		frmMiProgramaDe.getContentPane().add(lblNewLabel);
		
		
		//! Primero panel
		JPanel panel = new JPanel();
		panel.setBounds(62, 228, 99, 58);
		frmMiProgramaDe.getContentPane().add(panel);
		
		//2 Crear group
		ButtonGroup group = new ButtonGroup();
		JRadioButton uno = new JRadioButton("Si");
		uno.setSelected(true);
		uno.setHorizontalAlignment(SwingConstants.LEFT);
		JRadioButton dos = new JRadioButton("No");
		dos.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		//3 Añadir al grupo
		group.add(uno);
		group.add(dos);
		
		//4 Añadir radiobuttom al panel
		panel.add(uno);
		panel.add(dos);
		
		
		//5 Añadir panel al frame
		frmMiProgramaDe.getContentPane().add(panel);
		
	
		
	}
}

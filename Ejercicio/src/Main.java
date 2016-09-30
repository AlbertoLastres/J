import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Main {

	private JFrame frmTestDuCadre;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmTestDuCadre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTestDuCadre = new JFrame();
		frmTestDuCadre.setTitle("Test du cadre de salut");
		frmTestDuCadre.setBounds(100, 100, 349, 300);
		frmTestDuCadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTestDuCadre.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(347, 6, -138, 296);
		frmTestDuCadre.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel.setBounds(19, 17, 61, 16);
		frmTestDuCadre.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		Border border1 = BorderFactory.createLineBorder(Color.GRAY);
		textField.setBorder(BorderFactory.createCompoundBorder(border1, 
		            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		textField.setBounds(19, 36, 213, 28);
		frmTestDuCadre.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Prénom");
		lblPrnom.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblPrnom.setBounds(19, 66, 61, 16);
		frmTestDuCadre.getContentPane().add(lblPrnom);
		
		textField_1 = new JTextField();
		Border border2 = BorderFactory.createLineBorder(Color.GRAY);
		textField_1.setBorder(BorderFactory.createCompoundBorder(border2, 
		            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		textField_1.setColumns(10);
		textField_1.setBounds(19, 84, 213, 28);
		frmTestDuCadre.getContentPane().add(textField_1);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblAdresse.setBounds(19, 114, 61, 16);
		frmTestDuCadre.getContentPane().add(lblAdresse);
		
		JLabel lblSexe = new JLabel("Sexe");
		lblSexe.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSexe.setBounds(19, 202, 61, 16);
		frmTestDuCadre.getContentPane().add(lblSexe);
		
		JRadioButton rdbtnHomme = new JRadioButton("Homme");
		rdbtnHomme.setSelected(true);
		buttonGroup.add(rdbtnHomme);
		rdbtnHomme.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		rdbtnHomme.setBounds(56, 202, 84, 23);
		frmTestDuCadre.getContentPane().add(rdbtnHomme);
		
		JRadioButton rdbtnFemme = new JRadioButton("Femme");
		buttonGroup.add(rdbtnFemme);
		rdbtnFemme.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		rdbtnFemme.setBounds(148, 202, 84, 23);
		frmTestDuCadre.getContentPane().add(rdbtnFemme);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton.setBounds(56, 227, 117, 29);
		frmTestDuCadre.getContentPane().add(btnNewButton);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnAnnuler.setBounds(172, 227, 117, 29);
		frmTestDuCadre.getContentPane().add(btnAnnuler);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		Border border3 = BorderFactory.createLineBorder(Color.GRAY);
		textArea.setBorder(BorderFactory.createCompoundBorder(border3, 
		            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		textField_1.setColumns(10);
		textArea.setBounds(19, 132, 213, 68);
		frmTestDuCadre.getContentPane().add(textArea);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Squash");
		chckbxNewCheckBox.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxNewCheckBox.setBounds(229, 38, 128, 23);
		frmTestDuCadre.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxTennis = new JCheckBox("Tennis");
		chckbxTennis.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxTennis.setBounds(229, 17, 128, 23);
		frmTestDuCadre.getContentPane().add(chckbxTennis);
		
		JCheckBox chckbxNatation = new JCheckBox("Natation");
		chckbxNatation.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxNatation.setBounds(229, 59, 128, 23);
		frmTestDuCadre.getContentPane().add(chckbxNatation);
		
		JCheckBox chckbxAthletisme = new JCheckBox("Athletisme");
		chckbxAthletisme.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxAthletisme.setBounds(229, 80, 128, 23);
		frmTestDuCadre.getContentPane().add(chckbxAthletisme);
		
		JCheckBox chckbxRandonnee = new JCheckBox("Randonnee");
		chckbxRandonnee.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxRandonnee.setBounds(229, 101, 128, 23);
		frmTestDuCadre.getContentPane().add(chckbxRandonnee);
		
		JCheckBox chckbxFoot = new JCheckBox("Foot");
		chckbxFoot.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxFoot.setBounds(229, 122, 128, 23);
		frmTestDuCadre.getContentPane().add(chckbxFoot);
		
		JCheckBox chckbxBasket = new JCheckBox("Basket");
		chckbxBasket.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxBasket.setBounds(229, 143, 128, 23);
		frmTestDuCadre.getContentPane().add(chckbxBasket);
		
		JCheckBox chckbxVolley = new JCheckBox("Volley");
		chckbxVolley.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxVolley.setBounds(229, 164, 128, 23);
		frmTestDuCadre.getContentPane().add(chckbxVolley);
		
		JCheckBox chckbxPetanque = new JCheckBox("Petanque");
		chckbxPetanque.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		chckbxPetanque.setBounds(229, 185, 128, 23);
		frmTestDuCadre.getContentPane().add(chckbxPetanque);
	}
}

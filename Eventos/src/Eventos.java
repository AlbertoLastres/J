import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Eventos {

	private JFrame frame;
	private JTextField blanco;
	private JTextField blanco2;
	private JTextField blanco3;
	private JTextField blanco4;
	private JList list;
	private JTextField blanco5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eventos window = new Eventos();
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
	public Eventos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Todo lo que escriba aqui dentro ocurrira al pulsar el botón.
				if(blanco.getText().isEmpty()) {
				blanco.setText("Pulsado");
				}
				else {
					blanco.setText("");
				}
			}
		});
		btnNewButton.setBounds(17, 27, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		blanco = new JTextField();
		blanco.setBounds(136, 26, 134, 28);
		frame.getContentPane().add(blanco);
		blanco.setColumns(10);
		
		blanco2 = new JTextField();
		blanco2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Este evento se implementa cuando de intro en blanco2
				blanco3.setText("Hola");
			}
		});
		blanco2.setBounds(27, 68, 134, 28);
		frame.getContentPane().add(blanco2);
		blanco2.setColumns(10);
		
		blanco3 = new JTextField();
		blanco3.setBounds(173, 66, 134, 28);
		frame.getContentPane().add(blanco3);
		blanco3.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//Al seleccionar un elemento del combo se genera este evento
				
				//convertir int to string
				
				String valorSeleccionado = String.valueOf(comboBox.getSelectedIndex());
				blanco4.setText(comboBox.getSelectedItem().toString());
				blanco4.setText(valorSeleccionado);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "VALENCIA", "SEVILLA", "BARCELONA", "MADRID"}));
		comboBox.setBounds(17, 124, 170, 27);
		frame.getContentPane().add(comboBox);
		
		blanco4 = new JTextField();
		blanco4.setBounds(204, 122, 134, 28);
		frame.getContentPane().add(blanco4);
		blanco4.setColumns(10);
		
		list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
				// eevento tras seleccionar un elemento de la lista
				String resultado = String.valueOf(list.getSelectedIndex());
				blanco5.setText(list.getSelectedValue().toString());
				blanco5.setText(resultado);
				
			}
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"JUAN LUIS", "ALBERTO", "JOSE CARLOS"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(27, 163, 83, 80);
		frame.getContentPane().add(list);
		
		blanco5 = new JTextField();
		blanco5.setBounds(136, 163, 134, 28);
		frame.getContentPane().add(blanco5);
		blanco5.setColumns(10);
		

		final JLabel blanco6 = new JLabel("");
		blanco6.setBounds(160, 306, 61, 16);
		frame.getContentPane().add(blanco6);
		
		final JButton boton = new JButton("New button");
		boton.setBounds(281, 214, 117, 29);
		frame.getContentPane().add(boton);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("bloquear");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//evento check para bloquear el boton
				if(chckbxNewCheckBox.isSelected()){
					boton.setEnabled(false);
				}
				else
					boton.setEnabled(true);
			}
		});
		chckbxNewCheckBox.setBounds(136, 214, 128, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mujer");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				blanco6.setText("Mujer");
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(20, 279, 141, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		
		
		JRadioButton rdbtnSi = new JRadioButton("Hombre");
		rdbtnSi.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// Es hombre
				blanco6.setText("Hombre");
				
			}
		});
		rdbtnSi.setSelected(true);
		buttonGroup.add(rdbtnSi);
		rdbtnSi.setBounds(20, 306, 141, 23);
		frame.getContentPane().add(rdbtnSi);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel.setBounds(183, 306, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(268, 300, 134, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
	}
}

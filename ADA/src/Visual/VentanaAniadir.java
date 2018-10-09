package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAniadir extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnAadir;
	private JButton btnQuitar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JButton btnNewButton_1;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAniadir frame = new VentanaAniadir();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaAniadir() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 398, 430);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		
		this.lblNewLabel = new JLabel("Palabra");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		this.lblNewLabel.setBounds(34, 11, 84, 33);
		this.contentPane.add(this.lblNewLabel);
		
		this.btnNewButton = new JButton("Agregar Imagen");
		this.btnNewButton.setBounds(247, 18, 125, 50);
		this.contentPane.add(this.btnNewButton);
		
		this.btnAadir = new JButton("A\u00F1adir");
		this.btnAadir.setBounds(148, 11, 89, 23);
		this.contentPane.add(this.btnAadir);
		
		this.btnQuitar = new JButton("Quitar");
		this.btnQuitar.setBounds(148, 45, 89, 23);
		this.contentPane.add(this.btnQuitar);
		
		this.textField = new JTextField();
		this.textField.setBounds(34, 85, 86, 20);
		this.contentPane.add(this.textField);
		this.textField.setColumns(10);
		
		this.textField_1 = new JTextField();
		this.textField_1.setColumns(10);
		this.textField_1.setBounds(34, 139, 86, 20);
		this.contentPane.add(this.textField_1);
		
		this.textField_2 = new JTextField();
		this.textField_2.setColumns(10);
		this.textField_2.setBounds(32, 191, 86, 20);
		this.contentPane.add(this.textField_2);
		
		this.textField_3 = new JTextField();
		this.textField_3.setColumns(10);
		this.textField_3.setBounds(32, 244, 86, 20);
		this.contentPane.add(this.textField_3);
		
		this.textField_4 = new JTextField();
		this.textField_4.setColumns(10);
		this.textField_4.setBounds(34, 296, 86, 20);
		this.contentPane.add(this.textField_4);
		
		this.textField_5 = new JTextField();
		this.textField_5.setColumns(10);
		this.textField_5.setBounds(221, 79, 86, 20);
		this.contentPane.add(this.textField_5);
		
		this.textField_6 = new JTextField();
		this.textField_6.setColumns(10);
		this.textField_6.setBounds(221, 139, 86, 20);
		this.contentPane.add(this.textField_6);
		
		this.textField_7 = new JTextField();
		this.textField_7.setColumns(10);
		this.textField_7.setBounds(221, 191, 86, 20);
		this.contentPane.add(this.textField_7);
		
		this.textField_8 = new JTextField();
		this.textField_8.setColumns(10);
		this.textField_8.setBounds(221, 244, 86, 20);
		this.contentPane.add(this.textField_8);
		
		this.textField_9 = new JTextField();
		this.textField_9.setColumns(10);
		this.textField_9.setBounds(221, 296, 86, 20);
		this.contentPane.add(this.textField_9);
		
		this.btnNewButton_1 = new JButton("Volver");
		this.btnNewButton_1.addActionListener(this);
		this.btnNewButton_1.setBounds(281, 357, 91, 23);
		this.contentPane.add(this.btnNewButton_1);
		
		this.btnGuardar = new JButton("Guardar");
		this.btnGuardar.setBounds(27, 327, 91, 53);
		this.contentPane.add(this.btnGuardar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(arg0);
		}
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent arg0) {
		ADAVisual mv = new ADAVisual();
		mv.setVisible(true);
		this.setVisible(false);
	}
}

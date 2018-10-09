package Visual;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JToggleButton;
import javax.swing.ListCellRenderer;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JList;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;

public class ADAVisual<E> extends JFrame implements ActionListener,ListCellRenderer
{
	final static ImageIcon logo = new ImageIcon ("logo.jpg");
	final static ImageIcon ima = new ImageIcon ("homero.jpg");
	private JPanel contentPane;
	private JPanel cabezera;
	private JPanel cuerpo;
	private JPanel cuadroTexto;
	private JPanel añadir;
	private JPanel configuracion;
	private JButton buttonAniadir;
	private JButton btnConfiguracion;
	private JPanel buscador;
	private JTextField textFieldBuscador;
	private JTextArea txtrSdfssad;
	private JPanel panel;
	private JButton btnEscuchar;
	private JScrollPane scrollPane;
	private JList<? extends E> list_1;
	private JCheckBoxMenuItem chckbxmntmCategorias;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADAVisual frame = new ADAVisual();
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
	public ADAVisual() {
		setTitle("ADA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 446);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.cabezera = new JPanel();
		this.contentPane.add(this.cabezera, BorderLayout.NORTH);
		this.cabezera.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.añadir = new JPanel();
		this.cabezera.add(this.añadir);
		
		this.buttonAniadir = new JButton("+");
		this.buttonAniadir.addActionListener(this);
		this.añadir.add(this.buttonAniadir);
		
		this.configuracion = new JPanel();
		this.cabezera.add(this.configuracion);
		
		this.btnConfiguracion = new JButton("O");
		this.btnConfiguracion.addActionListener(this);
		this.configuracion.add(this.btnConfiguracion);
		
		this.buscador = new JPanel();
		this.cabezera.add(this.buscador);
		
		this.textFieldBuscador = new JTextField();
		this.buscador.add(this.textFieldBuscador);
		this.textFieldBuscador.setColumns(10);
		
		this.cuerpo = new JPanel();
		this.contentPane.add(this.cuerpo, BorderLayout.CENTER);
		this.cuerpo.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane = new JScrollPane();
		this.cuerpo.add(this.scrollPane, BorderLayout.CENTER);
		
		this.list_1 = new JList();
		this.scrollPane.setViewportView(this.list_1);
		
		this.chckbxmntmCategorias = new JCheckBoxMenuItem("Categorias");
		this.scrollPane.setColumnHeaderView(this.chckbxmntmCategorias);
		
		this.cuadroTexto = new JPanel();
		this.contentPane.add(this.cuadroTexto, BorderLayout.SOUTH);
		
		this.comboBox = new JComboBox();
		this.cuadroTexto.add(this.comboBox);
		
		this.txtrSdfssad = new JTextArea();
		this.txtrSdfssad.setText("Cuadro de Texto de palabras\r\n");
		this.txtrSdfssad.setTabSize(20);
		this.cuadroTexto.add(this.txtrSdfssad);
		
		this.panel = new JPanel();
		this.cuadroTexto.add(this.panel);
		
		this.btnEscuchar = new JButton("Escuchar");
		this.panel.add(this.btnEscuchar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnConfiguracion) {
			do_btnConfiguracion_actionPerformed(e);
		}
		if (e.getSource() == this.buttonAniadir) {
			do_buttonAniadir_actionPerformed(e);
		}
	}
	protected void do_buttonAniadir_actionPerformed(ActionEvent e) {
		VentanaAniadir mv = new VentanaAniadir();
		mv.setVisible(true);
		this.setEnabled(false);
		this.setVisible(false);
		
		
		}
		
	protected void do_btnConfiguracion_actionPerformed(ActionEvent e) {
		VentanaAniadir mv = new VentanaAniadir();
		mv.setVisible(true);
		this.setEnabled(false);
		this.setVisible(false);
	}

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, 
			boolean isSelected, boolean cellHasFocus) {
		String valor = value.toString();
		if(!valor.equals("")){
			setIconImages((List<? extends Image>) logo);
		}
		if(isSelected){
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionBackground());
		}else{
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
			setEnabled(list.isEnabled());
			setFont(list.getFont());
//			setOpaque(true);
			
		return this;
	}
}

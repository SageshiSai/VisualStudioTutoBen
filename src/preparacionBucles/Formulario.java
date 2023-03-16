package preparacionBucles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;


public class Formulario extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 628698766134660388L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JButton btnEnviar;
	private ButtonGroup btgRadio;
	private JCheckBox chckbxCastellano;
	private JCheckBox chckbxEuskera;
	private JCheckBox chckbxIngles;
	private JRadioButton rdbtnProfesor;
	private JRadioButton rdbtnAlumno;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setTitle("Formulario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombre.setBounds(61, 66, 61, 13);
		contentPane.add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApellido.setBounds(61, 95, 61, 13);
		contentPane.add(lblApellido);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(148, 64, 96, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(148, 93, 96, 19);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		rdbtnProfesor = new JRadioButton("Profesor");
		rdbtnProfesor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnProfesor.setBounds(295, 61, 103, 21);
		contentPane.add(rdbtnProfesor);
		rdbtnProfesor.setSelected(true);
		
		
		rdbtnAlumno = new JRadioButton("Alumno");
		rdbtnAlumno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnAlumno.setBounds(295, 90, 103, 21);
		contentPane.add(rdbtnAlumno);
		
		
		btgRadio = new ButtonGroup();
		btgRadio.add(rdbtnProfesor);
		btgRadio.add(rdbtnAlumno);
		 
		 
		JLabel lblZornotza = new JLabel("CIFP ZORNOTZA LHII");
		lblZornotza.setForeground(Color.BLUE);
		lblZornotza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblZornotza.setBounds(102, 10, 201, 20);
		contentPane.add(lblZornotza);
		
		chckbxCastellano = new JCheckBox("Castellano");
		chckbxCastellano.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxCastellano.setBounds(61, 174, 93, 21);
		contentPane.add(chckbxCastellano);
		
		chckbxEuskera = new JCheckBox("Euskera");
		chckbxEuskera.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxEuskera.setBounds(168, 174, 93, 21);
		contentPane.add(chckbxEuskera);
		
		chckbxIngles = new JCheckBox("Ingles");
		chckbxIngles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxIngles.setBounds(295, 174, 93, 21);
		contentPane.add(chckbxIngles);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEnviar.setBounds(143, 232, 85, 21);
		contentPane.add(btnEnviar);
		btnEnviar.addActionListener(this);
		
		JLabel lblMensaje = new JLabel("Idiomas que conoces (por lo menos un nivel B2) ");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMensaje.setToolTipText("");
		lblMensaje.setBounds(61, 122, 322, 37);
		contentPane.add(lblMensaje);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String idioma="";
		String persona="";
		
		if (chckbxCastellano.isSelected()) {
			idioma=idioma+ " Castellano";
		}if (chckbxEuskera.isSelected()) {
			idioma=idioma+ " Euskera";
		}if (chckbxIngles.isSelected()) {
			idioma=idioma+ " Ingles";
		}
		
		if (rdbtnProfesor.isSelected()) {
			persona=" profesor";
		}if (rdbtnAlumno.isSelected()) {
			persona=" alumno";
		}
		JOptionPane.showMessageDialog(this,idioma + " son los idiomas que conoces","Bienvenido " +persona+" "+ txtNombre.getText()+" "+txtApellido.getText(),JOptionPane.INFORMATION_MESSAGE);
	}
}
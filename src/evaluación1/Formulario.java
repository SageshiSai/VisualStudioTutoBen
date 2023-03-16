package evaluación1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Formulario extends JFrame {

    private JPanel Contenedor;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel lblZornotza;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JRadioButton rdbtnProfesor;
    private JRadioButton rdbtnAlumno;
    private JLabel lblTexto;
    private JCheckBox chckbxCastellano;
    private JCheckBox chckbxEuskera;
    private JCheckBox chckbxIngles;
    private JButton btnEnviar;

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
        Contenedor = new JPanel();
        Contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(Contenedor);
        Contenedor.setLayout(null);
        
        lblZornotza = new JLabel("CIFP ZORNOTZA LHII");
        lblZornotza.setBounds(79, 11, 265, 50);
        Contenedor.add(lblZornotza);
        
        lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(56, 89, 72, 24);
        Contenedor.add(lblNombre);
        
        lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(56, 124, 72, 24);
        Contenedor.add(lblApellido);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(150, 89, 142, 24);
        Contenedor.add(txtNombre);
        txtNombre.setColumns(10);
        
        txtApellido = new JTextField();
        txtApellido.setBounds(150, 124, 142, 24);
        Contenedor.add(txtApellido);
        txtApellido.setColumns(10);
        
        rdbtnProfesor = new JRadioButton("Profesor");
        rdbtnProfesor.setBounds(319, 90, 109, 23);
        Contenedor.add(rdbtnProfesor);
        
        rdbtnAlumno = new JRadioButton("Alumno");
        rdbtnAlumno.setBounds(319, 125, 109, 23);
        Contenedor.add(rdbtnAlumno);
        
        lblTexto = new JLabel("Idiomas que conoces (Por lo menos nivel B2)");
        lblTexto.setBounds(56, 159, 368, 24);
        Contenedor.add(lblTexto);
        
        chckbxCastellano = new JCheckBox("Castellano");
        chckbxCastellano.setBounds(54, 190, 97, 23);
        Contenedor.add(chckbxCastellano);
        
        chckbxEuskera = new JCheckBox("Euskera");
        chckbxEuskera.setBounds(184, 190, 97, 23);
        Contenedor.add(chckbxEuskera);
        
        chckbxIngles = new JCheckBox("Ingles");
        chckbxIngles.setBounds(331, 190, 97, 23);
        Contenedor.add(chckbxIngles);
        
        btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(181, 227, 89, 23);
        Contenedor.add(btnEnviar);
    }
}

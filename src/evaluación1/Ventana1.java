package evaluación1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Ventana1 extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField txtNombre;
    private JPasswordField passwordField;
    private JLabel lblTexto;
    private JButton btnAceptar;
    private JLabel lblContraseña;
    private JLabel lblNombre;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana1 frame = new Ventana1();
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
    
    public Ventana1() {
        setTitle("Identificate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(77, 75, 65, 14);
        contentPane.add(lblNombre);
        
        lblContraseña = new JLabel("Contraseña");
        lblContraseña.setBounds(77, 130, 65, 14);
        contentPane.add(lblContraseña);
        
        
        txtNombre = new JTextField();
        txtNombre.setBounds(164, 72, 173, 20);
        contentPane.add(txtNombre);
        txtNombre.setColumns(10);
        txtNombre.addActionListener(this);
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(164, 189, 89, 23);
        contentPane.add(btnAceptar);
        btnAceptar.addActionListener(this);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(164, 128, 173, 17);
        passwordField.addActionListener(this);
        
        contentPane.add(passwordField);
        
        lblTexto = new JLabel("");
        lblTexto.setBounds(49, 236, 343, 25);
        contentPane.add(lblTexto);
        JOptionPane.showMessageDialog(null, (String)"Bienvenido a nuestro sitio web");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String pass = new String(passwordField.getPassword());
        if (pass.equals("abc")) {
            Ventana2 v2 = new Ventana2();
            // le cambio el titulo
            v2.setTitle("Bienvenido "+txtNombre.getText());
            // la muestro
            v2.setVisible(true);
            this.dispose();
        }
        else {
            lblTexto.setText("La contraseña escrita no es correcta, intentelo otra vez");
        }
        
    }
}

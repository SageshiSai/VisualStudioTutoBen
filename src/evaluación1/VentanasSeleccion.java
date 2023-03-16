package evaluación1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanasSeleccion extends JFrame implements ActionListener{

    private JPanel contenedor;
    private JLabel lblTexto;
    private JPanel panel;
    private JButton btnArchivo;
    private JButton btnColor;
    private JButton btnFuente;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanasSeleccion frame = new VentanasSeleccion();
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
    public VentanasSeleccion() {
        setTitle("VentanasSeleccion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contenedor = new JPanel();
        contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contenedor);
        contenedor.setLayout(new BorderLayout(0, 0));
        
        lblTexto = new JLabel("PRUEBA DE VENTANA SELECCIÓN");
        lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
        contenedor.add(lblTexto, BorderLayout.NORTH);
        
        panel = new JPanel();
        contenedor.add(panel, BorderLayout.SOUTH);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        btnArchivo = new JButton("Archivo");
        btnArchivo.addActionListener(this);
        panel.add(btnArchivo);
        
        btnColor = new JButton("Color");
        btnColor.addActionListener(this);
        panel.add(btnColor);
        
        btnFuente = new JButton("Fuente");
        btnFuente.addActionListener(this);
        panel.add(btnFuente);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object o = e.getSource();
        if (o == btnArchivo) {
            JFileChooser fileChooser = new JFileChooser();
            int Opcion = fileChooser.showOpenDialog(this);
            if (Opcion == JFileChooser.APPROVE_OPTION) {
                lblTexto.setText("Se a elegido "+fileChooser.getSelectedFile());
            }
            if (Opcion == JFileChooser.CANCEL_OPTION) {
                lblTexto.setText("Se a pulsado Cancelar");
            }
            if (Opcion == JFileChooser.ERROR_OPTION) {
                lblTexto.setText("Se a producido un Error");
            }
        }
        if (o == btnColor) {
            Color NuevoColor = JColorChooser.showDialog(this, "Eliga el Color", contenedor.getBackground());
            lblTexto.setForeground(NuevoColor);
        }
        if (o == btnFuente) {
            int Opcion;
            Font NuevaFuente;
            JFontChooser fontChooser = new JFontChooser();
            NuevaFuente = lblTexto.getFont();
            fontChooser.setSelectedFont(NuevaFuente);
            Opcion = fontChooser.showDialog(contenedor);
            
            if (Opcion == JFontChooser.OK_OPTION) {
                NuevaFuente = fontChooser.getSelectedFont();
                lblTexto.setFont(NuevaFuente);
            }
        }
    }

}

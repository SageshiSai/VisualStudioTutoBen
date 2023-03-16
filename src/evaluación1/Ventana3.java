package evaluación1;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Ventana3 extends JFrame {

    private JPanel contentPane;
    private JLabel lblTexto;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana3 frame = new Ventana3();
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
    public Ventana3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lblTexto = new JLabel("");
        lblTexto.setBounds(0, 76, 424, 101);
        contentPane.add(lblTexto);
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

}

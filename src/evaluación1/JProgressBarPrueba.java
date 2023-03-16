package evaluación1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.Color;

public class JProgressBarPrueba extends JFrame implements ActionListener{

    private JPanel Contenedor;
    private JPanel Panel;
    private JLabel lblProgreso;
    private JProgressBar progressBar;
    private JButton btnStart;
    private JLabel lblEstado;
    private Timer timer;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JProgressBarPrueba frame = new JProgressBarPrueba();
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
    public JProgressBarPrueba() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        Contenedor = new JPanel();
        Contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(Contenedor);
        Contenedor.setLayout(new BorderLayout(0, 0));
        
        Panel = new JPanel();
        Contenedor.add(Panel, BorderLayout.NORTH);
        
        lblProgreso = new JLabel("Progreso");
        Panel.add(lblProgreso);
        
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setForeground(new Color(255, 0, 128));
        progressBar.setBackground(new Color(192, 192, 192));
        Panel.add(progressBar);
        
        timer = new Timer (10,this);
        
        btnStart = new JButton("Start");
        btnStart.addActionListener(this);
        
        Panel.add(btnStart);
        
        lblEstado = new JLabel("Sin Datos");
        Contenedor.add(lblEstado, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object o = e.getSource();
        if ( o == btnStart) {
            progressBar.setValue(progressBar.getMinimum());
            timer.start();
            lblEstado.setText("Inicio...");
        }
        else {
            int valor;
            valor = progressBar.getValue();
            valor = valor+1;
            progressBar.setValue(valor);
            if (valor == progressBar.getMaximum()) {
                timer.start();
                lblEstado.setText("Fin");
            }
            
        }
    }

}

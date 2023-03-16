package evaluación1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class CalculadoraUnOperando extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField txtNumeros;
    private JButton btnRaizCuadrada;
    private JButton btnMulti2;
    private JButton btnMulti3;
    private JButton btnMenos;
    private JButton btnDivicion;
    private JButton btnClear;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CalculadoraUnOperando frame = new CalculadoraUnOperando();
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
    public CalculadoraUnOperando() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        txtNumeros = new JTextField();
        txtNumeros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeros.setText("0.0");
        txtNumeros.addActionListener(this);
        txtNumeros.setBounds(0, 0, 434, 20);
        contentPane.add(txtNumeros);
        txtNumeros.setColumns(10);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 22, 434, 239);
        contentPane.add(panel);
        panel.setLayout(new GridLayout(0, 3, 0, 0));
        
        btnMenos = new JButton("-");
        panel.add(btnMenos);
        btnMenos.addActionListener(this);
        
        btnMulti2 = new JButton("x2");
        panel.add(btnMulti2);
        btnMulti2.addActionListener(this);
        
        btnMulti3 = new JButton("x3");
        panel.add(btnMulti3);
        btnMulti3.addActionListener(this);
        
        btnRaizCuadrada = new JButton("Raiz Cuadrada");
        panel.add(btnRaizCuadrada);
        btnRaizCuadrada.addActionListener(this);
        
        btnDivicion = new JButton("1/x");
        panel.add(btnDivicion);
        btnDivicion.addActionListener(this);
        
        btnClear = new JButton("CE");
        panel.add(btnClear);
        btnClear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object o = e.getSource();
        String texto = txtNumeros.getText();
        
        //para convertir el texto a Numeros double
        Double operando;
        operando = Double.parseDouble(texto);
        
        Double resultado = 0.0;
        
        if (o == btnMenos) {
            resultado = -operando;
        }
        else if (o == btnMulti2) {
            resultado = Math.pow(operando, 2);
        }
        else if (o == btnMulti3) {
            resultado = Math.pow(operando, 3);
        }
        else if ( o == btnRaizCuadrada) {
            resultado = Math.sqrt(operando);
        }
        else if (o == btnDivicion) {
            resultado = 1/operando;
        }
        /*
        else {
            resultado = 0.0;
        }
        */
        String resultadotexto;
        resultadotexto = resultado.toString();
        
        txtNumeros.setText(resultadotexto);
    }

}

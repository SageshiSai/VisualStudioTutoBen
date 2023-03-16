package evaluación1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class calculadoraframe extends JFrame implements ActionListener{

    private JPanel Contenedor;
    private JTextField txtNumero;
    private JPanel panel_1;
    private JButton btnClear;
    private JPanel panel_2;
    private JPanel panel_4;
    private JLabel lblNumber;
    private JLabel lblSignum;
    private JPanel panel_3;
    private JButton btnplus;
    private JButton btnMinus;
    private JButton btnMulti;
    private JButton btnDivicion;
    private JPanel panel;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn0;
    private JButton btnResultado;
    private JButton btnPunto;
    private boolean haySeparadorDecimal;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    calculadoraframe frame = new calculadoraframe();
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
    public calculadoraframe() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 398);
        Contenedor = new JPanel();
        Contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(Contenedor);
        Contenedor.setLayout(null);
        
        panel_1 = new JPanel();
        panel_1.setBounds(218, 49, 66, 310);
        Contenedor.add(panel_1);
        panel_1.setLayout(new GridLayout(0, 1, 0, 0));
        
        btnClear = new JButton("CE");
        btnClear.addActionListener(this);
        panel_1.add(btnClear);
        
        panel_2 = new JPanel();
        panel_2.setBounds(0, 0, 284, 49);
        Contenedor.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));
        
        panel_4 = new JPanel();
        panel_2.add(panel_4, BorderLayout.NORTH);
        
        lblNumber = new JLabel("");
        lblNumber.setFont(new Font("Tahoma", Font.BOLD, 6));
        panel_4.add(lblNumber);
        
        lblSignum = new JLabel("");
        lblSignum.setFont(new Font("Tahoma", Font.BOLD, 6));
        panel_4.add(lblSignum);
        
        txtNumero = new JTextField();
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setFont(new Font("Tahoma", Font.BOLD, 30));
        txtNumero.setText("0");
        panel_2.add(txtNumero, BorderLayout.CENTER);
        txtNumero.setColumns(10);
        txtNumero.addActionListener(this);
        
        panel_3 = new JPanel();
        panel_3.setBounds(175, 49, 43, 310);
        Contenedor.add(panel_3);
        panel_3.setLayout(new GridLayout(0, 1, 0, 0));
        
        btnplus = new JButton("+");
        btnplus.addActionListener(this);
        panel_3.add(btnplus);
        
        btnMinus = new JButton("-");
        btnMinus.addActionListener(this);
        panel_3.add(btnMinus);
        
        btnMulti = new JButton("*");
        btnMulti.addActionListener(this);
        panel_3.add(btnMulti);
        
        btnDivicion = new JButton("/");
        btnDivicion.addActionListener(this);
        panel_3.add(btnDivicion);
        
        panel = new JPanel();
        panel.setBounds(0, 49, 176, 310);
        Contenedor.add(panel);
        panel.setLayout(new GridLayout(0, 3, 0, 0));
        
        btn7 = new JButton("7");
        btn7.addActionListener(this);
        panel.add(btn7);
        
        btn8 = new JButton("8");
        btn8.addActionListener(this);
        panel.add(btn8);
        
        btn9 = new JButton("9");
        btn9.addActionListener(this);
        panel.add(btn9);
        
        btn4 = new JButton("4");
        btn4.addActionListener(this);
        panel.add(btn4);
        
        btn5 = new JButton("5");
        btn5.addActionListener(this);
        panel.add(btn5);
        
        btn6 = new JButton("6");
        btn6.addActionListener(this);
        panel.add(btn6);
        
        btn1 = new JButton("1");
        btn1.addActionListener(this);
        panel.add(btn1);
        
        btn2 = new JButton("2");
        btn2.addActionListener(this);
        panel.add(btn2);
        
        btn3 = new JButton("3");
        btn3.addActionListener(this);
        panel.add(btn3);
        
        btn0 = new JButton("0");
        btn0.addActionListener(this);
        panel.add(btn0);
        
        btnResultado = new JButton("=");
        btnResultado.addActionListener(this);
        panel.add(btnResultado);
        
        btnPunto = new JButton(".");
        btnPunto.addActionListener(this);
        panel.add(btnPunto);
        
        haySeparadorDecimal=false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object o = e.getSource();
        
        String texto = "";
        String Signo = "";
        
        if ((o == btn0) || (o == btn1) || (o == btn2) || (o == btn3) || (o == btn4) || (o == btn5) || (o == btn6) || (o == btn7) || (o == btn8) || (o == btn9)) {;
        // si pulsa una cifra
            if(txtNumero.getText().equals("0")) {
                texto = ((JButton)o).getText();
            }
            else {
                texto = txtNumero.getText() + ((JButton)o).getText();
                
            }
            this.txtNumero.setText(texto);
        }
        else if ((o == btnplus) || (o == btnMinus) || (o == btnDivicion) || (o == btnMulti)) {
           
           
        //si pulsa un signo
               Signo = ((JButton)o).getText();
               this.lblSignum.setText(Signo);
               texto = this.txtNumero.getText();
               this.lblNumber.setText(texto);
               this.txtNumero.setText("0");
               haySeparadorDecimal= false;
        }
           else if (o == btnResultado || o == txtNumero) {
               texto = this.lblNumber.getText();
           
               if (!texto.equals("")) {
               Double Num1, Num2;
               Double Resultado = 0.0;
               Num1 = Double.parseDouble(this.lblNumber.getText());
               Signo = this.lblSignum.getText();
               Num2 = Double.parseDouble(this.txtNumero.getText());
               
               if (Signo == "+") {
                  Resultado = Num1 + Num2;
               }
               else if (Signo == "-") {
                   Resultado = Num1 - Num2;
               }
               else if (Signo == "*") {
                   Resultado = Num1 * Num2;
               }
               else {
                   Resultado = Num1 / Num2;
               }
               this.lblNumber.setText(null);
               this.lblSignum.setText(null);
               texto = Double.toString(Resultado);
               this.txtNumero.setText(texto);
               haySeparadorDecimal=true;
               }
           }    
           else if (o == btnClear) {
               this.lblNumber.setText(null);
               haySeparadorDecimal=false;
               this.lblSignum.setText(null);
               this.txtNumero.setText("0");
           }
           else if (o == btnPunto) {
               if (!haySeparadorDecimal) {
               texto = txtNumero.getText() + ".";
               this.txtNumero.setText(texto);
               haySeparadorDecimal = true;
               }
           }
    }
    
    
}

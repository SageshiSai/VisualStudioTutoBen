package evaluación1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class ConverseorTemperatura extends JFrame implements ActionListener {

	private JPanel Contenedor;
    private JTextField txtGrados;
    private JButton btnConvertirF;
    private JButton btnConverirK;
    private JPanel panel;
    private JPanel panel_1;
    private JLabel lblTextoF;
    private JLabel lblTextoK;
    private JPanel panel_2;
    private JLabel lblTextoEstado;
    private JMenuBar menuBar;
    private JMenu mnNewMenu;
    private JMenu mnNewMenu_1;
    private JMenuItem mntmClean;
    private JMenuItem mntmConvertF;
    private JMenuItem mntmConvertK;
    private JMenuItem mntmMasInfo;
    private JMenuItem mntmSalir;
    private JLabel lblGrados;
    private JButton btnClean;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConverseorTemperatura frame = new ConverseorTemperatura();
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
    public ConverseorTemperatura() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        Contenedor = new JPanel();
        Contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(Contenedor);
        Contenedor.setLayout(null);
        
        lblGrados = new JLabel("Grados Cº ->");
        lblGrados.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblGrados.setForeground(Color.BLUE);
        lblGrados.setBounds(66, 45, 99, 42);
        Contenedor.add(lblGrados);
        
        txtGrados = new JTextField();
        txtGrados.setBounds(194, 47, 97, 42);
        txtGrados.addActionListener(this);
        Contenedor.add(txtGrados);
        txtGrados.setColumns(10);
        
        btnClean = new JButton("Clean");
        btnClean.setBounds(309, 47, 97, 42);
        btnClean.addActionListener(this);
        Contenedor.add(btnClean);
        
        btnConvertirF = new JButton("Convertir a F");
        btnConvertirF.addActionListener(this);
        btnConvertirF.setBounds(64, 98, 109, 42);
        Contenedor.add(btnConvertirF);
        
        btnConverirK = new JButton("Convertir a K");
        btnConverirK.addActionListener(this);
        btnConverirK.setBounds(251, 100, 109, 42);
        Contenedor.add(btnConverirK);
        
        panel = new JPanel();
        panel.setBounds(66, 151, 109, 47);
        Contenedor.add(panel);
        panel.setLayout(new BorderLayout(0, 0));
        
        lblTextoF = new JLabel("");
        lblTextoF.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblTextoF);
        
        panel_1 = new JPanel();
        panel_1.setBounds(251, 153, 109, 45);
        Contenedor.add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));
        
        lblTextoK = new JLabel("");
        lblTextoK.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblTextoK, BorderLayout.CENTER);
        
        panel_2 = new JPanel();
        panel_2.setBounds(10, 226, 414, 24);
        Contenedor.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));
        
        lblTextoEstado = new JLabel("Por favor, introduzca los Grados Cº");
        lblTextoEstado.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblTextoEstado, BorderLayout.CENTER);
        
        menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 99, 22);
        Contenedor.add(menuBar);
        
        mnNewMenu = new JMenu("Opciones");
        menuBar.add(mnNewMenu);
        
        mntmClean = new JMenuItem("Clean");
        mntmClean.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        mntmClean.addActionListener(this);
        mnNewMenu.add(mntmClean);
        
        mntmConvertF = new JMenuItem("Convertir a F");
        mntmConvertF.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
        mntmConvertF.addActionListener(this);
        mnNewMenu.add(mntmConvertF);
        
        mntmConvertK = new JMenuItem("Convertir a K");
        mntmConvertK.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
        mntmConvertK.addActionListener(this);
        mnNewMenu.add(mntmConvertK);
        
        mnNewMenu_1 = new JMenu("Más");
        menuBar.add(mnNewMenu_1);
        
        mntmMasInfo = new JMenuItem("Más Información");
        mntmMasInfo.addActionListener(this);
        mntmMasInfo.setIcon(new ImageIcon("E:\\KevinAriketak\\EclipseAriketak\\Java\\src\\Iconos\\acercade.gif"));
        mnNewMenu_1.add(mntmMasInfo);
        
        mntmSalir = new JMenuItem("Salir");
        mntmSalir.addActionListener(this);
        mntmSalir.setIcon(new ImageIcon("E:\\KevinAriketak\\EclipseAriketak\\Java\\src\\Iconos\\salir.gif"));
        mnNewMenu_1.add(mntmSalir);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object o = e.getSource();
        if (!txtGrados.equals("") && o == btnConvertirF || o == btnConverirK) {
        	String grados = txtGrados.getText();
        	Double farenheit, cambio, resultado, kelvin;
        	if (o == btnConvertirF) {
        		cambio = Double.parseDouble(grados);
        		farenheit = cambio*2-cambio/5;
        		resultado = farenheit + 32;
        		this.lblTextoF.setText(resultado.toString() + " F");
        		this.lblTextoEstado.setText("DONE");
        	 	}
        	if (o == btnConverirK) {
        		cambio = Double.parseDouble(grados);
        		kelvin = cambio+273.15;
        		resultado = kelvin;
        		this.lblTextoK.setText(resultado.toString() + " K");
        		this.lblTextoEstado.setText("DONE");
        	 	}
        	
        }
        else if (!txtGrados.equals("") && o == btnClean) {
    		this.txtGrados.setText("");
    		this.lblTextoF.setText("");
    		this.lblTextoK.setText("");
    		this.lblTextoEstado.setText("Por favor, introduzca los Grados Cº");
    	}
        else if (o == mntmClean) {
        	btnClean.doClick();
        }
        else if (o == mntmConvertF) {
        	btnConvertirF.doClick();
        }
        else if (o == mntmConvertK) {
        	btnConverirK.doClick();
        }
        else if (o == mntmMasInfo) {
        	this.lblTextoEstado.setText("Añade los GradosCº y pulsa un boton");
        }
        else if (o==mntmSalir) {
        	System.exit(0);
        }
        else {
        	this.lblTextoEstado.setText("Por favor, introduzca los Grados Cº");
        }
        
    }
}

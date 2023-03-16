package evaluación1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class JOptionPaneShowMessageDialog extends JFrame implements ActionListener {

	private JPanel Contenedor;
	private JPanel panelboton;
	private JButton btnClick;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneShowMessageDialog frame = new JOptionPaneShowMessageDialog();
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
	public JOptionPaneShowMessageDialog() {
		setTitle("JOptionPaneShowMessageDialog");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Contenedor = new JPanel();
		Contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Contenedor);
		Contenedor.setLayout(new BorderLayout(0, 0));
		
		panelboton = new JPanel();
		Contenedor.add(panelboton, BorderLayout.CENTER);
		panelboton.setLayout(null);
		
		btnClick = new JButton("Click");
		btnClick.addActionListener(this);
		btnClick.setBounds(126, 61, 159, 55);
		panelboton.add(btnClick);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o == btnClick) {
			JOptionPane.showMessageDialog(this, (String)"Prueba de cuadros de Diálogo","Cuadro de Diálogo Mensaje", JOptionPane.INFORMATION_MESSAGE,null);
		}
	}
}

package Evaluacion1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JDialogHola extends JDialog {
/**
	 * 
	 */
	private static final long serialVersionUID = -37975207395543656L;
private final JPanel contentPanel = new JPanel();
// Creo el JDialog
public JDialogHola() {
 setTitle("JDialog Hola");
 setBounds(100, 100, 450, 300);
 getContentPane().setLayout(new BorderLayout());
 contentPanel.setLayout(new FlowLayout());
 contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
 getContentPane().add(contentPanel, BorderLayout.CENTER);
 {
 JPanel buttonPane = new JPanel();
 buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
 getContentPane().add(buttonPane, BorderLayout.SOUTH);
 {
 JButton okButton = new JButton("HOLA");
 okButton.setActionCommand("OK");
 buttonPane.add(okButton);
 getRootPane().setDefaultButton(okButton);
 }
 {
 JButton cancelButton = new JButton("Cancel");
 cancelButton.setActionCommand("Cancel");
 buttonPane.add(cancelButton);
 }
 }
}
// Ejecuto la aplicacion
public static void main(String[] args) {
	try {
		 JDialogHola dialog = new JDialogHola();
		 dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		 dialog.setVisible(true);
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
		}
		}


package evaluación1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Ventana2 extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JMenu mnHelp;
    private JMenu mnEdit;
    private JMenuItem mntmExit;
    private JMenuItem mntmOpen;
    private JMenuItem mntmNew;
    private JMenu mnFile;
    private JMenuBar menuBar;
    private JMenuItem mntmCopy;
    private JMenuItem mntmPaste;
    private JMenuItem mntmHelp;
    private JMenuItem mntmMoreInfo;
    private JEditorPane Editor;
    private JScrollPane scrollPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana2 frame = new Ventana2();
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
    public Ventana2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
   		mnFile = new JMenu("File");
        menuBar.add(mnFile);
        
       	mntmNew = new JMenuItem("New");
        mnFile.add(mntmNew);
        
       	mntmOpen = new JMenuItem("Open");
        mnFile.add(mntmOpen);
        mntmOpen.addActionListener(this);
       	mntmExit = new JMenuItem("Exit");
       	mntmExit.addActionListener(this);
        mnFile.add(mntmExit);
        
  		mnEdit = new JMenu("Edit");
        menuBar.add(mnEdit);
        
        mntmCopy = new JMenuItem("Copy");
        mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        mntmCopy.addActionListener(this);
        mnEdit.add(mntmCopy);
        
        mntmPaste = new JMenuItem("Paste");
        mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
        mntmPaste.addActionListener(this);
        mnEdit.add(mntmPaste);
        
   		mnHelp = new JMenu("Help");
        menuBar.add(mnHelp);
        
        mntmHelp = new JMenuItem("Help Contents");
        mntmHelp.addActionListener(this);
        mnHelp.add(mntmHelp);
        
        mntmMoreInfo = new JMenuItem("More Info");
        mntmMoreInfo.addActionListener(this);
        mnHelp.add(mntmMoreInfo);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        scrollPane = new JScrollPane();
        scrollPane.setVisible(false);
        scrollPane.setBounds(192, 29, 207, 160);
        contentPane.add(scrollPane);
        
        Editor = new JEditorPane();
        Editor.setEditable(false);
        Editor.setText("Using the help system\r\n"
                + "\r\n"
                + "Browse topics in the Contents frame (Contents icon) onthe left. Click on a topic to have it displayed. Use the Back and Forward buttons to navigate within the history of viewed topics. \r\n"
                + "\r\n"
                + "Searching\r\n"
                + "\r\n"
                + "To quickly locate topics on a particular subject in the documentation, enter aquery in the Search field. Use the Search frame (Search icon)to display the Search view. You can narrow the scope of your search by selecting only the sections you are interested in. \r\n"
                + "\r\n"
                + "Synchronizing\r\n"
                + "\r\n"
                + "Clicking the Show in Table of Contents button (Show in Table of Contents icon) willselect that topic in the navigation tree. The Link with Contents button (Link with Contents icon) keepsthe navigation tree synchronized to the current topic. \r\n"
                + "\r\n"
                + "Capabilities\r\n"
                + "\r\n"
                + "To show documentation about capabilities that are disabled in the application,select the Show All Topics button (Refresh / Show Current Topic icon) . This affects the table of contents and search results. \r\n"
                + "\r\n"
                + "Keyword Index\r\n"
                + "\r\n"
                + "To show an alphabetically sorted index of keywords select the Index Frame (Index icon).Not all products contain an index. \r\n"
                + "");
        scrollPane.setViewportView(Editor);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object o = e.getSource();
        
        if (o == mntmExit) {
            System.exit(0);
        }
        if (o == mntmOpen) {
            Ventana3 v3 = new Ventana3();
            v3.setTitle("Seleccion de Ficheros");
            v3.setVisible(true);
            this.dispose();
            
        }
        if (o == mntmHelp) {
            Editor.setVisible(true);
            scrollPane.setVisible(true);
        }
    }
}

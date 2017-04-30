/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class OjekGUI extends JFrame {

 private JMenuBar menuBar;
 private JButton buttonregist;
 private JButton buttonlogin;
 private JLabel label1;

 //Constructor 
 public OjekGUI(){

  this.setTitle("Ojek GUI");
  this.setSize(266,332);
  //menu generate method
  generateMenu();
  this.setJMenuBar(menuBar);

  //pane with null layout
  JPanel contentPane = new JPanel(null);
  contentPane.setPreferredSize(new Dimension(266,332));
  contentPane.setBackground(new Color(192,192,192));


  buttonregist = new JButton();
  buttonregist.setBounds(68,96,120,35);
  buttonregist.setBackground(new Color(214,217,223));
  buttonregist.setForeground(new Color(0,0,0));
  buttonregist.setEnabled(true);
  buttonregist.setFont(new Font("SansSerif",0,16));
  buttonregist.setText("Registrasi");
  buttonregist.setVisible(true);
  buttonregist.addActionListener(new ActionListener()
  {
      public void actionPerformed(ActionEvent e)
      {
          new RegistOjekGUI();
      }
        
  });

  buttonlogin = new JButton();
  buttonlogin.setBounds(68,163,120,35);
  buttonlogin.setBackground(new Color(214,217,223));
  buttonlogin.setForeground(new Color(0,0,0));
  buttonlogin.setEnabled(true);
  buttonlogin.setFont(new Font("SansSerif",0,16));
  buttonlogin.setText("Log-in");
  buttonlogin.setVisible(true);
  buttonlogin.addActionListener(new ActionListener()
  {
      public void actionPerformed(ActionEvent e)
      {
          new OjekLoginGUI();
      }
        
  });

  label1 = new JLabel();
  label1.setBounds(100,30,90,35);
  label1.setBackground(new Color(214,217,223));
  label1.setForeground(new Color(0,0,0));
  label1.setEnabled(true);
  label1.setFont(new Font("SansSerif",0,24));
  label1.setText("Ojek");
  label1.setVisible(true);

  //adding components to contentPane panel
  contentPane.add(buttonregist);
  contentPane.add(buttonlogin);
  contentPane.add(label1);

  //adding panel to JFrame and seting of window position and close operation
  this.add(contentPane);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLocationRelativeTo(null);
  this.pack();
  this.setVisible(true);
 }

 //method for generate menu
 public void generateMenu(){
  menuBar = new JMenuBar();

  JMenu file = new JMenu("File");
  JMenu tools = new JMenu("Tools");
  JMenu help = new JMenu("Help");

  JMenuItem open = new JMenuItem("Open   ");
  JMenuItem save = new JMenuItem("Save   ");
  JMenuItem exit = new JMenuItem("Exit   ");
  JMenuItem preferences = new JMenuItem("Preferences   ");
  JMenuItem about = new JMenuItem("About   ");


  file.add(open);
  file.add(save);
  file.addSeparator();
  file.add(exit);
  tools.add(preferences);
  help.add(about);

  menuBar.add(file);
  menuBar.add(tools);
  menuBar.add(help);
 }



  public static void main(String[] args){
  System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
  javax.swing.SwingUtilities.invokeLater(new Runnable() {
   public void run() {
    new OjekGUI();
   }
  });
 }

}

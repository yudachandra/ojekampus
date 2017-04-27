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


public class OjekLoginGUI extends JFrame {

 private JMenuBar menuBar;
 private JButton button1;
 private JButton button2;
 private JButton button3;
 private JLabel label1;
 private JLabel label2;
 private JLabel label3;
 private JTextField textfield1;
 private JTextField textfield2;

 //Constructor 
 public OjekLoginGUI(){

  this.setTitle("Ojek login GUI");
  this.setSize(500,400);
  //menu generate method
  generateMenu();
  this.setJMenuBar(menuBar);

  //pane with null layout
  JPanel contentPane = new JPanel(null);
  contentPane.setPreferredSize(new Dimension(500,400));
  contentPane.setBackground(new Color(192,192,192));


  button1 = new JButton();
  button1.setBounds(298,110,90,35);
  button1.setBackground(new Color(214,217,223));
  button1.setForeground(new Color(0,0,0));
  button1.setEnabled(true);
  button1.setFont(new Font("sansserif",0,12));
  button1.setText("Enter");
  button1.setVisible(true);

  button2 = new JButton();
  button2.setBounds(268,288,90,35);
  button2.setBackground(new Color(214,217,223));
  button2.setForeground(new Color(0,0,0));
  button2.setEnabled(true);
  button2.setFont(new Font("sansserif",0,12));
  button2.setText("Decline");
  button2.setVisible(true);

  button3 = new JButton();
  button3.setBounds(102,288,90,35);
  button3.setBackground(new Color(214,217,223));
  button3.setForeground(new Color(0,0,0));
  button3.setEnabled(true);
  button3.setFont(new Font("sansserif",0,12));
  button3.setText("Accept");
  button3.setVisible(true);

  label1 = new JLabel();
  label1.setBounds(176,38,120,35);
  label1.setBackground(new Color(214,217,223));
  label1.setForeground(new Color(0,0,0));
  label1.setEnabled(true);
  label1.setFont(new Font("SansSerif",0,20));
  label1.setText("Ojek Log-in");
  label1.setVisible(true);

  label2 = new JLabel();
  label2.setBounds(45,110,90,35);
  label2.setBackground(new Color(214,217,223));
  label2.setForeground(new Color(0,0,0));
  label2.setEnabled(true);
  label2.setFont(new Font("sansserif",0,12));
  label2.setText("ID               :");
  label2.setVisible(true);

  label3 = new JLabel();
  label3.setBounds(172,183,118,31);
  label3.setBackground(new Color(214,217,223));
  label3.setForeground(new Color(0,0,0));
  label3.setEnabled(true);
  label3.setFont(new Font("sansserif",0,12));
  label3.setText("Informasi Pesanan");
  label3.setVisible(true);

  textfield1 = new JTextField();
  textfield1.setBounds(161,230,130,35);
  textfield1.setBackground(new Color(255,255,255));
  textfield1.setForeground(new Color(0,255,0));
  textfield1.setEnabled(true);
  textfield1.setFont(new Font("sansserif",0,12));
  textfield1.setText("Status");
  textfield1.setVisible(true);

  textfield2 = new JTextField();
  textfield2.setBounds(134,110,130,35);
  textfield2.setBackground(new Color(255,255,255));
  textfield2.setForeground(new Color(0,255,0));
  textfield2.setEnabled(true);
  textfield2.setFont(new Font("sansserif",0,12));
  textfield2.setText("No ID");
  textfield2.setVisible(true);

  //adding components to contentPane panel
  contentPane.add(button1);
  contentPane.add(button2);
  contentPane.add(button3);
  contentPane.add(label1);
  contentPane.add(label2);
  contentPane.add(label3);
  contentPane.add(textfield1);
  contentPane.add(textfield2);

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
    new OjekLoginGUI();
   }
  });
 }

}
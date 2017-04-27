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


public class RegistOjekGUI extends JFrame {

 private JMenuBar menuBar;
 private JButton button1;
 private JLabel label1;
 private JLabel label2;
 private JLabel label3;
 private JLabel label4;
 private JLabel label5;
 private JLabel label6;
 private JLabel label7;
 private JTextField textfield1;
 private JTextField textfield2;
 private JTextField textfield3;
 private JTextField textfield4;
 private JTextField textfield5;
 private JTextField textfield6;
 private JTextField textfield7;
 private JTextField textfield8;
 private JTextField textfield9;

 //Constructor 
 public RegistOjekGUI(){

  this.setTitle("RegistOjekGUI");
  this.setSize(300,500);
  //menu generate method
  generateMenu();
  this.setJMenuBar(menuBar);

  //pane with null layout
  JPanel contentPane = new JPanel(null);
  contentPane.setPreferredSize(new Dimension(300,500));
  contentPane.setBackground(new Color(192,192,192));


  button1 = new JButton();
  button1.setBounds(95,370,90,35);
  button1.setBackground(new Color(214,217,223));
  button1.setForeground(new Color(0,0,0));
  button1.setEnabled(true);
  button1.setFont(new Font("sansserif",0,12));
  button1.setText("Registrasi");
  button1.setVisible(true);

  label1 = new JLabel();
  label1.setBounds(104,21,150,35);
  label1.setBackground(new Color(214,217,223));
  label1.setForeground(new Color(0,0,0));
  label1.setEnabled(true);
  label1.setFont(new Font("SansSerif",0,14));
  label1.setText("Registrasi Ojek");
  label1.setVisible(true);

  label2 = new JLabel();
  label2.setBounds(15,80,90,35);
  label2.setBackground(new Color(214,217,223));
  label2.setForeground(new Color(0,0,0));
  label2.setEnabled(true);
  label2.setFont(new Font("sansserif",0,12));
  label2.setText("Nama");
  label2.setVisible(true);

  label3 = new JLabel();
  label3.setBounds(15,120,90,35);
  label3.setBackground(new Color(214,217,223));
  label3.setForeground(new Color(0,0,0));
  label3.setEnabled(true);
  label3.setFont(new Font("sansserif",0,12));
  label3.setText("Telepon");
  label3.setVisible(true);

  label4 = new JLabel();
  label4.setBounds(15,160,90,35);
  label4.setBackground(new Color(214,217,223));
  label4.setForeground(new Color(0,0,0));
  label4.setEnabled(true);
  label4.setFont(new Font("sansserif",0,12));
  label4.setText("Email");
  label4.setVisible(true);

  label5 = new JLabel();
  label5.setBounds(16,200,90,35);
  label5.setBackground(new Color(214,217,223));
  label5.setForeground(new Color(0,0,0));
  label5.setEnabled(true);
  label5.setFont(new Font("sansserif",0,12));
  label5.setText("DoB");
  label5.setVisible(true);

  label6 = new JLabel();
  label6.setBounds(15,240,90,35);
  label6.setBackground(new Color(214,217,223));
  label6.setForeground(new Color(0,0,0));
  label6.setEnabled(true);
  label6.setFont(new Font("sansserif",0,12));
  label6.setText("Plat");
  label6.setVisible(true);

  label7 = new JLabel();
  label7.setBounds(15,280,90,35);
  label7.setBackground(new Color(214,217,223));
  label7.setForeground(new Color(0,0,0));
  label7.setEnabled(true);
  label7.setFont(new Font("sansserif",0,12));
  label7.setText("Lokasi");
  label7.setVisible(true);

  textfield1 = new JTextField();
  textfield1.setBounds(95,80,150,35);
  textfield1.setBackground(new Color(255,255,255));
  textfield1.setForeground(new Color(0,0,0));
  textfield1.setEnabled(true);
  textfield1.setFont(new Font("sansserif",0,12));
  textfield1.setText("Nama");
  textfield1.setVisible(true);

  textfield2 = new JTextField();
  textfield2.setBounds(95,120,150,35);
  textfield2.setBackground(new Color(255,255,255));
  textfield2.setForeground(new Color(0,0,0));
  textfield2.setEnabled(true);
  textfield2.setFont(new Font("sansserif",0,12));
  textfield2.setText("082xxxx");
  textfield2.setVisible(true);

  textfield3 = new JTextField();
  textfield3.setBounds(95,160,150,35);
  textfield3.setBackground(new Color(255,255,255));
  textfield3.setForeground(new Color(0,0,0));
  textfield3.setEnabled(true);
  textfield3.setFont(new Font("sansserif",0,12));
  textfield3.setText("example@ex.com");
  textfield3.setVisible(true);

  textfield4 = new JTextField();
  textfield4.setBounds(95,200,150,35);
  textfield4.setBackground(new Color(255,255,255));
  textfield4.setForeground(new Color(0,0,0));
  textfield4.setEnabled(true);
  textfield4.setFont(new Font("sansserif",0,12));
  textfield4.setText("dd/MM/yyyy");
  textfield4.setVisible(true);

  textfield5 = new JTextField();
  textfield5.setBounds(95,240,150,35);
  textfield5.setBackground(new Color(255,255,255));
  textfield5.setForeground(new Color(0,0,0));
  textfield5.setEnabled(true);
  textfield5.setFont(new Font("SansSerif",0,12));
  textfield5.setText("Bxx3xA");
  textfield5.setVisible(true);

  textfield6 = new JTextField();
  textfield6.setBounds(95,280,30,35);
  textfield6.setBackground(new Color(255,255,255));
  textfield6.setForeground(new Color(0,0,0));
  textfield6.setEnabled(true);
  textfield6.setFont(new Font("sansserif",0,12));
  textfield6.setText("x");
  textfield6.setVisible(true);

  textfield7 = new JTextField();
  textfield7.setBounds(160,280,30,35);
  textfield7.setBackground(new Color(255,255,255));
  textfield7.setForeground(new Color(0,0,0));
  textfield7.setEnabled(true);
  textfield7.setFont(new Font("sansserif",0,12));
  textfield7.setText("y");
  textfield7.setVisible(true);

  textfield8 = new JTextField();
  textfield8.setBounds(95,320,90,35);
  textfield8.setBackground(new Color(255,255,255));
  textfield8.setForeground(new Color(0,0,0));
  textfield8.setEnabled(true);
  textfield8.setFont(new Font("sansserif",0,12));
  textfield8.setText("Nama Lokasi");
  textfield8.setVisible(true);

  textfield9 = new JTextField();
  textfield9.setBounds(190,320,90,35);
  textfield9.setBackground(new Color(255,255,255));
  textfield9.setForeground(new Color(0,0,0));
  textfield9.setEnabled(true);
  textfield9.setFont(new Font("sansserif",0,12));
  textfield9.setText("Keterangan");
  textfield9.setVisible(true);

  //adding components to contentPane panel
  contentPane.add(button1);
  contentPane.add(label1);
  contentPane.add(label2);
  contentPane.add(label3);
  contentPane.add(label4);
  contentPane.add(label5);
  contentPane.add(label6);
  contentPane.add(label7);
  contentPane.add(textfield1);
  contentPane.add(textfield2);
  contentPane.add(textfield3);
  contentPane.add(textfield4);
  contentPane.add(textfield5);
  contentPane.add(textfield6);
  contentPane.add(textfield7);
  contentPane.add(textfield8);
  contentPane.add(textfield9);

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
    new RegistOjekGUI();
   }
  });
 }

}
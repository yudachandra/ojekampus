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
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import javax.swing.border.Border;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;


public class RegistOjekGUI extends JFrame {

 private JMenuBar menuBar;
 private JButton buttonregist;
 private JLabel label1;
 private JLabel label2;
 private JLabel label3;
 private JLabel label4;
 private JLabel label5;
 private JLabel label6;
 private JLabel label7;
 private JTextField namaojek;
 private JTextField notelp;
 private JTextField email;
 private JTextField dob;
 private JTextField noplat;
 private JTextField xlokasi;
 private JTextField ylokasi;
 private JTextField namalokasi;
 private JTextField ketlokasi;

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


  buttonregist = new JButton();
  buttonregist.setBounds(95,370,90,35);
  buttonregist.setBackground(new Color(214,217,223));
  buttonregist.setForeground(new Color(0,0,0));
  buttonregist.setEnabled(true);
  buttonregist.setFont(new Font("sansserif",0,12));
  buttonregist.setText("Registrasi");
  buttonregist.setVisible(true);
  buttonregist.addActionListener(new ActionListener()
  {
            @Override
            public void actionPerformed(ActionEvent e){
               try {
                            DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
                            String dateAsString = dob.getText();
                            Date date = sourceFormat.parse(dateAsString);
                            DatabaseUser.addOjek(new Ojek(
                                DatabaseUser.getIDPelangganTerakhir(),
                                namaojek.getText(),
                                new Lokasi(
                                    namalokasi.getText(),
                                    Integer.parseInt(xlokasi.getText()),
                                    Integer.parseInt(ylokasi.getText()),
                                    ketlokasi.getText()
                                        )));
                            DatabaseUser.addOjek(new Ojek(
                                notelp.getText(),
                                email.getText(),
                                date
                                    )
                                );
                            JOptionPane.showMessageDialog(null, "Registrasi Berhasil", "Registrasi Berhasil", JOptionPane.INFORMATION_MESSAGE);
                        } catch(java.text.ParseException | NumberFormatException exception) {
                            JOptionPane.showMessageDialog(null, exception.getMessage(), "Registrasi Gagal", JOptionPane.ERROR_MESSAGE);
                        }
                }
            }
        );

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

  namaojek = new JTextField();
  namaojek.setBounds(95,80,150,35);
  namaojek.setBackground(new Color(255,255,255));
  namaojek.setForeground(new Color(0,88,0));
  namaojek.setEnabled(true);
  namaojek.setFont(new Font("sansserif",0,12));
  namaojek.setText("Nama");
  namaojek.setVisible(true);
  namaojek.addFocusListener(new FocusListener()
  {
      @Override
      public void focusGained(FocusEvent klik)
      {
          namaojek.setText("");
      }
      
      @Override
      public void focusLost(FocusEvent klik)
      {
      }
  });
  

  notelp = new JTextField();
  notelp.setBounds(95,120,150,35);
  notelp.setBackground(new Color(255,255,255));
  notelp.setForeground(new Color(0,88,0));
  notelp.setEnabled(true);
  notelp.setFont(new Font("sansserif",0,12));
  notelp.setText("0812345678");
  notelp.setVisible(true);
  notelp.addFocusListener(new FocusListener()
  {
      @Override
      public void focusGained(FocusEvent klik)
      {
          notelp.setText("");
      }
      
      @Override
      public void focusLost(FocusEvent klik)
      {
      }
  });

  email = new JTextField();
  email.setBounds(95,160,150,35);
  email.setBackground(new Color(255,255,255));
  email.setForeground(new Color(0,88,0));
  email.setEnabled(true);
  email.setFont(new Font("sansserif",0,12));
  email.setText("example@ex.com");
  email.setVisible(true);
  email.addFocusListener(new FocusListener()
  {
      @Override
      public void focusGained(FocusEvent klik)
      {
          email.setText("");
      }
      
      @Override
      public void focusLost(FocusEvent klik)
      {
      }
  });

  dob = new JTextField();
  dob.setBounds(95,200,150,35);
  dob.setBackground(new Color(255,255,255));
  dob.setForeground(new Color(0,88,0));
  dob.setEnabled(true);
  dob.setFont(new Font("sansserif",0,12));
  dob.setText("dd/MM/yyyy");
  dob.setVisible(true);
  dob.addFocusListener(new FocusListener()
  {
      @Override
      public void focusGained(FocusEvent klik)
      {
          dob.setText("");
      }
      
      @Override
      public void focusLost(FocusEvent klik)
      {
      }
  });

  noplat = new JTextField();
  noplat.setBounds(95,240,150,35);
  noplat.setBackground(new Color(255,255,255));
  noplat.setForeground(new Color(0,88,0));
  noplat.setEnabled(true);
  noplat.setFont(new Font("SansSerif",0,12));
  noplat.setText("B3201TIX");
  noplat.setVisible(true);
  noplat.addFocusListener(new FocusListener()
  {
      @Override
      public void focusGained(FocusEvent klik)
      {
          noplat.setText("");
      }
      
      @Override
      public void focusLost(FocusEvent klik)
      {
      }
  });

  xlokasi = new JTextField();
  xlokasi.setBounds(95,280,30,35);
  xlokasi.setBackground(new Color(255,255,255));
  xlokasi.setForeground(new Color(0,88,0));
  xlokasi.setEnabled(true);
  xlokasi.setFont(new Font("sansserif",0,12));
  xlokasi.setText("X");
  xlokasi.setVisible(true);
  xlokasi.addFocusListener(new FocusListener()
  {
      @Override
      public void focusGained(FocusEvent klik)
      {
          xlokasi.setText("");
      }
      
      @Override
      public void focusLost(FocusEvent klik)
      {
      }
  });

  ylokasi = new JTextField();
  ylokasi.setBounds(160,280,30,35);
  ylokasi.setBackground(new Color(255,255,255));
  ylokasi.setForeground(new Color(0,88,0));
  ylokasi.setEnabled(true);
  ylokasi.setFont(new Font("sansserif",0,12));
  ylokasi.setText("Y");
  ylokasi.setVisible(true);
  ylokasi.addFocusListener(new FocusListener()
  {
      @Override
      public void focusGained(FocusEvent klik)
      {
          ylokasi.setText("");
      }
      
      @Override
      public void focusLost(FocusEvent klik)
      {
      }
  });

  namalokasi = new JTextField();
  namalokasi.setBounds(95,320,90,35);
  namalokasi.setBackground(new Color(255,255,255));
  namalokasi.setForeground(new Color(0,88,0));
  namalokasi.setEnabled(true);
  namalokasi.setFont(new Font("sansserif",0,12));
  namalokasi.setText("Nama Lokasi");
  namalokasi.setVisible(true);
  namalokasi.addFocusListener(new FocusListener()
  {
      @Override
      public void focusGained(FocusEvent klik)
      {
          namalokasi.setText("");
      }
      
      @Override
      public void focusLost(FocusEvent klik)
      {
      }
  });

  ketlokasi = new JTextField();
  ketlokasi.setBounds(190,320,90,35);
  ketlokasi.setBackground(new Color(255,255,255));
  ketlokasi.setForeground(new Color(0,88,0));
  ketlokasi.setEnabled(true);
  ketlokasi.setFont(new Font("sansserif",0,12));
  ketlokasi.setText("Keterangan");
  ketlokasi.setVisible(true);
  ketlokasi.addFocusListener(new FocusListener()
  {
      @Override
      public void focusGained(FocusEvent klik)
      {
          ketlokasi.setText("");
      }
      
      @Override
      public void focusLost(FocusEvent klik)
      {
      }
  });

  //adding components to contentPane panel
  contentPane.add(buttonregist);
  contentPane.add(label1);
  contentPane.add(label2);
  contentPane.add(label3);
  contentPane.add(label4);
  contentPane.add(label5);
  contentPane.add(label6);
  contentPane.add(label7);
  contentPane.add(namaojek);
  contentPane.add(notelp);
  contentPane.add(email);
  contentPane.add(dob);
  contentPane.add(noplat);
  contentPane.add(xlokasi);
  contentPane.add(ylokasi);
  contentPane.add(namalokasi);
  contentPane.add(ketlokasi);

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
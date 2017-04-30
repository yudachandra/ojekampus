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
import javax.swing.*;


public class OjekLoginGUI extends JFrame {

 private JMenuBar menuBar;
 private JButton enter;
 private JButton decline;
 private JButton accept;
 private JLabel label1;
 private JLabel label2;
 private JLabel infopesanan;
 private JTextField textstatus;
 private JTextField textnoid;
 int idOjek;

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


  enter = new JButton();
  enter.setBounds(298,110,90,35);
  enter.setBackground(new Color(214,217,223));
  enter.setForeground(new Color(0,0,0));
  enter.setEnabled(true);
  enter.setFont(new Font("sansserif",0,12));
  enter.setText("Enter");
  enter.setVisible(true);
  enter.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(
                    !textstatus.getText().equals("")
                ){
                    if(
                        !textstatus.getText().equals("ID")
                    ){
                        try {
                            if(DatabaseUser.getUserOjek(Integer.parseInt(textstatus.getText())) == null)
                                JOptionPane.showMessageDialog(null, "ID tidak ditemukan", "alert", JOptionPane.WARNING_MESSAGE);
                            else {
                                idOjek = Integer.parseInt(textstatus.getText());
                                textstatus.setText(DatabaseUser.getUserOjek(idOjek).getStatus().toString());
                                if(DatabaseUser.getUserOjek(idOjek).getPesanan() == null)
                                    throw new PesananOlehOjekTidakDitemukanException(DatabaseUser.getUserOjek(idOjek));
                                else {    
                                    infopesanan.setText("Dipesan Oleh : " + DatabaseUser.getUserOjek(idOjek).getPesanan().getPelanggan().getNama() + "Tipe Layanan : " + DatabaseUser.getUserOjek(idOjek).getPesanan().getTipeLayanan());
                                }
                            }
                        } catch(NumberFormatException | PesananOlehOjekTidakDitemukanException exception){
                            JOptionPane.showMessageDialog(null, exception.getMessage(), "alert", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "ID harus diisi", "alert", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID tidak boleh kosong", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

  decline = new JButton();
  decline.setBounds(268,288,90,35);
  decline.setBackground(new Color(214,217,223));
  decline.setForeground(new Color(0,0,0));
  decline.setEnabled(true);
  decline.setFont(new Font("sansserif",0,12));
  decline.setText("Decline");
  decline.setVisible(true);
  decline.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Administrasi.pesananDibatalkan(DatabaseUser.getUserOjek(idOjek));
            }
        });
  
  accept = new JButton();
  accept.setBounds(102,288,90,35);
  accept.setBackground(new Color(214,217,223));
  accept.setForeground(new Color(0,0,0));
  accept.setEnabled(true);
  accept.setFont(new Font("sansserif",0,12));
  accept.setText("Accept");
  accept.setVisible(true);
  accept.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println();
            }
        });

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

  infopesanan = new JLabel();
  infopesanan.setBounds(172,183,118,31);
  infopesanan.setBackground(new Color(214,217,223));
  infopesanan.setForeground(new Color(0,0,0));
  infopesanan.setEnabled(true);
  infopesanan.setFont(new Font("sansserif",0,12));
  infopesanan.setText("Informasi Pesanan");
  infopesanan.setVisible(true);

  textstatus = new JTextField();
  textstatus.setBounds(161,230,130,35);
  textstatus.setBackground(new Color(255,255,255));
  textstatus.setForeground(new Color(0,88,0));
  textstatus.setEnabled(true);
  textstatus.setFont(new Font("sansserif",0,12));
  textstatus.setText("Status");
  textstatus.setVisible(true);
  textstatus.addFocusListener(new FocusListener()
  {
    @Override
    public void focusGained(FocusEvent klik)
    {
         textstatus.setText("");
    }
            
    @Override
    public void focusLost(FocusEvent klik)
    {
    }
  });


  textnoid = new JTextField();
  textnoid.setBounds(134,110,130,35);
  textnoid.setBackground(new Color(255,255,255));
  textnoid.setForeground(new Color(0,88,0));
  textnoid.setEnabled(true);
  textnoid.setFont(new Font("sansserif",0,12));
  textnoid.setText("No ID");
  textnoid.setVisible(true);
  textnoid.addFocusListener(new FocusListener()
  {
    @Override
    public void focusGained(FocusEvent klik)
    {
         textnoid.setText("");
    }
            
    @Override
    public void focusLost(FocusEvent klik)
    {
    }
  });

  //adding components to contentPane panel
  contentPane.add(enter);
  contentPane.add(decline);
  contentPane.add(accept);
  contentPane.add(label1);
  contentPane.add(label2);
  contentPane.add(infopesanan);
  contentPane.add(textstatus);
  contentPane.add(textnoid);

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
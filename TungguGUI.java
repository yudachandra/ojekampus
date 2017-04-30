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


public class TungguGUI extends JFrame {

 private JMenuBar menuBar;
 private JButton enterbutton;
 private JButton button2;
 private JButton declinebutton;
 private JButton deletebutton;
 private JLabel label1;
 private JLabel label2;
 private JLabel infopesanan;
 private JTextField textnoid;
 private JTextField textstatus;
 int idPelanggan = -1;

 //Constructor 
 public TungguGUI(){

  this.setTitle("TungguGUI");
  this.setSize(400,300);
  //menu generate method
  generateMenu();
  this.setJMenuBar(menuBar);

  //pane with null layout
  JPanel contentPane = new JPanel(null);
  contentPane.setPreferredSize(new Dimension(400,300));
  contentPane.setBackground(new Color(192,192,192));


  enterbutton = new JButton();
  enterbutton.setBounds(231,65,90,35);
  enterbutton.setBackground(new Color(214,217,223));
  enterbutton.setForeground(new Color(0,0,0));
  enterbutton.setEnabled(true);
  enterbutton.setFont(new Font("sansserif",0,12));
  enterbutton.setText("Enter");
  enterbutton.setVisible(true);
  enterbutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(
                    !textnoid.getText().equals("")
                ){
                    if(
                        !textnoid.getText().equals("ID")
                    ){
                        try {
                            if(DatabaseUser.getUserPelanggan(Integer.parseInt(textnoid.getText())) == null)
                                JOptionPane.showMessageDialog(null, "ID tidak ditemukan", "alert", JOptionPane.WARNING_MESSAGE);
                            else{
                                idPelanggan = Integer.parseInt(textnoid.getText());
                                if(DatabasePesanan.getPesanan(DatabaseUser.getUserPelanggan(idPelanggan)) == null)
                                    throw new PesananTidakDitemukanException(DatabasePesanan.getPesanan(DatabaseUser.getUserPelanggan(idPelanggan)));
                                else {
                                    infopesanan.setText("Dipesan Oleh : " + DatabasePesanan.getPesanan(DatabaseUser.getUserPelanggan(idPelanggan)).getPelanggan().getNama() + "Dilayani Oleh : " + DatabasePesanan.getPesanan(DatabaseUser.getUserPelanggan(idPelanggan)).getPelayan().getNama());
                                    //statusPesananText.setText(DatabasePesanan.getPesanan(DatabaseUser.getUserPelanggan(idPelanggan)).getFinalStatus());
                                }
                            }
                        } catch(NumberFormatException | PesananTidakDitemukanException exception){
                            JOptionPane.showMessageDialog(null, "ID merupakan angka", "alert", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "ID harus diisi", "alert", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID tidak boleh kosong", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

  button2 = new JButton();
  button2.setBounds(80,200,90,35);
  button2.setBackground(new Color(214,217,223));
  button2.setForeground(new Color(0,0,0));
  button2.setEnabled(true);
  button2.setFont(new Font("sansserif",0,12));
  button2.setText("Accept");
  button2.setVisible(true);

  declinebutton = new JButton();
  declinebutton.setBounds(180,200,90,35);
  declinebutton.setBackground(new Color(214,217,223));
  declinebutton.setForeground(new Color(0,0,0));
  declinebutton.setEnabled(true);
  declinebutton.setFont(new Font("sansserif",0,12));
  declinebutton.setText("Decline");
  declinebutton.setVisible(true);
  declinebutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(idPelanggan != -1)
                    Administrasi.pesananDibatalkan(DatabaseUser.getUserPelanggan(idPelanggan));
            }
        });

  deletebutton = new JButton();
  deletebutton.setBounds(130,240,90,35);
  deletebutton.setBackground(new Color(214,217,223));
  deletebutton.setForeground(new Color(0,0,0));
  deletebutton.setEnabled(true);
  deletebutton.setFont(new Font("sansserif",0,12));
  deletebutton.setText("Delete");
  deletebutton.setVisible(true);
  deletebutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(idPelanggan != -1){
                    try {
                        DatabasePesanan.hapusPesanan(DatabaseUser.getUserPelanggan(idPelanggan));
                    } catch(PesananOlehPelangganTidakDitemukanException exception) {
                        System.out.println(exception.getMessage());
                    }
                    }
           }
        });

  label1 = new JLabel();
  label1.setBounds(130,25,170,31);
  label1.setBackground(new Color(214,217,223));
  label1.setForeground(new Color(0,0,0));
  label1.setEnabled(true);
  label1.setFont(new Font("SansSerif",0,16));
  label1.setText("Customer Menunggu");
  label1.setVisible(true);

  label2 = new JLabel();
  label2.setBounds(78,66,90,35);
  label2.setBackground(new Color(214,217,223));
  label2.setForeground(new Color(0,0,0));
  label2.setEnabled(true);
  label2.setFont(new Font("sansserif",0,12));
  label2.setText("ID          :");
  label2.setVisible(true);

  infopesanan = new JLabel();
  infopesanan.setBounds(130,120,146,34);
  infopesanan.setBackground(new Color(214,217,223));
  infopesanan.setForeground(new Color(0,0,0));
  infopesanan.setEnabled(true);
  infopesanan.setFont(new Font("SansSerif",0,14));
  infopesanan.setText("Informasi Pesanan");
  infopesanan.setVisible(true);

  textnoid = new JTextField();
  textnoid.setBounds(130,65,90,35);
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

  textstatus = new JTextField();
  textstatus.setBounds(130,160,90,35);
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

  //adding components to contentPane panel
  contentPane.add(enterbutton);
  contentPane.add(button2);
  contentPane.add(declinebutton);
  contentPane.add(deletebutton);
  contentPane.add(label1);
  contentPane.add(label2);
  contentPane.add(infopesanan);
  contentPane.add(textnoid);
  contentPane.add(textstatus);

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
    new TungguGUI();
   }
  });
 }

}
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


public class RegistrasiGUI extends JFrame {

    private JMenuBar menuBar;
    private JLabel Nama;
    private JButton buttonregist;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField textnama;
    private JTextField texttelp;
    private JTextField textdob;
    private JTextField textemail;

    //Constructor 
    public RegistrasiGUI(){

        this.setTitle("RegistrasiGUI");
        this.setSize(300,350);
        
        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(300,350));
        contentPane.setBackground(new Color(192,192,192));


        Nama = new JLabel();
        Nama.setBounds(20,80,90,35);
        Nama.setBackground(new Color(214,217,223));
        Nama.setForeground(new Color(0,0,0));
        Nama.setEnabled(true);
        Nama.setFont(new Font("sansserif",0,12));
        Nama.setText("Nama       :");
        Nama.setVisible(true);

        buttonregist = new JButton();
        buttonregist.setBounds(150,240,90,35);
        buttonregist.setBackground(new Color(214,217,223));
        buttonregist.setForeground(new Color(0,0,0));
        buttonregist.setEnabled(true);
        buttonregist.setFont(new Font("sansserif",0,12));
        buttonregist.setText("Registrasi");
        buttonregist.setVisible(true);
        buttonregist.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(
                    !textnama.getText().equals("") ||
                    !texttelp.getText().equals("")
                ){
                        try {
                            DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
                            String dateAsString = textdob.getText();
                            Date date = sourceFormat.parse(dateAsString);
                            DatabaseUser.addPelanggan(new Pelanggan(
                                DatabaseUser.getIDPelangganTerakhir(), 
                                textnama.getText(), 
                                texttelp.getText()));
                            JOptionPane.showMessageDialog(null, "Registrasi Berhasil", "Registrasi Berhasil", JOptionPane.INFORMATION_MESSAGE);
                        } catch(java.text.ParseException | NumberFormatException exception) {
                            JOptionPane.showMessageDialog(null, exception.getMessage(), "Registrasi Gagal", JOptionPane.ERROR_MESSAGE);
                        }
                } else {
                    JOptionPane.showMessageDialog(null, "Input tidak boleh kosong", "Registrasi Gagal", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonregist.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                DatabaseUser.addPelanggan(new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), textnama.getText(), texttelp.getText()));
                Administrasi.printPelangganDatabase();
            }
        });

        label2 = new JLabel();
        label2.setBounds(20,120,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Telp.     :");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(20,160,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Email     :");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(20,200,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Date of Birth  :");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(98,5,90,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Date of Birth");
        label5.setVisible(false);

        label6 = new JLabel();
        label6.setBounds(30,25,180,30);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("SansSerif",0,20));
        label6.setText("Registrasi Customer");
        label6.setVisible(true);

        textnama = new JTextField();
        textnama.setBounds(120,80,140,30);
        textnama.setBackground(new Color(255,255,255));
        textnama.setForeground(new Color(0,88,0));
        textnama.setEnabled(true);
        textnama.setFont(new Font("sansserif",0,12));
        textnama.setText("ex. Yuda Chandra");
        textnama.setVisible(true);
        textnama.addFocusListener(new FocusListener()
        {
           @Override
           public void focusGained(FocusEvent klik)
           {
                textnama.setText("");
           }
            
            @Override
            public void focusLost(FocusEvent klik)
           {
           }
        });

        texttelp = new JTextField();
        texttelp.setBounds(120,120,140,30);
        texttelp.setBackground(new Color(255,255,255));
        texttelp.setForeground(new Color(0,88,0));
        texttelp.setEnabled(true);
        texttelp.setFont(new Font("sansserif",0,12));
        texttelp.setText("ex. 021987654");
        texttelp.setVisible(true);
        texttelp.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                texttelp.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        textdob = new JTextField();
        textdob.setBounds(120,200,140,30);
        textdob.setBackground(new Color(255,255,255));
        textdob.setForeground(new Color(0,88,0));
        textdob.setEnabled(true);
        textdob.setFont(new Font("sansserif",0,12));
        textdob.setText("dd/MM/yyyy");
        textdob.setVisible(true);
        textdob.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textdob.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        textemail = new JTextField();
        textemail.setBounds(120,160,140,30);
        textemail.setBackground(new Color(255,255,255));
        textemail.setForeground(new Color(0,88,0));
        textemail.setEnabled(true);
        textemail.setFont(new Font("sansserif",0,12));
        textemail.setText("ex. example@ex.com");
        textemail.setVisible(true);
        textemail.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textemail.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        //adding components to contentPane panel
        contentPane.add(Nama);
        contentPane.add(buttonregist);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(textnama);
        contentPane.add(texttelp);
        contentPane.add(textdob);
        contentPane.add(textemail);

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
                new RegistrasiGUI();
            }
        });
    }

}
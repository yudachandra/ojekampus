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


public class PesananGUI extends JFrame {

    private JMenuBar menuBar;
    private JLabel Nama;
    private JButton buttonregist;
    private JButton buttonenter;
    private JComboBox pilihTipeLayanan;
    private JLabel tipelayanan;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JTextField textid;
    private JTextField ketlokawal;
    private JTextField namalokawal;
    private JTextField ketlokakhir;
    private JTextField npawal;
    private JTextField npakhir;
    private JTextField biaya;
    private JTextField xawal;
    private JTextField xakhir;
    private JTextField yawal;
    private JTextField yakhir;
    private JTextField namalokakhir;
    JComboBox<TipeLayanan> tipeLayananList;

    //Constructor 
    public PesananGUI(){

        this.setTitle("PesananGUI");
        this.setSize(500,450);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,450));
        contentPane.setBackground(new Color(192,192,192));


        Nama = new JLabel();
        Nama.setBounds(20,80,90,35);
        Nama.setBackground(new Color(214,217,223));
        Nama.setForeground(new Color(0,0,0));
        Nama.setEnabled(true);
        Nama.setFont(new Font("sansserif",0,12));
        Nama.setText("ID       :");
        Nama.setVisible(true);

        buttonregist = new JButton();
        buttonregist.setBounds(375,367,90,35);
        buttonregist.setBackground(new Color(214,217,223));
        buttonregist.setForeground(new Color(0,0,0));
        buttonregist.setEnabled(true);
        buttonregist.setFont(new Font("sansserif",0,12));
        buttonregist.setText("Registrasi");
        buttonregist.setVisible(true);
        buttonregist.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                try
                {
                    DatabasePesanan.addPesanan
                    (
                        new Pesanan
                            (
                                DatabaseUser.getUserPelanggan(Integer.parseInt(textid.getText())),
                                (TipeLayanan)pilihTipeLayanan.getSelectedItem(),
                                new Lokasi(namalokawal.getText(), Integer.parseInt(xawal.getText()), Integer.parseInt(yawal.getText()), ketlokawal.getText()),
                                new Lokasi(namalokakhir.getText(), Integer.parseInt(xakhir.getText()), Integer.parseInt(yakhir.getText()), ketlokakhir.getText()),
                                npawal.getText(),
                                npakhir.getText(),
                                Double.parseDouble(biaya.getText())
                             )
                    );
                            Administrasi.jalankanSistemPenugas();
                }
                catch(PesananSudahAdaException sudah_ada)
                {
                    System.out.println(sudah_ada.getMessage());
                    
                }
            }
        });

        buttonenter = new JButton();
        buttonenter.setBounds(325,77,90,35);
        buttonenter.setBackground(new Color(214,217,223));
        buttonenter.setForeground(new Color(0,0,0));
        buttonenter.setEnabled(true);
        buttonenter.setFont(new Font("sansserif",0,12));
        buttonenter.setText("Enter");
        buttonenter.setVisible(true);
        buttonenter.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                if(
                    !textid.getText().equals("")
                ){
                    if(
                        !textid.getText().equals("ID")
                    ){
                        try {
                            if(DatabaseUser.getUserPelanggan(Integer.parseInt(textid.getText())) == null)
                                JOptionPane.showMessageDialog(null, "ID tidak ditemukan", "alert", JOptionPane.WARNING_MESSAGE);
                            else
                                JOptionPane.showMessageDialog(null, "ID ditemukan", "alert", JOptionPane.INFORMATION_MESSAGE);
                        } catch(NumberFormatException exception){
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

        pilihTipeLayanan = new JComboBox<>();
        pilihTipeLayanan.setModel(new DefaultComboBoxModel<>(TipeLayanan.values()));
        pilihTipeLayanan.setSelectedIndex(0);
        pilihTipeLayanan.setBounds(120,120,180,30);
        pilihTipeLayanan.setBackground(new Color(214,217,223));
        pilihTipeLayanan.setForeground(new Color(0,0,0));
        pilihTipeLayanan.setEnabled(true);
        pilihTipeLayanan.setFont(new Font("sansserif",0,12));
        pilihTipeLayanan.setVisible(true);

        tipelayanan = new JLabel();
        tipelayanan.setBounds(20,120,90,35);
        tipelayanan.setBackground(new Color(214,217,223));
        tipelayanan.setForeground(new Color(0,0,0));
        tipelayanan.setEnabled(true);
        tipelayanan.setFont(new Font("sansserif",0,12));
        tipelayanan.setText("Tipe Layanan     :");
        tipelayanan.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(20,160,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Lokasi Awal");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(20,200,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Lokasi Akhir");
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
        label6.setBounds(30,23,180,30);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("SansSerif",0,20));
        label6.setText("Registrasi Customer");
        label6.setVisible(true);

        label7 = new JLabel();
        label7.setBounds(20,250,90,35);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("sansserif",0,12));
        label7.setText("NP. Awal");
        label7.setVisible(true);

        label8 = new JLabel();
        label8.setBounds(20,290,90,35);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("sansserif",0,12));
        label8.setText("NP. Akhir");
        label8.setVisible(true);

        label9 = new JLabel();
        label9.setBounds(20,340,90,35);
        label9.setBackground(new Color(214,217,223));
        label9.setForeground(new Color(0,0,0));
        label9.setEnabled(true);
        label9.setFont(new Font("sansserif",0,12));
        label9.setText("Biaya");
        label9.setVisible(true);

        textid = new JTextField();
        textid.setBounds(120,80,180,30);
        textid.setBackground(new Color(255,255,255));
        textid.setForeground(new Color(0,88,0));
        textid.setEnabled(true);
        textid.setFont(new Font("sansserif",0,12));
        textid.setText("ID");
        textid.setVisible(true);
        textid.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textid.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        ketlokawal = new JTextField();
        ketlokawal.setBounds(380,160,100,35);
        ketlokawal.setBackground(new Color(255,255,255));
        ketlokawal.setForeground(new Color(0,88,0));
        ketlokawal.setEnabled(true);
        ketlokawal.setFont(new Font("sansserif",0,12));
        ketlokawal.setText("Keterangan");
        ketlokawal.setVisible(true);
        ketlokawal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                ketlokawal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        namalokawal = new JTextField();
        namalokawal.setBounds(260,200,100,35);
        namalokawal.setBackground(new Color(255,255,255));
        namalokawal.setForeground(new Color(0,88,0));
        namalokawal.setEnabled(true);
        namalokawal.setFont(new Font("sansserif",0,12));
        namalokawal.setText("Nama Lokasi");
        namalokawal.setVisible(true);
        namalokawal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                namalokawal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        ketlokakhir = new JTextField();
        ketlokakhir.setBounds(380,200,100,35);
        ketlokakhir.setBackground(new Color(255,255,255));
        ketlokakhir.setForeground(new Color(0,88,0));
        ketlokakhir.setEnabled(true);
        ketlokakhir.setFont(new Font("sansserif",0,12));
        ketlokakhir.setText("Keterangan");
        ketlokakhir.setVisible(true);
        ketlokakhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                ketlokakhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        npawal = new JTextField();
        npawal.setBounds(120,294,180,30);
        npawal.setBackground(new Color(255,255,255));
        npawal.setForeground(new Color(0,88,0));
        npawal.setEnabled(true);
        npawal.setFont(new Font("sansserif",0,12));
        npawal.setText("Nama Pelanggan Awal");
        npawal.setVisible(true);
        npawal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                npawal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        npakhir = new JTextField();
        npakhir.setBounds(120,250,180,30);
        npakhir.setBackground(new Color(255,255,255));
        npakhir.setForeground(new Color(0,88,0));
        npakhir.setEnabled(true);
        npakhir.setFont(new Font("sansserif",0,12));
        npakhir.setText("Nama Pelanggan Akhir");
        npakhir.setVisible(true);
        npakhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                npakhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        biaya = new JTextField();
        biaya.setBounds(121,339,180,30);
        biaya.setBackground(new Color(255,255,255));
        biaya.setForeground(new Color(0,88,0));
        biaya.setEnabled(true);
        biaya.setFont(new Font("sansserif",0,12));
        biaya.setText("Rp. 15.000");
        biaya.setVisible(true);
        biaya.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                biaya.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
            
        });

        xawal = new JTextField();
        xawal.setBounds(120,160,50,35);
        xawal.setBackground(new Color(255,255,255));
        xawal.setForeground(new Color(0,88,0));
        xawal.setEnabled(true);
        xawal.setFont(new Font("sansserif",0,12));
        xawal.setText("X");
        xawal.setVisible(true);
        xawal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                xawal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        xakhir = new JTextField();
        xakhir.setBounds(120,200,50,35);
        xakhir.setBackground(new Color(255,255,255));
        xakhir.setForeground(new Color(0,88,0));
        xakhir.setEnabled(true);
        xakhir.setFont(new Font("sansserif",0,12));
        xakhir.setText("X");
        xakhir.setVisible(true);
        xakhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                xakhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        yawal = new JTextField();
        yawal.setBounds(180,160,50,35);
        yawal.setBackground(new Color(255,255,255));
        yawal.setForeground(new Color(0,88,0));
        yawal.setEnabled(true);
        yawal.setFont(new Font("sansserif",0,12));
        yawal.setText("Y");
        yawal.setVisible(true);
        yawal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                yawal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        yakhir = new JTextField();
        yakhir.setBounds(180,200,50,35);
        yakhir.setBackground(new Color(255,255,255));
        yakhir.setForeground(new Color(0,88,0));
        yakhir.setEnabled(true);
        yakhir.setFont(new Font("sansserif",0,12));
        yakhir.setText("Y");
        yakhir.setVisible(true);
        yakhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                yakhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        namalokakhir = new JTextField();
        namalokakhir.setBounds(260,160,100,35);
        namalokakhir.setBackground(new Color(255,255,255));
        namalokakhir.setForeground(new Color(0,88,0));
        namalokakhir.setEnabled(true);
        namalokakhir.setFont(new Font("sansserif",0,12));
        namalokakhir.setText("Nama Lokasi");
        namalokakhir.setVisible(true);
        namalokakhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                namalokakhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
            }
        });

        //adding components to contentPane panel
        contentPane.add(Nama);
        contentPane.add(buttonregist);
        contentPane.add(buttonenter);
        contentPane.add(pilihTipeLayanan);
        contentPane.add(tipelayanan);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(label7);
        contentPane.add(label8);
        contentPane.add(label9);
        contentPane.add(textid);
        contentPane.add(ketlokawal);
        contentPane.add(namalokawal);
        contentPane.add(ketlokakhir);
        contentPane.add(npawal);
        contentPane.add(npakhir);
        contentPane.add(biaya);
        contentPane.add(xawal);
        contentPane.add(xakhir);
        contentPane.add(yawal);
        contentPane.add(yakhir);
        contentPane.add(namalokakhir);

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
                new PesananGUI();
            }
        });
    }

}
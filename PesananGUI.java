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


public class PesananGUI extends JFrame {

	private JMenuBar menuBar;
	private JLabel Nama;
	private JButton button1;
	private JButton button2;
	private JComboBox combobox1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JTextField textfield1;
	private JTextField textfield10;
	private JTextField textfield11;
	private JTextField textfield12;
	private JTextField textfield2;
	private JTextField textfield3;
	private JTextField textfield4;
	private JTextField textfield5;
	private JTextField textfield6;
	private JTextField textfield7;
	private JTextField textfield8;
	private JTextField textfield9;

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

		button1 = new JButton();
		button1.setBounds(375,367,90,35);
		button1.setBackground(new Color(214,217,223));
		button1.setForeground(new Color(0,0,0));
		button1.setEnabled(true);
		button1.setFont(new Font("sansserif",0,12));
		button1.setText("Registrasi");
		button1.setVisible(true);

		button2 = new JButton();
		button2.setBounds(325,77,90,35);
		button2.setBackground(new Color(214,217,223));
		button2.setForeground(new Color(0,0,0));
		button2.setEnabled(true);
		button2.setFont(new Font("sansserif",0,12));
		button2.setText("Enter");
		button2.setVisible(true);

		combobox1 = new JComboBox();
		combobox1.setBounds(120,120,180,30);
		combobox1.setBackground(new Color(214,217,223));
		combobox1.setForeground(new Color(0,0,0));
		combobox1.setEnabled(true);
		combobox1.setFont(new Font("sansserif",0,12));
		combobox1.setVisible(true);

		label2 = new JLabel();
		label2.setBounds(20,120,90,35);
		label2.setBackground(new Color(214,217,223));
		label2.setForeground(new Color(0,0,0));
		label2.setEnabled(true);
		label2.setFont(new Font("sansserif",0,12));
		label2.setText("Tipe Layanan     :");
		label2.setVisible(true);

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

		textfield1 = new JTextField();
		textfield1.setBounds(120,80,180,30);
		textfield1.setBackground(new Color(255,255,255));
		textfield1.setForeground(new Color(0,88,0));
		textfield1.setEnabled(true);
		textfield1.setFont(new Font("sansserif",0,12));
		textfield1.setText("id");
		textfield1.setVisible(true);

		textfield10 = new JTextField();
		textfield10.setBounds(380,160,100,35);
		textfield10.setBackground(new Color(255,255,255));
		textfield10.setForeground(new Color(0,0,0));
		textfield10.setEnabled(true);
		textfield10.setFont(new Font("sansserif",0,12));
		textfield10.setText("Keterangan");
		textfield10.setVisible(true);

		textfield11 = new JTextField();
		textfield11.setBounds(260,200,100,35);
		textfield11.setBackground(new Color(255,255,255));
		textfield11.setForeground(new Color(0,0,0));
		textfield11.setEnabled(true);
		textfield11.setFont(new Font("sansserif",0,12));
		textfield11.setText("Nama Lokasi");
		textfield11.setVisible(true);

		textfield12 = new JTextField();
		textfield12.setBounds(380,200,100,35);
		textfield12.setBackground(new Color(255,255,255));
		textfield12.setForeground(new Color(0,0,0));
		textfield12.setEnabled(true);
		textfield12.setFont(new Font("sansserif",0,12));
		textfield12.setText("Keterangan");
		textfield12.setVisible(true);

		textfield2 = new JTextField();
		textfield2.setBounds(120,294,180,30);
		textfield2.setBackground(new Color(255,255,255));
		textfield2.setForeground(new Color(0,88,0));
		textfield2.setEnabled(true);
		textfield2.setFont(new Font("sansserif",0,12));
		textfield2.setText("");
		textfield2.setVisible(true);

		textfield3 = new JTextField();
		textfield3.setBounds(120,250,180,30);
		textfield3.setBackground(new Color(255,255,255));
		textfield3.setForeground(new Color(0,88,0));
		textfield3.setEnabled(true);
		textfield3.setFont(new Font("sansserif",0,12));
		textfield3.setText("");
		textfield3.setVisible(true);

		textfield4 = new JTextField();
		textfield4.setBounds(121,339,180,30);
		textfield4.setBackground(new Color(255,255,255));
		textfield4.setForeground(new Color(0,88,0));
		textfield4.setEnabled(true);
		textfield4.setFont(new Font("sansserif",0,12));
		textfield4.setText("");
		textfield4.setVisible(true);

		textfield5 = new JTextField();
		textfield5.setBounds(120,160,50,35);
		textfield5.setBackground(new Color(255,255,255));
		textfield5.setForeground(new Color(0,0,0));
		textfield5.setEnabled(true);
		textfield5.setFont(new Font("sansserif",0,12));
		textfield5.setText("x");
		textfield5.setVisible(true);

		textfield6 = new JTextField();
		textfield6.setBounds(120,200,50,35);
		textfield6.setBackground(new Color(255,255,255));
		textfield6.setForeground(new Color(0,0,0));
		textfield6.setEnabled(true);
		textfield6.setFont(new Font("sansserif",0,12));
		textfield6.setText("x");
		textfield6.setVisible(true);

		textfield7 = new JTextField();
		textfield7.setBounds(180,160,50,35);
		textfield7.setBackground(new Color(255,255,255));
		textfield7.setForeground(new Color(0,0,0));
		textfield7.setEnabled(true);
		textfield7.setFont(new Font("sansserif",0,12));
		textfield7.setText("y");
		textfield7.setVisible(true);

		textfield8 = new JTextField();
		textfield8.setBounds(180,200,50,35);
		textfield8.setBackground(new Color(255,255,255));
		textfield8.setForeground(new Color(0,0,0));
		textfield8.setEnabled(true);
		textfield8.setFont(new Font("sansserif",0,12));
		textfield8.setText("y");
		textfield8.setVisible(true);

		textfield9 = new JTextField();
		textfield9.setBounds(260,160,100,35);
		textfield9.setBackground(new Color(255,255,255));
		textfield9.setForeground(new Color(0,0,0));
		textfield9.setEnabled(true);
		textfield9.setFont(new Font("sansserif",0,12));
		textfield9.setText("Nama Lokasi");
		textfield9.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(Nama);
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(combobox1);
		contentPane.add(label2);
		contentPane.add(label3);
		contentPane.add(label4);
		contentPane.add(label5);
		contentPane.add(label6);
		contentPane.add(label7);
		contentPane.add(label8);
		contentPane.add(label9);
		contentPane.add(textfield1);
		contentPane.add(textfield10);
		contentPane.add(textfield11);
		contentPane.add(textfield12);
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
				new PesananGUI();
			}
		});
	}

}
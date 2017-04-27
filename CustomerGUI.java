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


public class CustomerGUI extends JFrame {

	private JMenuBar menuBar;
	private JLabel Customer;
	private JButton Menunggu;
	private JButton Pemesanan;
	private JButton Registrasi;

	//Constructor 
	public CustomerGUI(){

		this.setTitle("CustomerGUI");
		this.setSize(250,300);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(250,300));
		contentPane.setBackground(new Color(192,192,192));


		Customer = new JLabel();
		Customer.setBounds(80,28,90,35);
		Customer.setBackground(new Color(214,217,223));
		Customer.setForeground(new Color(0,0,0));
		Customer.setEnabled(true);
		Customer.setFont(new Font("SansSerif",0,20));
		Customer.setText("Customer");
		Customer.setVisible(true);

		Menunggu = new JButton();
		Menunggu.setBounds(60,170,120,35);
		Menunggu.setBackground(new Color(214,217,223));
		Menunggu.setForeground(new Color(0,0,0));
		Menunggu.setEnabled(true);
		Menunggu.setFont(new Font("sansserif",0,12));
		Menunggu.setText("Menunggu");
		Menunggu.setVisible(true);

		Pemesanan = new JButton();
		Pemesanan.setBounds(60,130,120,35);
		Pemesanan.setBackground(new Color(214,217,223));
		Pemesanan.setForeground(new Color(0,0,0));
		Pemesanan.setEnabled(true);
		Pemesanan.setFont(new Font("sansserif",0,12));
		Pemesanan.setText("Pemesanan");
		Pemesanan.setVisible(true);

		Registrasi = new JButton();
		Registrasi.setBounds(60,90,120,35);
		Registrasi.setBackground(new Color(214,217,223));
		Registrasi.setForeground(new Color(0,0,0));
		Registrasi.setEnabled(true);
		Registrasi.setFont(new Font("SansSerif",0,12));
		Registrasi.setText("Registrasi");
		Registrasi.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(Customer);
		contentPane.add(Menunggu);
		contentPane.add(Pemesanan);
		contentPane.add(Registrasi);

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
				new CustomerGUI();
			}
		});
	}

}
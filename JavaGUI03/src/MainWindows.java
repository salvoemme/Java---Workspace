import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTabbedPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JCheckBox;


public class MainWindows {

	private JFrame frmApplicationV;
	private JTextField user;
	private JTextField psw;
	private JButton btnLogin;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTabbedPane tabbedPane;
	private JPanel panel_3;
	private JPanel panel_4;
	private JCheckBox chckbxNewCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindows window = new MainWindows();
					window.frmApplicationV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApplicationV = new JFrame();
		frmApplicationV.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				tabbedPane.setPreferredSize(new Dimension(frmApplicationV.getWidth()-20, 150));
			}
		});
		frmApplicationV.getContentPane().setBackground(Color.GRAY);
		frmApplicationV.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLogin.setPreferredSize(new Dimension(50, 50));
				btnLogin.setSize(50, 50);
			}
		});
		frmApplicationV.setBounds(100, 100, 623, 302);
		frmApplicationV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmApplicationV.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Credenziali di accesso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frmApplicationV.getContentPane().add(panel_2);
		
		panel = new JPanel();
		panel_2.add(panel);
		panel.setBackground(Color.ORANGE);
		
		JLabel lblUserName = new JLabel("User Name");
		panel.add(lblUserName);
		
		user = new JTextField();
		user.setBackground(Color.PINK);
		panel.add(user);
		user.setColumns(10);
		
		panel_1 = new JPanel();
		panel_2.add(panel_1);
		panel_1.setBackground(Color.ORANGE);
		
		JLabel lblPsw = new JLabel("Password");
		panel_1.add(lblPsw);
		
		psw = new JTextField();
		psw.setBackground(Color.PINK);
		panel_1.add(psw);
		psw.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.setPreferredSize(new Dimension(60, 29));
		frmApplicationV.getContentPane().add(btnLogin);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setPreferredSize(new Dimension(frmApplicationV.getWidth()-20, 150));
		frmApplicationV.getContentPane().add(tabbedPane);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		chckbxNewCheckBox = new JCheckBox("New check box");
		panel_3.add(chckbxNewCheckBox);
		
		panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
	}
}

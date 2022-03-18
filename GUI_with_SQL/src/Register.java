import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.*;

public class Register extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField name;
	private JTextField textField_1;
	private JTextField emailAddress;
	JTextArea addressArea;
	JComboBox date;
	JComboBox month;
	JComboBox year;
	JButton btnRegster;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		this.setTitle("Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 204, 153));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//ClickListener listener = new ClickListener();
		btnRegster = new JButton("REGISTER");

		btnRegster.addActionListener(this);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\output-onlinepngtools-small.png"));
		label.setBounds(334, 16, 210, 164);
		contentPane.add(label);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblName.setBounds(108, 180, 88, 28);
		contentPane.add(lblName);
		
		JLabel lblDateOFbirth = new JLabel("Date of Birth:");
		lblDateOFbirth.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblDateOFbirth.setBounds(108, 301, 143, 28);
		contentPane.add(lblDateOFbirth);
		
		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblEmailAddress.setBounds(108, 239, 157, 28);
		contentPane.add(lblEmailAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblPhoneNumber.setBounds(108, 355, 157, 28);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		lblAddress.setBounds(108, 419, 88, 28);
		contentPane.add(lblAddress);
		
		name = new JTextField();
		name.setBounds(312, 183, 146, 26);
		contentPane.add(name);
		name.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(312, 242, 146, 26);
		contentPane.add(textField_1);
		
		emailAddress = new JTextField();
		emailAddress.setColumns(10);
		emailAddress.setBounds(312, 358, 146, 26);
		contentPane.add(emailAddress);
		
		addressArea = new JTextArea();
		addressArea.setBounds(312, 410, 178, 54);
		contentPane.add(addressArea);
		
		date = new JComboBox();
		date.setBounds(312, 304, 36, 26);
		contentPane.add(date);
		
		month = new JComboBox();
		month.setBounds(379, 304, 73, 26);
		contentPane.add(month);
		
		year = new JComboBox();
		year.setBounds(483, 304, 73, 26);
		contentPane.add(year);
		
		btnRegster.setForeground(new Color(255, 255, 255));
		btnRegster.setBackground(new Color(105, 105, 105));
		btnRegster.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		btnRegster.setBounds(323, 499, 143, 29);
		contentPane.add(btnRegster);
		
		JLabel label_1 = new JLabel();
		label_1.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\user (2).png"));
		label_1.setBounds(685, 137, 178, 144);
		contentPane.add(label_1);
		
		JButton btnAddPicture = new JButton("Add Picture");
		btnAddPicture.setBackground(new Color(211, 211, 211));
		btnAddPicture.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		btnAddPicture.setBounds(685, 302, 139, 29);
		contentPane.add(btnAddPicture);
		
		JButton button = new JButton();
		button.setSelectedIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\back.png"));
		button.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\back.png"));
		button.setBounds(15, 16, 73, 54);
		button.setBackground(new Color(255, 204, 153));
		contentPane.add(button);
	}

	//public class ClickListener implements ActionListener{ 
	@Override
	public void actionPerformed(ActionEvent e) {
		String url = "jdbc:mysql://localhost:3306/logininfo";
		String user = "root";
        String password = "avatarleo85";
		if(e.getSource() == btnRegster){
			try {
				System.out.println("starting");
				//Class.forName("com.mysql.cj.jdbc.Driver");
				String email = emailAddress.getText();
				Connection conn = DriverManager.getConnection(url,user,password);
				Statement st = conn.createStatement();
				System.out.println("Middle");
				st.executeUpdate("INSERT INTO userinfo(emailaddress) values(\"" + email+"\")");
				conn.close();
				System.out.println("DONE");
			} catch (Exception k) {
				System.out.println("YAAAYEEET");
			}
			

		}
		
	}
//}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		this.setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Microsoft YaHei", Font.PLAIN, 25));
		lblEmail.setBounds(640, 86, 107, 34);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 25));
		lblNewLabel.setBounds(631, 195, 142, 34);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(610, 137, 163, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Don't have an account? Register!");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(518, 365, 360, 26);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(610, 252, 163, 26);
		contentPane.add(passwordField);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnLogin.setBackground(new Color(102, 102, 102));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBounds(631, 311, 133, 46);
		contentPane.add(btnLogin);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\question.png"));
		button.setBounds(815, 487, 48, 41);
		button.setBackground(new Color(255, 204, 153));
		contentPane.add(button);
		
		JButton btnRegster = new JButton("REGISTER");
		btnRegster.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		btnRegster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRegster.setForeground(Color.WHITE);
		btnRegster.setBackground(new Color(102, 102, 102));
		btnRegster.setBounds(631, 420, 132, 46);
		contentPane.add(btnRegster);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\output-onlinepngtools.png"));
		lblNewLabel_2.setBounds(55, 117, 360, 338);
		contentPane.add(lblNewLabel_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( ( e.getSource() == btnLogin)){
			String email =textField.getText();
			String password = passwordField.getText();
			

		}
		
	}
}

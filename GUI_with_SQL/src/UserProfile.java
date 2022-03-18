import java.awt.*;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class UserProfile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserProfile frame = new UserProfile();
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
	public UserProfile() {
		this.setTitle("User Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 204, 153));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\output-onlinepngtools-small.png"));
		lblNewLabel.setBounds(336, 16, 181, 166);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\user (3).png"));
		lblNewLabel_1.setBounds(61, 150, 256, 301);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblName.setBounds(523, 169, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblSurname.setBounds(523, 218, 90, 20);
		contentPane.add(lblSurname);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblEmail.setBounds(523, 271, 69, 20);
		contentPane.add(lblEmail);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblDateOfBirth.setBounds(523, 325, 118, 20);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblPhoneNumber.setBounds(523, 378, 152, 20);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblAddress.setBounds(523, 432, 90, 20);
		contentPane.add(lblAddress);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBackground(new Color(128, 128, 128));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setFont(new Font("Microsoft YaHei", Font.PLAIN, 17));
		btnUpdate.setBounds(646, 499, 115, 29);
		contentPane.add(btnUpdate);
		
		textField = new JTextField();
		textField.setBounds(686, 167, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(686, 216, 146, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(686, 269, 146, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(686, 376, 146, 26);
		contentPane.add(textField_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(686, 418, 146, 51);
		contentPane.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(686, 323, 36, 26);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(737, 323, 57, 26);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(809, 323, 54, 26);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\back.png"));
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\back.png"));
		btnNewButton.setBounds(15, 16, 69, 51);
		contentPane.add(btnNewButton);
	}

}

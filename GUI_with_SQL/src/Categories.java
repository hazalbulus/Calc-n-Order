import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class Categories extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Categories frame = new Categories();
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
	public Categories() {
		this.setTitle("Categories");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\output-onlinepngtools-small.png"));
		label.setBounds(679, 16, 184, 176);
		contentPane.add(label);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\back.png"));
		button.setBounds(15, 16, 74, 57);
		contentPane.add(button);
		
		JButton btnHungerGames = new JButton("HUNGER GAMES");
		btnHungerGames.setForeground(new Color(255, 255, 255));
		btnHungerGames.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnHungerGames.setBackground(new Color(105, 105, 105));
		btnHungerGames.setBounds(320, 177, 238, 46);
		contentPane.add(btnHungerGames);
		
		JButton btnEdtUserProfle = new JButton("EDIT USER PROFILE");
		btnEdtUserProfle.setForeground(new Color(255, 255, 255));
		btnEdtUserProfle.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnEdtUserProfle.setBackground(new Color(105, 105, 105));
		btnEdtUserProfle.setBounds(320, 293, 238, 46);
		contentPane.add(btnEdtUserProfle);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnLogout.setBackground(new Color(105, 105, 105));
		btnLogout.setBounds(320, 408, 238, 46);
		contentPane.add(btnLogout);
	}

}

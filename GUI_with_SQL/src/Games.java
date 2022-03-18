import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Games extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Games frame = new Games();
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
	public Games() {
		this.setTitle("Games");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 204, 153));
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
		
		JButton btnNewButton = new JButton("HangHungryMan");
		btnNewButton.setBackground(new Color(221, 160, 221));
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(324, 157, 229, 51);
		contentPane.add(btnNewButton);
		
		JButton btnFoodmemory = new JButton("FoodMemory");
		btnFoodmemory.setBackground(new Color(240, 128, 128));
		btnFoodmemory.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnFoodmemory.setBounds(324, 287, 229, 51);
		contentPane.add(btnFoodmemory);
		
		JButton btnFoodluck = new JButton("FoodLuck");
		btnFoodluck.setBackground(new Color(127, 255, 212));
		btnFoodluck.setFont(new Font("Microsoft YaHei", Font.PLAIN, 20));
		btnFoodluck.setBounds(324, 410, 229, 51);
		contentPane.add(btnFoodluck);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\hangman-game.png"));
		label_1.setBounds(185, 144, 87, 77);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\memory.png"));
		label_2.setBounds(185, 269, 102, 77);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\hazal\\Desktop\\Project Summer\\GUI\\src\\game.png"));
		label_3.setBounds(185, 401, 102, 71);
		contentPane.add(label_3);
	}

}

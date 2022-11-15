import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseCarClassGUI extends JFrame {

	private JPanel contentPane;
	private String name;


	/**
	 * Create the frame.
	 */
	public ChooseCarClassGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Elige la clase de tu vehículo");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 29));
		lblNewLabel.setBounds(28, 6, 397, 72);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Clase A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = "Clase 1";
				MainMenuGUI mainmenu = new MainMenuGUI(name);
				
			}
		});
		btnNewButton.setBounds(28, 114, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clase B");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = "Clase 2";
				MainMenuGUI mainmenu = new MainMenuGUI(name);
			}
		});
		btnNewButton_1.setBounds(170, 114, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clase C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(313, 114, 117, 29);
		contentPane.add(btnNewButton_2);
	}

}


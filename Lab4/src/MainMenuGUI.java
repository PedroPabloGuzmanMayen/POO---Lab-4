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

public class MainMenuGUI extends JFrame {

	private JPanel contentPane;
	String hola;
	
	/**
	 * Create the frame.
	 */
	public MainMenuGUI(String string) {
		this.hola = string;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Elige el modo");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel.setBounds(142, 6, 157, 53);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Radio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RadioGUI radio = new RadioGUI();
			}
		});
		btnNewButton.setBounds(20, 95, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reproduccion");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(171, 95, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Telefono");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhoneGUI phone = new PhoneGUI();
			}
		});
		btnNewButton_2.setBounds(315, 95, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Productividad");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductivityGUI prod = new ProductivityGUI();
				
			}
		});
		btnNewButton_3.setBounds(171, 175, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Apagar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TurnONOFFGUI turnONOFF = new TurnONOFFGUI();
			}
		});
		btnNewButton_4.setBounds(20, 29, 78, 17);
		contentPane.add(btnNewButton_4);
		
		
	
	}

}



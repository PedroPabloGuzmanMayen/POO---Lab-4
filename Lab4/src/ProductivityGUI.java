import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductivityGUI extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public ProductivityGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Pronostico del tiempo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TimeForecastGUI time = new TimeForecastGUI();
			}
		});
		btnNewButton.setBounds(132, 112, 182, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atrás");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuGUI menu = new MainMenuGUI("Hola");
			}
		});
		btnNewButton_1.setBounds(6, 21, 117, 29);
		contentPane.add(btnNewButton_1);
		setVisible(true);
	}
}

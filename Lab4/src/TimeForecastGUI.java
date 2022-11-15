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

public class TimeForecastGUI extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public TimeForecastGUI() {
		CarC car = new CarC();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setVisible(true);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Pronóstico del tiempo");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(50, 23, 354, 68);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(car.getWeatherForCast());
		lblNewLabel_1.setBounds(50, 149, 308, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuGUI menu = new MainMenuGUI("Hola");
			}
		});
		btnNewButton.setBounds(6, 6, 117, 29);
		contentPane.add(btnNewButton);
	}

}

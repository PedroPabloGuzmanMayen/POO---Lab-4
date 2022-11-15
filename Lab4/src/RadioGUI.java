import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;

public class RadioGUI extends JFrame {

	private JPanel contentPane;
	private CarC car = new CarC();
	String carclass;


	/**
	 * Create the frame.
	 */
	public RadioGUI(String string) {
		
		float emisora = car.getStation();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 52, 450, 214);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("New tab", null, panel, null);
		
		JLabel lblNewLabel = new JLabel("FM");
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("FM");
		lblNewLabel_2.setBounds(202, 6, 33, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(String.valueOf(emisora));
		lblNewLabel_3.setBounds(182, 73, 61, 16);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("Anterior");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				car.setStation(car.getStation() + (float)0.5);
				float emisora = car.getStation();
				lblNewLabel_3.setText(String.valueOf(emisora));
			}
		});
		btnNewButton_2.setBounds(22, 68, 117, 29);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Siguiente");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setBounds(306, 68, 117, 29);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Guardar emisora");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_5.setBounds(6, 133, 154, 29);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Cargar emisora");
		btnNewButton_6.setBounds(269, 133, 154, 29);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.setBounds(6, 6, 33, 29);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("+");
		btnNewButton_7_1.setBounds(127, 6, 33, 29);
		panel.add(btnNewButton_7_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(51, 11, 61, 16);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JLabel lblNewLabel_1 = new JLabel("AM");
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setBounds(45, 11, 61, 16);
		panel_1.add(lblNewLabel_4_1);
		
		JButton btnNewButton_7_2 = new JButton("-");
		btnNewButton_7_2.setBounds(0, 6, 33, 29);
		panel_1.add(btnNewButton_7_2);
		
		JButton btnNewButton_7_1_1 = new JButton("+");
		btnNewButton_7_1_1.setBounds(121, 6, 33, 29);
		panel_1.add(btnNewButton_7_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("AM");
		lblNewLabel_2_1.setBounds(196, 6, 33, 16);
		panel_1.add(lblNewLabel_2_1);
		
		JButton btnNewButton_2_1 = new JButton("Anterior");
		btnNewButton_2_1.setBounds(16, 68, 117, 29);
		panel_1.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(176, 73, 61, 16);
		panel_1.add(lblNewLabel_3_1);
		
		JButton btnNewButton_3_1 = new JButton("Siguiente");
		btnNewButton_3_1.setBounds(300, 68, 117, 29);
		panel_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_5_1 = new JButton("Guardar emisora");
		btnNewButton_5_1.setBounds(0, 133, 154, 29);
		panel_1.add(btnNewButton_5_1);
		
		JButton btnNewButton_6_1 = new JButton("Cargar emisora");
		btnNewButton_6_1.setBounds(263, 133, 154, 29);
		panel_1.add(btnNewButton_6_1);
		
		JLabel lblNewLabel_5 = new JLabel("Volumen");
		lblNewLabel_5.setBounds(47, 35, 61, 16);
		panel_1.add(lblNewLabel_5);
		
		JButton btnNewButton_4 = new JButton("Atras");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainMenuGUI menu = new MainMenuGUI("Hola");
			}
		});
		btnNewButton_4.setBounds(0, 0, 78, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_6 = new JLabel("Izquierda: FM");
		lblNewLabel_6.setBounds(75, 22, 137, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Derecha AM");
		lblNewLabel_7.setBounds(289, 24, 106, 16);
		contentPane.add(lblNewLabel_7);
		setVisible(true);
		
	}
}


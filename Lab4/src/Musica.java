import javax.sound.sampled.*;
import javax.sound.sampled.Clip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.UIManager;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
 /*
 * @author Abby Donis 
 */

public class Musica extends JFrame {
	
	private JPanel contentPane;
	Timer timer;
	int segundos = 0;
	int minutos = 0;



	/**
	 * Create the frame.
	 */
	public Musica() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 416);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("TabbedPane.focus"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		/**
		 * 
		 */
		JList listSongs = new JList();
		listSongs.setForeground(UIManager.getColor("SplitPane.highlight"));
		listSongs.setBackground(UIManager.getColor("SplitPane.darkShadow"));
		listSongs.setLayoutOrientation(JList.VERTICAL_WRAP);
		listSongs.setFont(new Font("Tahoma", Font.PLAIN, 11));
		listSongs.setVisibleRowCount(18);
		listSongs.setBounds(43, 11, 539, 271);
		contentPane.add(listSongs);
		/*
		 * Lista de reproducción
		 */
		DefaultListModel<String> SongsNameList = new DefaultListModel<String>();
		
		for (int i = 0; i < filepath.size(); i++) {
			String songname = filepath.get(i).substring(filepath.get(i).lastIndexOf("/") + 1, filepath.get(i).length() - 4);
			SongsNameList.addElement(songname);
		}
		
		listSongs.setModel(SongsNameList);
				
				
		JButton btnPausa = new JButton("||");
		btnPausa.setForeground(new Color(0, 128, 128));
		btnPausa.addActionListener(new ActionListener() {
			//pausa y play
			public void actionPerformed(ActionEvent e) {
				if (ifPlaying) {
					clipTimePosition = reproductor.clip.getMicrosecondPosition();
					reproductor.clip.stop();
					
					btnPausa.setText(">");
					timer.stop();
					
					
				}else {
					reproductor.clip.setMicrosecondPosition(clipTimePosition);
					if (clipTimePosition==0) {
						segundos = 0;
						minutos = 0;
						timer.restart();
					}
					reproductor.clip.start();
					btnPausa.setText("||");
					timer.start();
				}
				ifPlaying=!ifPlaying;
			}
		});
		btnPausa.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPausa.setBounds(225, 315, 107, 44);
		contentPane.add(btnPausa);
		
		//al seleccionar la canción se presiona el botón para iniciarla
		JButton btnPlay = new JButton("Iniciar Canción");
		btnPlay.setForeground(new Color(0, 128, 128));
		btnPlay.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				reproductor.cargarM( filepath.get( listSongs.getSelectedIndex() ) );
				reproductor.clip.getMicrosecondPosition();
				clipTimePosition=0;
				reproductor.clip.start();
				//Medición de la duración de la canción
				segundos = 0;
				minutos = 0;
				timer.restart();				
			}
		});
		btnPlay.setBounds(428, 297, 134, 44);
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnPlay);
		//Reiniciar cancion
		JButton btnRewind = new JButton("<──");
		btnRewind.setForeground(new Color(0, 128, 128));
		btnRewind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reproductor.clip.stop();
				clipTimePosition=reproductor.clip.getMicrosecondPosition();
				if (clipTimePosition==0) {
					segundos = 0;
					minutos = 0;
					timer.start();
					reproductor.cargarM( filepath.get( listSongs.getSelectedIndex()-1 ) );
				}if (clipTimePosition!=0) {
					clipTimePosition=0;
					reproductor.clip.setMicrosecondPosition(clipTimePosition);
					segundos = 0;
					minutos = 0;
					timer.start();
					reproductor.clip.start();
				}
				
			}
		});
		btnRewind.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRewind.setBounds(153, 315, 62, 44);
		contentPane.add(btnRewind);
		//Skipear canción
		JButton btnSkip = new JButton("──>");
		btnSkip.setForeground(new Color(0, 128, 128));
		btnSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reproductor.clip.stop();
				clipTimePosition=reproductor.clip.getMicrosecondLength();
				reproductor.clip.setMicrosecondPosition(clipTimePosition);
				reproductor.cargarM( filepath.get( listSongs.getSelectedIndex()+1 ));
				segundos = 0;
				minutos = 0;
				timer.start();
				reproductor.clip.start();
			}
		});
		btnSkip.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSkip.setBounds(342, 315, 62, 44);
		contentPane.add(btnSkip);
		
		//Timer
		JLabel Time = new JLabel();
		Time.setForeground(new Color(176, 224, 230));
		Time.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		Time.setBounds(267, 293, 47, 18);
		contentPane.add(Time);	
		timer = new Timer (1000, new ActionListener ()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	segundos++;
		    	if (segundos == 60) {
		    		segundos = 0;
		    		minutos++;
		    	}
		    	
		    	Time.setText(minutos+":" + segundos); 
		    }
		});
		
	}
	
	static Music reproductor = Music.getInstance(); 
	static ArrayList<String> filepath = Music.getCanciones();
	static long clipTimePosition;
	
	
	static boolean ifPlaying = true;
	static boolean ifPause = false;
}

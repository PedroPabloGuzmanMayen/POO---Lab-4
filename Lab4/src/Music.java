import java.io.File;
import java.util.ArrayList;

import javax.sound.sampled.*;
public class Music {
	static Music reproductor = new Music();
	static Clip clip;
	private Music() {
		
	}
	public static Music getInstance() {
		return reproductor;
	}
	public static void cargarM(String filepath) {
		/**
		 * Encontrar los archivos de audio y acceder a estos
		 */
		try {
			File archivosM = new File(filepath);
			if (archivosM.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(archivosM);
				clip = AudioSystem.getClip();
				clip.open(audioInput);
			}
		}
		catch(Exception e){
			System.out.println("ERROR" + e);
		}
	}
	/**
	 * Lista de canciones
	 */
	public static ArrayList<String> Canciones;{
	Canciones = new ArrayList<String>();
	Canciones.add("./Musica/A_Sky_Full_of_Stars.wav");
	Canciones.add("./Musica/7_rings.wav");
	Canciones.add("./Musica/Africa.wav");
	Canciones.add("./Musica/Another_One_Bites_the_Dust.wav");
	
	}
	public void setCanciones(ArrayList<String> Canciones) {
		this.Canciones=Canciones;
	}
	public static ArrayList<String> getCanciones() {
		return Canciones;
	}
}
	


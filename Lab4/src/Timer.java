public class Timer {
	/**
	 * Timer para medir la duracion de canciones
	 */
	private int seconds;
	private int minutes;
	
	public int getSeconds() {
		return seconds;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void work(int time) {
		seconds ++;
		if (seconds > time/1000 ) {
			seconds = 0;
		}
		minutes ++;
		if (seconds==59) {
			seconds=0;
			minutes ++;
		}
		
	}
}

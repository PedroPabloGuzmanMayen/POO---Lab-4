import java.util.ArrayList;

public class CarC extends CarClass implements ICarC {

	protected int volume;
	protected boolean isOn;
	protected float frequency;
	protected ArrayList<Float> stations;
	protected float station;
	protected String carClass;
	protected boolean isPhoneConnected;
	protected ArrayList<String> contacts; 
	
	public CarC() {
		station = (float) 0.0;
		stations = new  ArrayList<Float>();
		volume = (int)0;
		
	}
    public boolean SwitchRadioONOFF() {
        
        return false;
    }

    @Override
    public boolean getRadioStatus() {
        
        return false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int Volume) {
       this.volume = Volume;
        
    }

    @Override
    public float SwitchFrequency(float frequency) {
        
        return 0;
    }

    @Override
    public void setStation(float Volume) {
        this.station = Volume;
        
    }

    @Override
    public float getStation() {
        
        return station;
    }

    @Override
    public void SaveStation(float _station) {
        
        stations.add(_station);
    }

    @Override
    public float SelectSpecificStation(int _StationIndex) {
        
        return 0;
    }

    @Override
    public int getAudioRepType() {
       
        return 0;
    }

    @Override
    public void setAudioRepType() {
       
        
    }

    @Override
    public ArrayList<ISong> getAListOfSongs(int TypeOfAudioReproduction) {
   
        return null;
    }

    @Override
    public void NextSong(int CurrentIndex, int TypeOfAudioReproduction) {
        
        
    }

    @Override
    public void PrevSong(int CurrentIndex, int TypeOfAudioReproduction) {
      
        
    }

    @Override
    public String PlaySong(int TypeOfAudioReproduction) {
   
        return null;
    }

    @Override
    public boolean Connect_DisconnectPhone() {
       
        return false;
    }

    @Override
    public boolean getPhoneConnectionStatus() {

        return false;
    }

    @Override
    public ArrayList<String> getListofContacts() {
    
        return null;
    }

    @Override
    public int getCallStatus() {

        return 0;
    }

    @Override
    public String makeCall(String NameforCall) {

        return "Inicio la llamada con" + NameforCall;
    }

    @Override
    public String PlaceCallOnHold() {

        return "Dejaste la llamada en espera";
    }

    @Override
    public String endCall() {

        return "La llamada finalizo";
    }

    @Override
    public String getWeatherForCast() {
    	
        return null;
    }

	public String getCarClass() {
		return carClass;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public float getFrequency() {
		return frequency;
	}

	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public boolean isPhoneConnected() {
		return isPhoneConnected;
	}

	public void setPhoneConnected(boolean isPhoneConnected) {
		this.isPhoneConnected = isPhoneConnected;
	}

    public ArrayList<Float> getStations(){
    	return stations;
    }
    public ArrayList<String> getContacts(){
    	return contacts;
    }
    
}
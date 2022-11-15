import java.util.ArrayList;

public class CarC extends CarClass implements ICarC {

    @Override
    public boolean SwitchRadioONOFF() {

        return false;
    }

    @Override
    public boolean getRadioStatus() {
 
        return false;
    }

    @Override
    public int getVolume() {
      
        return 0;
    }

    @Override
    public void setVolume(int Volume) {
  
        
    }

    @Override
    public float SwitchFrequency(float frequency) {

        return 0;
    }

    @Override
    public void setStation(float Volume) {
  
        
    }

    @Override
    public float getStation() {

        return 0;
    }

    @Override
    public void SaveStation(float _station) {

        
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

        return null;
    }

    @Override
    public String PlaceCallOnHold() {

        return null;
    }

    @Override
    public String endCall() {

        return null;
    }

    @Override
    public String getWeatherForCast() {
   
        return null;
    } 
    
}
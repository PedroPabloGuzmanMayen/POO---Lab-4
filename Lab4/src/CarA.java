public class CarA extends CarB implements ICarA {
	
	public CarA() {
		super();
	}

    @Override
    public boolean getSpeakerStatus() {

        return false;
    }

    @Override
    public boolean ChangeSpeakerStatus() {
 
        return false;
    }

    @Override
    public String TripPlanification(String tripday, String tripHour_, String tripPlace, String tripLength,
            String tripObjective) {

        return null;
    }
    
}

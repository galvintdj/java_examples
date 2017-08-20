
public class GroundVehicle extends Vehicle {
	
	int numWheels;
	String vehicleType;

	public GroundVehicle(int setSpeed, String setColor, double setWeight, boolean tellIfMoving, int setNumWheels, String type){
		super(setSpeed, setColor, setWeight, tellIfMoving);
		numWheels = setNumWheels;
		vehicleType = type;
	}

	public String startMoving(){

		isMoving = true;
		return vehicleType + " is driving";

	}
	public String stopMoving(){
		isMoving = false;
		return vehicleType + " isn't driving";

	}
	public String whatColor(){
		return color;
	}

}
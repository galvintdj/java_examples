
public class VehicleDriver{
	
	public static void main(String[] args) {

		Vehicle transportationMachine = new Vehicle(50, "Blue", 210, false);

		System.out.println(transportationMachine.startMoving());

		
		GroundVehicle horseAndBuggy = new GroundVehicle(5, "Black", 300, false, 4, "Horse and Buggy");

		String result = horseAndBuggy.startMoving();
		System.out.println(result);

		Vehicle goKart = new GroundVehicle(25, "Yellow", 3, true, 4, "GoKart");

		System.out.println(goKart.startMoving());
		
	}
}
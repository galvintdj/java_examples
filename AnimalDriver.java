
public class AnimalDriver{
	
	public static void main (String[] args) {

		Animal myDog = new Animal("Sparky", "Grey", 17, 56.4, true, true);
		Animal yourDog = new Animal("Rover", "Brown", 19, 41.8, true, true);

		System.out.println(myDog.walk());
		System.out.println(myDog.eat());

		System.out.println(yourDog.walk());
		System.out.println(yourDog.eat());

		System.out.println(yourDog.getLength());
	}
}
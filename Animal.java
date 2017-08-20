
public class Animal {
	
	private static int numberOfAnimals = 0 ;
	public String name;
	public int length;
	public String color;
	public double weight;
	public boolean hasFur;
	public boolean isHungry;

	public Animal(String Name, String Color, int Length, double Weight, Boolean Fur, Boolean Hungry){

		color = Color;
		weight = Weight;
		hasFur = Fur;
		isHungry = Hungry;
		length = Length;
		name = Name;
		//numberOfAnimals ++;

	}
	public String walk(){
		return name + " is walking";
	}

	public String eat(){
		isHungry = false;
		weight += .1;
		return name + " has eaten.\n" + name + " now weighs: " + weight + " pounds";
	}

	public String getLength(){
		return name + "'s length is " + length;
	}

}
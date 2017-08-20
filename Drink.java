
import java.util.*;

public class Drink{
	
	public static void main (String[] args) {

	Scanner ageGetter = new Scanner(System.in);

	System.out.println("How old are you?");

	int age = ageGetter.nextInt();

	if(age >= 21){
		System.out.println("You can leagally drink!");
	}else{
		System.out.print("You will be able to drink in ");	
		System.out.print(21-age);
		System.out.println(" years!");
		}
	}
}
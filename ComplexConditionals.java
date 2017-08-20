
import java.util.*;

public class ComplexConditionals {
	
	public static void main (String [] args) {

	Scanner ageGet = new Scanner(System.in);

	System.out.println("How old are you ?");

	int age = ageGet.nextInt();

	if(age < 18){
		System.out.println("You're a kid!");
		System.out.println("Go to school");
	}
	else if(age < 29){
		System.out.println("Time to establish yourself.");
		System.out.println("Good luck.");
	}
	else if(age < 39){
		System.out.println("You're in the years to focus on your career!");
		System.out.println("Get a job.");
	}
	else if(age < 49) {
		System.out.println("You should be thinking about retirement!");
		System.out.println("Save your money!");
	}
	else if (age < 59) {
		System.out.println("Maintain your health through exercise.");
		System.out.println("Get in shape!");
	}
	else {
		System.out.println("You are old!!!");
	}
  }
}

import java.util.*;

public class Loop2{
	
	public static void main (String[] args) {

	Scanner bandName = new Scanner(System.in);
	String band = "";

	while(!band.equals("xxx")) {

		System.out.println("Name of a band you like or xxx to stop. ");
		band = bandName.nextLine();

		if(!band.equals("xxx")) {
			System.out.println( band + " Rocks!");
		}

	}

  }

}
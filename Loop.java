
public class Loop {
	
	public static void main (String[] args) {

		int counter = 0;

		while (counter < 100) {
			System.out.println(counter);
			//System.out.print(" ");
			counter += -5;
		}
	}
}
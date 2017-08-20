
public class Arrays2{
	
	public static void main (String[] args) {

		String[] groceries = {
			"oranges", "apples", "milk", "bread", "butter", "pepper", "salt", "sugar", "pears"
		};
		
		/*
		double[] gpas = {
			3.25, 2.26, 1.99, 3.55, 4.0, 3.21, 2.56, 3.06, 2.72
		};
		*/
		
		double[] gpas = new double[9];

		gpas[3] = 1.7;

		System.out.println(groceries[0]);  //oranges 1st item in groceries array

		System.out.println(groceries[1]);  //apples is the 2nd item in array

		System.out.println(gpas[3]);  //second item in gpas array}
	}

}
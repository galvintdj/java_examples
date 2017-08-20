
public class MathDemo {
	public static void main (String[] args) {

		int three = 3;
		int thirteen = 13;

		System.out.print("3 + 13 = : ");
		System.out.println(three + thirteen);
		System.out.print("3 - 13 = : "); 
		System.out.println(three - thirteen);
		System.out.print("13 * 3 = : ");
		System.out.println(thirteen * three);
		System.out.print("13 / 3 = : "); //Note 13/3 is not whole number
		System.out.println(thirteen / three);
		System.out.print("13 % 3 = : ");
		System.out.println(thirteen % three);
		System.out.println((double)thirteen/(double)three);
		//Becuase we've cast these numbers as doubles, the real value is displayed
	}
}
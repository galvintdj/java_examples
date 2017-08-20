public class MathDemo2 {
	public static void main (String[] args) {

		int three = 3;
		int thirteen = 13;

		System.out.println("3 + 13 = : " + (three + thirteen));
		//System.out.println(three + thirteen);
		System.out.println("3 - 13 = : " + (three - thirteen)); 
		//System.out.println(three - thirteen);
		System.out.println("13 * 3 = : " + (thirteen * three));
		//System.out.println(thirteen * three);
		System.out.println("13 / 3 = : " + (thirteen / three) +" Note 13/3 is not a whole number this is due to the int data type"); //Note 13/3 is not whole number
		//System.out.println(thirteen / three);
		System.out.println("13 % 3 = : " +(thirteen % three));
		//System.out.println(thirteen % three);
		System.out.println((double)thirteen/(double)three);
		//Becuase we've cast these numbers as doubles, the real value is displayed
	}
}
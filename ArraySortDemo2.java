
import java.util.Arrays;

public class ArraySortDemo2{
	
	public static void main (String[] args) {

	String[] groceries = {
			"oranges", "apples", "milk", "bread", "butter", "pepper", "salt", "sugar", "pears"
		};
	
	System.out.println("___UNSORTED ARRAY ___");
	for(int count = 0; count < groceries.length; count++){
		System.out.print(groceries[count] + " ");
	}
	System.out.println();
	System.out.println("___SORTED ARRAY___");

	Arrays.sort(groceries);

	for(String item:groceries){
		System.out.print(item + " ");
	}
	System.out.println();

  }

}
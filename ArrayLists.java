
import java.util.*;

public class ArrayLists{
	
	public static void main (String[] args) {

		ArrayList<String> languages = new ArrayList<String>();
		
		languages.add("Spanish");
		languages.add("French");
		languages.add("English");
		languages.add("Polish");
		languages.add("Java");
	
		System.out.println(languages.size());
	
		languages.add("German");

		System.out.println(languages.size());
		System.out.println("getting rid of French");
		languages.remove("French");
		System.out.println(languages.get(3));

		//for (int i=0 ; i < languages.size(); i++) {
		System.out.println(" --- Begin Unsorted List ---");
		System.out.println( languages );
		System.out.println(" --- End Unsorted List ---");

		Collections.sort(languages);

		System.out.println(" --- Begin Sorted List ---");
		System.out.println( languages );
		System.out.println(" --- End Sorted List ---");

		//}

	}
}
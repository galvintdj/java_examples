
import java.util.*;

public class HashTabs{
	
	public static void main (String [] args) {

		Hashtable <String, String> statesAndCapitols = new Hashtable<String, String>();

		statesAndCapitols.put("Connecticut", "Hartford");
		statesAndCapitols.put("New York", "Albany");
		statesAndCapitols.put("Mississippi", "Jackson");
		statesAndCapitols.put("Maine", "Augusta");
		statesAndCapitols.put("Montana", "Helena");
		statesAndCapitols.put("Texas", "Austin");

		String ConnCap = statesAndCapitols.get("Connecticut");

		System.out.println(ConnCap);

		System.out.println("Values: " + statesAndCapitols.values());
		System.out.println("Keys: " +statesAndCapitols.keySet());
	}
}
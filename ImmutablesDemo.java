
import java.util.*;

public class ImmutablesDemo {
	
	public static void main (String[] args){

	String[] turn = {"600", "800", "1024", "1366", "1920"};
	List<String> list = java.util.Arrays.asList(turn);
	List<String> unmodList = Collections.unmodifiableList(list);

	for(String p: unmodList){
		System.out.println(p);
	}
	System.out.println();
	System.out.print(unmodList.get(0));

	//unmodList.add("464");
	}
}
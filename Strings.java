public class Strings{
	
	public static void main (String[] args) {

		String phrase = "The quick brown fox jumped over the lazy dog.";

		//Prints the number of characters in the string
		System.out.print("The number of characters in this string : ");
		System.out.println(phrase.length());

		//Finds the index of the word fox
		System.out.print("The index of fox is : ");
		System.out.println(phrase.indexOf("fox"));

		//Replace jumped with a new word.
		System.out.print("Replaced jumped with hopped : ");
		System.out.println(phrase.replace("jumped" , "hopped"));

		//Change case
		System.out.print("Uppercase phrase : ");
		System.out.println(phrase.toUpperCase());
		System.out.print("Lowercase phrase : ");
		System.out.println(phrase.toLowerCase());
	}
}
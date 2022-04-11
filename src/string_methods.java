import java.io.*;

public class string_methods {

	public static void main(String[] args) {
		
		
		capitalize("draGoN");
		wheresWaldo("To find a Waldo please look harder.");
		firstThingsFirst("cat", "dog");
		reverse("Megan");
		soLong("Megan", "Coats");
		afterMath("I do not have a Math test this weekend!");
		letterize("BootCamp");

	}
	public static void capitalize(String word) {
		word = word.toLowerCase();
		word = word.substring(0, 1).toUpperCase() + word.substring(1);
		System.out.println(word);
	}
	
	public static void wheresWaldo(String phrase) {
		System.out.println(phrase.indexOf("Waldo", 0));
	}
	public static void firstThingsFirst(String a, String b) {
		 int comparedResult = a.compareTo(b);

	        if (comparedResult > 0) {
	            System.out.println(a + " comes after " + b);
	        } else if (comparedResult < 0) {
	            System.out.println(a + " comes before " + b);
	        } else {
	            System.out.println(a + " is equal to " + b);
	        }
	}
	public static void reverse(String s) {
		String rstr="";
		char ch;
		for (int i=0; i<s.length(); i++)
	      {
	        ch= s.charAt(i); 
	        rstr= ch+rstr; 
	      }
		System.out.println(rstr);
	}
	public static void soLong(String a, String b) {
		  if (a.length()> b.length()) {
	            System.out.println(a);
	        } else if (a.length() < b.length()) {
	            System.out.println(b);
	        } else if (a.length() == b.length()) {
	            System.out.println(a + " is equal to " + b);
	        }
	}
	public static void afterMath(String phrase) {
		System.out.println(phrase.substring(phrase.lastIndexOf("Math") + 5));
	}
	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
		    System.out.println(word.charAt(i));
		}
	}
}

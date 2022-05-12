package Demo;
import java.util.Scanner;

public class Exercise13 {
	public static String[] arr = new String[] { "Jack", "Lilly", "Tom", "Benz"};
	
	public static String searchString(String[] arr, String s) {
		for(String string : arr) {
			if(s.equals(string)) {
				System.out.println("Found!");
				return s;
			}
		}
		return "Not found";
	}
	
	public static void main(String args[]) {
		System.out.println("Please enter the word you want to find :");
		Scanner sc = new Scanner(System.in);
		String find = sc.next();
		System.out.println(Exercise13.searchString(arr,find));
	}
	

}

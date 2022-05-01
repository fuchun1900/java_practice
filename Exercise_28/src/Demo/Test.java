package Demo;
import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		do {
		String i = sc.next();
		System.out.println(i);
		}while(sc.hasNext());
		
		int a = 1;
		int b = 2;
		int c = a>b ? 22:34;
	}

}

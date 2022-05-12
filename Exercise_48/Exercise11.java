package Demo;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String args[]) {
		System.out.println("Please enter two integer : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Random number is : " + new Exercise11().getRandom(a,b));
		
	}
	
	public int getRandom(int a,int b) {
		return (int)(Math.random() * (b - a + 1) + a);
	}
}

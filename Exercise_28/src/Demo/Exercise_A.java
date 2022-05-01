package Demo;
import java.util.Scanner;

public class Exercise_A {
	public static void main(String args[]) {
		int answer = new Exercise1().v;
		int guess;
		do {
			System.out.print("Please enter the number to guess: ");
			Scanner sc = new Scanner(System.in);
			guess = sc.nextInt();
			boolean t;
			if(guess > answer)
				System.out.println("Too bigger");
			else if(guess < answer)
				System.out.println("Too small");
		}while(guess != answer);
		System.out.println("You guess");
	}
}

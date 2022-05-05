package Demo;
import java.util.Scanner;

public class Exercise21Main {
	
	public static void main(String args[]) {
		System.out.print("Please enter the number of wheels :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		Exercise21Motobike motobike = new Exercise21Motobike();
		System.out.println(motobike.NoOfWheels(number));
	}

}

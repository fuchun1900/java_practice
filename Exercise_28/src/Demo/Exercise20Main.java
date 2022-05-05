package Demo;
import java.util.Scanner;

public class Exercise20Main {
	public static void main(String args[]) {
		int wheels;
		System.out.print("Please enter the wheels the vehicle have :");
		Scanner sc = new Scanner(System.in);
		wheels = sc.nextInt();
		Exercise20Car car = new Exercise20Car();
		car.NoOfWheels(wheels);
		System.out.println("This car has " + car.wheels +" wheels .");
	}

}

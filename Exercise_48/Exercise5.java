package Demo;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise5 {
	public static double ar[] = new double[4];
	
	
	public static void main(String args[]) {
		System.out.println("Please enter the price for 4 store.");
		for(int i = 0; i < 4; i++) {
			Scanner sc = new Scanner(System.in);
			ar[i] = sc.nextDouble();
		}
		for(int i = 0; i < 4; i++) {
			System.out.print("第" + (i +1) +"家店的价格：");
			System.out.println(ar[i]);
		}
		System.out.print("最低价格是 :");
		Arrays.sort(ar);
		System.out.println(ar[0]);
	}
}

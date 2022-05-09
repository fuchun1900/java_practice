package Demo;
import java.util.Scanner;

public class Exercise2 {
	public static double[] ar = new double[5];
	public static double total = 0;
	
	public static void main(String args[]) {
		for(int i = 0; i < 5; i++) {
			System.out.printf("请输入%d金额 ： ",i+1);
			Scanner sc = new Scanner(System.in);
			ar[i] = sc.nextDouble();
			total += ar[i];
		}
		System.out.printf("%s\t\t%s\n","序号","金额（元)");
		for(int i = 0; i < 5; i++) 
			System.out.println(i + 1 + "\t\t" + ar[i]);
		System.out.println("总金额\t\t" + total);
	
	}
}

package Demo;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise40 {
	
	public static void main(String args[]) {
		System.out.println("请输入一个整数");
		int a = new Scanner(System.in).nextInt();
		System.out.println("请输入一个小数");
		double b = new Scanner(System.in).nextDouble();
		
		System.out.println("保留小数点后两位 :" + new DecimalFormat("#.##").format(b));
	}

}

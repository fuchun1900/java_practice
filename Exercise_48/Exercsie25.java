package Demo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercsie25 {
	
	public int input() throws InputMismatchException{
		return new Scanner(System.in).nextInt();
	}
	
	public int divide(int a, int b){
		return a/b;
	}
	
	public void debug() {
		System.out.print("Please enter two integer:");
		try {
			int a =input();
			int b = input();
			System.out.println("answer is : " + divide(a,b));
		}catch(InputMismatchException e) {
			System.out.println("数据类型不符");
		}catch(ArithmeticException e) {
			System.out.println("除数不能为零");
		}
	}
	
	public static void main(String args[]) {
		Exercsie25 test = new Exercsie25();
		test.debug();
	}
}

package Demo;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise3 {
	public static double score[] = new double[5];
	
	public static void main(String args[]) {
		System.out.println("请输入5位学员的成绩:");
		for(int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			score[i] = sc.nextDouble();
		}
		for(Double i : score) {
			System.out.println(i);
		}
		Arrays.sort(score);
		System.out.print("学员成绩按升序排列： ");
		for(Double i : score) {
			System.out.print(i + " ");
		}
	}

}

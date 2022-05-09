package Demo;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise4 {
	public static char character[] = new char[7];
	
	public static void main(String args[]) throws Exception {
		System.out.println("请输入7个字符:");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 7; i++) {
			character[i] = (char)System.in.read();
		}
		System.out.print("原字符序列: ");
		for(char i : character) {
			System.out.print( i + " ");
		}
		Arrays.sort(character);
		System.out.print("\n按升序排序: ");
		for(char i : character) {
			System.out.print( i + " ");
		}
		System.out.print("\n按逆序排序: ");
		for(int i = 0; i < 7 - 1; i++) {
			for(int j = 0; j < 7 - 1 - i; j++) {
				char temp;
				if(character[j] < character[j +1]) {
					temp = character[j];
					character[j] = character[j +1];
					character[j +1] = temp;
				}
			}
		}
		for(char i : character) {
			System.out.print( i + " ");
		}
	}
}

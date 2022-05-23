package Demo;
import java.util.Scanner;

public class Exercise38 {
	
	public static void main(String args[]) {
		System.out.print("请输入一串数字: ");
		String input = new Scanner(System.in).next();
		StringBuffer sb = new StringBuffer(input);
		
		for(int i = sb.length() - 3 ; i > 0; i-=3) {
				sb.insert(i,',');
			
		}
		System.out.println(sb);
		
	}

}

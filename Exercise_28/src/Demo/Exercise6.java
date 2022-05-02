package Demo;
import java.util.Scanner;

public class Exercise6 {
	private String name;
	
	public Exercise6(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String args[]) {
		Exercise6 test = new Exercise6("fuchun");
		System.out.println("You name is " + test.getName());
		System.out.print("Change name :");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		test.setName(input);
		System.out.println("Your name now is " + test.getName());
	}

}

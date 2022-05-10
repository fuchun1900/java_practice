package Demo;
import java.util.Scanner;

public class Exercise5Person {
	public String name;
	public int age;
	
	public Exercise5Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Exercise5Person(String name) {
		this.name = name;
	}
	
	void show() {
		if(this.age <= 12)
			System.out.println(this.name +"的年龄是" + this.age + ",门票免费");
		else
			System.out.println(this.name +"的年龄是" + this.age + ",门票12元");
	}
	public static void main(String args[]) {
		String input;
		int age;
		do {
			System.out.print("请输入姓名:");
			Scanner sc = new Scanner(System.in);
			input = sc.next();
			if(input.equals("n"))
				continue;
			System.out.print("请输入年龄:");
			Scanner sc2 = new Scanner(System.in);
			age = sc2.nextInt();
			Exercise5Person person = new Exercise5Person(input,age);
			person.show();
		}while(!input.equals("n"));
		System.out.println("退出程序");
	}

}

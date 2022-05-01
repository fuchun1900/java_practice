package Demo;

public class Exercise5Person {
	private String name;
	private int age;

	public Exercise5Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("姓名 ： " + name + " 年龄 ：" + age);
	}
	public static void main(String args[]) {
		Exercise5Person person = new Exercise5Person("fuchun",36);
		person.display();
	}
}

package Demo;

public class Exercise26Employee extends Exercise26Role{
	protected double salary;
	protected static long ID;
	
	public Exercise26Employee(String name,int age,double salary,long id) {
		super(name,age);
		this.salary = salary;
		this.ID = id;
	}
	public Exercise26Employee(String name,int age,char sex,double salary,long id) {
		super(name,age,sex);
		this.salary = salary;
		this.ID = id;
		this.salary = salary;
		this.ID = id;
	}
	public void play() {
		System.out.print("Play! ");
	}
	final void sing() {
		System.out.print("Sing! ");
	}
}

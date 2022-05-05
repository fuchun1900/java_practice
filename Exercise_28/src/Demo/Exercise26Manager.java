package Demo;

public class Exercise26Manager extends Exercise26Employee{
	final protected String vehicle;
	
	public Exercise26Manager(String name,int age,double salary,long id,String vehicle) {
		super(name,age,salary,id);
		this.vehicle = vehicle;
	}
	public Exercise26Manager(String name,int age,char sex,double salary,long id,String vehicle) {
		super(name,age,sex,salary,id);
		this.vehicle = vehicle;
	}
	public static void main(String args[]) {
		Exercise26Manager manage = new Exercise26Manager("张三",28,15000,1100130,"奥迪");
		System.out.println("姓名 : " + manage.name + '\n' +
					 "工号 : " + manage.ID + '\n' +
					 "性别 : " + manage.sex + '\n' +
					 "薪水 : " + manage.salary + '\n');
		System.out.print("兴趣 : ");
		manage.play();
		manage.sing();
	}
	
	

}

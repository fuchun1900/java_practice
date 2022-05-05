package Demo;

public abstract class Exercise26Role {
	protected String name;
	protected int age;
	protected char sex = '男';
	
	public Exercise26Role(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Exercise26Role(String name,int age,char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	protected int getAge() {
		return this.age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected String gettName() {
		return this.name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected void setSex(char sex) {
		this.sex = sex;
	}
	protected char getSex() {
		return this.sex;
	}
	public abstract void play();
}

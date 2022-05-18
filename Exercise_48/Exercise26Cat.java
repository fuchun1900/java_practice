package Demo;

public class Exercise26Cat extends Exercise26Animal implements Exercise27Terrestial{
	int legNum;
	
	public Exercise26Cat(String name, int legNum) {
		super(name);
		this.legNum = legNum;
	}
	
	@Override
	public void shout() {
		System.out.println(name + " meow ");
	}
	
	@Override
	public int getLegNum() {
		return this.legNum;
	}

}

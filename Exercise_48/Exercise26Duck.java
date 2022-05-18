package Demo;

public class Exercise26Duck extends Exercise26Animal implements Exercise27Terrestial{
	int legNum;
	
	public Exercise26Duck(String name, int legNum) {
		super(name);
		this.legNum = legNum;
	}
	
	@Override
	public void shout() {
		System.out.println(name + " kwa ");
	}
	
	@Override
	public int getLegNum() {
		return this.legNum;
	}

}


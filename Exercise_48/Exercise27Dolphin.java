package Demo;

public class Exercise27Dolphin extends Exercise26Animal{
	
	public Exercise27Dolphin(String name) {
		super(name);
	}
	
	@Override
	public void shout() {
		System.out.println(name + " peruperu ");
	}

}

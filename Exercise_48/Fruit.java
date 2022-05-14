package Demo;

public abstract class Fruit {
	
	public abstract void bear();
	
	public static void main(String args[]) {
		Exercise18Banana banana = new Exercise18Banana();
		Exercise18Apple apple = new Exercise18Apple();
		banana.bear();
		apple.bear();
		
	}

}

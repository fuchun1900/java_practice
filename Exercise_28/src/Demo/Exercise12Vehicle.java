package Demo;

public class Exercise12Vehicle {
	protected int wheel = 4;
	protected String color;
	protected double weight;
	
	public Exercise12Vehicle(int wheel,String color,double weight) {
		this.wheel = wheel;
		this.color = color;
		this.weight = weight;
	}
	public Exercise12Vehicle(String color,double weight) {
		this.color = color;
		this.weight = weight;
	}
	public void run() {
		System.out.println("Start engine ...");
	}
	protected double addSpeed(double speed) {
		run();
		System.out.println("Now accelerate to " + speed + ".");
		return speed;
	}
	protected void SlowDown(double speed) {
		System.out.println("Now down to " + speed + ".");
	}
	public void Stop() {
		System.out.println("end engine .");
	}
	public static void main(String args[]) {
		Exercise12Vehicle myCar = new Exercise12Vehicle("白色",55);
		myCar.addSpeed(120);
		myCar.SlowDown(100);
		myCar.Stop();
	}
}

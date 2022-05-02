package Demo;

public class Exercise8Vehicle {
	protected String brand;
	protected String color;
	
	public Exercise8Vehicle(String brand,String color) {
		this.brand = brand;
		this.color = color;
	}
	
	public void run() {
		System.out.println(this.brand + " Start running...");
	}
	public void showInfo() {
		System.out.println("This "+this.brand + " car " + this.color + " color ");
	}

}

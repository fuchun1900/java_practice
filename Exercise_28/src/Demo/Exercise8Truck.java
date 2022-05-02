package Demo;

public class Exercise8Truck extends Exercise8Vehicle{
	private double load;
	
	public Exercise8Truck(String brand,String color,double load) {
		super(brand,color);
		this.load = load;
	}
	public void showTruck() {
		System.out.println("This truck is " + super.brand + " and " + super.color + " has " + 
				this.load + " ton loader ");
	}
	public static void main(String args[]) {
		Exercise8Car myturck = new Exercise8Car("东风","蓝色",50);
		myturck.showCar();
		myturck.run();
	}

}

package Demo;

public class Exercise8Car extends Exercise8Vehicle{
	private int seats;
	
	public Exercise8Car(String brand,String color,int seats) {
		super(brand,color);
		this.seats = seats;
	}
	public void showCar() {
		System.out.println("This car is " + super.brand + " and "+ super.color + " has " + this.seats 
				+ " seats.");
	}
	public static void main(String args[]) {
		Exercise8Car mycar = new Exercise8Car("福克斯","白色",5);
		mycar.showCar();
	}

}

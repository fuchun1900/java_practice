package Demo;

public class Exercise7Customer {
	protected double points;
	protected String type;
	
	public Exercise7Customer(double points, String type) {
		this.points = points;
		this.type = type;
	}
	public void show() {
		System.out.println("This customer is " + this.type + " card and "
				       + points);
	}

}

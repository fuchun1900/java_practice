package Demo;

public class Exercise2Vehicle {
	private double speed;
	private String size;
	
	public void move() {
		System.out.println("the "+size+" vehicle Start vehicle... speed "+this.speed);
	}
	protected void setSpeed(double speed) {
		this.speed = speed;
	}
	protected void setSize(String size) {
		this.size = size;
	}
	protected void speedUp(double up) {
		this.speed += up;
	}
	protected void speedDown(double down) {
		this.speed -= down;
	}
	
	public static void main(String args[]) {
		Exercise2Vehicle bus = new Exercise2Vehicle();
		bus.setSpeed(120);
		bus.setSize("bus");
		bus.speedUp(239.22);
		bus.move();
	}

}

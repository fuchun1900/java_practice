package Demo;

public class Exercise24Handset {
	
	protected String brand;
	protected String type;
	
	protected void sendInfo() {
		System.out.println(this.brand + ": handset" + " type: " + this.type +
				       " start sending message....");
	}
	
	protected void call() {
		System.out.println(this.brand + ": handset" + " type: " + this.type +
			       " start calling....");
	}
	
	protected void info() {
		System.out.println(this.brand + ": handset" + " type: " + this.type);
	}
	

}

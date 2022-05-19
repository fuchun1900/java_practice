package Demo;

public class Exercise29 {
	public int att;
	
	public Exercise29() {};
	
	public Exercise29(int i) {
		this.att = i;
	};
	
	public int get() {
		return att;
	}
	
	public void set(int i) {
		this.att = i;
	}
	
	public static void main(String args[]) {
		Exercise29 test = new Exercise29(12);
		test.set(88);
		System.out.println("att = " + test.get());
	}
	
	

}

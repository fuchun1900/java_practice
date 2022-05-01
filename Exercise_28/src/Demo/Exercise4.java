package Demo;

public class Exercise4 {
	private int n1;
	private int n2;
	
	public Exercise4(int n1,int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public int add() {
		return n1 + n2;
	}
	public int sub() {
		return n1 - n2;
	}
	public int mult() {
		return n1 * n2;
	}
	public int div() {
		return n1 / n2;
	}
	public static void main(String args[]) {
		Exercise4 number = new Exercise4(23,45);
		System.out.println("a :" + number.n1 + " + " + "b :" + number.n2 + " = " + number.add());
		System.out.println("a :" + number.n1 + " - " + "b :" + number.n2 + " = " + number.sub());
		System.out.println("a :" + number.n1 + " * " + "b :" + number.n2 + " = " + number.mult());
		System.out.println("a :" + number.n1 + " / " + "b :" + number.n2 + " = " + number.div());
	}

}

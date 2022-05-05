package Demo;

public class Exercise17 {
	public int father;
	
	public Exercise17(int i) {
		this.father = i;
	}
	public static void main(String args[]) {
		Exercise17Sub test = new Exercise17Sub(8);
		System.out.println(test.father);
	}
}

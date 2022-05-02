package Demo;

public class Exercise10Add {
	
	public int add(int a,int b) {
		return a + b;
	}
	public double add(double a,double b) {
		return a + b;
	}
	public String add(String a,String b) {
		return a + b;
	}
	
	public static void main(String args[]) {
		Exercise10Add test = new Exercise10Add();
		System.out.println(" a + b = " + test.add(12,13));
		System.out.println(" a + b = " + test.add(12.5,98.2));
		System.out.println(" a + b = " + test.add("hello ","world"));
	}

}

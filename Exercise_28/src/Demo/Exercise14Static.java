package Demo;

public class Exercise14Static {
	public int a = 10;
	public static int b = 5;
	
	public static void main(String args[]) {
		System.out.println("Static number is : " + Exercise14Static.b);
		System.out.println("Instance number is : " + new Exercise14Static().a);
	}

}

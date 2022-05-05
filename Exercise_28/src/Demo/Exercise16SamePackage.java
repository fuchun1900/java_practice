package Demo;
import MainPackage.Exercise16MainClass;
import MainPackage.Exercise16SubClass;


public class Exercise16SamePackage {
	public static void main(String args[]) {
		Exercise16MainClass test = new Exercise16SubClass(8);
		System.out.println(test.i);
	}

}

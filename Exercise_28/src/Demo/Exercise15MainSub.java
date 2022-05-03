package Demo;
import MainPackage.*;

public class Exercise15MainSub{
	
	public static void main(String args[]) {
		ExerciseSub test = new ExerciseSub(2,1);
		System.out.println(test.a);
		System.out.println(test.d); //不能访问不同包的默认变量
	}

}

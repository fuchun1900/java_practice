package MiddleClass;
import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
	static int [] arr = new int[10];
	
	public static void main(String args[]) {
		arr[0] = 1;
		arr[1] = 2;
		System.out.print(arr[2]);
		List<MiddleArrayLol> testlist = new ArrayList<MiddleArrayLol>();
		testlist.add(new MiddleArrayHeros("Garron"));
		testlist.add(new MiddleArrayItems("magicLumb"));
		MiddleArrayHeros hero1 =(MiddleArrayHeros) testlist.get(0);
		MiddleArrayItems item1 = (MiddleArrayItems) testlist.get(1);
		
		System.out.println("hero'sname :" +hero1.toString());
		System.out.println("hero's tech :" + item1.name);
		
	}
	


}

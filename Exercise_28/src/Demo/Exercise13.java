package Demo;
import java.util.Scanner;

public class Exercise13 {
	public Exercise13(int a,int b) {
		int c = (a > b)? a:b;
		System.out.println(c);
	}
	public Exercise13(double a,double b,double c) {
		double d = a * b *c;
		System.out.println(d);
	}
	public Exercise13(String a,String b) {
		if(a.equals(b)) {
			System.out.println("They are equal.");
		}
		else
			System.out.println("They are not equal.");
	}
	
	public static void main(String args[]) {
		int a ;int b;
		double c; double d; double e;
		String s1 ; String s2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Plaes enter two integer : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("Plaes enter three double : ");
		c = sc.nextDouble();
		d = sc.nextDouble();
		e = sc.nextDouble();
		System.out.print("Plaes enter two string : ");
		s1 = sc.next();
		s2 = sc.next();
	
		System.out.println("test1 = " + new Exercise13(a,b));
		System.out.println("test2 = " + new Exercise13(c,d,e));
		System.out.println("test3 = " +  new Exercise13(s1,s2));
	}


}

package MiddleClass;
import java.util.HashSet;
import java.util.Random;
import java.util.Iterator;

public class MiddleHashSetRandNum {
	public HashSet<Integer>randnum = new HashSet<Integer>();
	
	public void addNum() {
		int count = 0;
		while(count < 50) {
			int randint = new Random().nextInt(9999);
			if(randnum.add(randint)) {
				count++;
			}
		}
	}
	
	public void prtarr() {
		Iterator<Integer>it = randnum.iterator();
		int count = 0;
		while(it.hasNext()) {
			int num= it.next();
			System.out.print(num + " ");
			count++;
			if(count % 10 == 0) {
				System.out.println();
			}
		}
	}
	
	public static void main(String args[]) {
		MiddleHashSetRandNum randnum = new MiddleHashSetRandNum();
		randnum.addNum();
		System.out.println("Size =  " + randnum.randnum.size());
		randnum.prtarr();
	}

}

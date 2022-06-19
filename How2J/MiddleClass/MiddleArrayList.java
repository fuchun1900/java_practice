package MiddleClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class MiddleArrayList {
	public static void main(String args[]) {
		List heros = new ArrayList();
		for(int i = 0; i < 100; i++) {
			heros.add(new MiddleArrayHeros("hero " + i ));
		}
		Iterator<MiddleArrayHeros> it = heros.iterator();
		int count = 1;
		/*
		MiddleArrayHeros[] heronames = (MiddleArrayHeros[])heros.toArray(new MiddleArrayHeros[] {});
		for(MiddleArrayHeros hh: heronames) {
			if(hh.toString().equals("hero 1")) {
				System.out.println("Found hero 1");
				break;
			}
			*/
		while(it.hasNext()) {
			MiddleArrayHeros hero = it.next(); 
			if(count % 8 == 0) {
				System.out.println("Now delete " + hero.toString());
				it.remove();
			}
			count++;
		}
	}

}

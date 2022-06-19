package MiddleClass;
import java.util.LinkedList;
import java.util.List;

public class MiddleLinkedArrayMyStack implements MiddleLinkedArrayStack{
	
	public static LinkedList<MiddleArrayHeros>heros = new LinkedList<MiddleArrayHeros>();
	
	@Override
	public void push(MiddleArrayHeros hero) {
		heros.addLast(hero);
	}
	public MiddleArrayHeros pull() {
		return heros.removeLast();
		
	}
	public MiddleArrayHeros peek() {
		return heros.getLast();
	}
	
	public static void main(String args[]) {
		MiddleLinkedArrayMyStack mystack = new MiddleLinkedArrayMyStack();
		mystack.push(new MiddleArrayHeros("Gary"));
		mystack.push(new MiddleArrayHeros("Ellen"));
		mystack.push(new MiddleArrayHeros("Link"));
		System.out.println(mystack.peek().toString());
		mystack.pull();
		System.out.println(mystack.peek().toString());
	
		
	}

}

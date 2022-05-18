package Demo;

public class Exercise26Demo {
	
	public static void main(String args[]) {
		Exercise26Animal cat = new Exercise26Cat("Tom",4);
		Exercise26Animal duck = new Exercise26Duck("Michle",2);
		Exercise26Animal dolphin = new Exercise27Dolphin("Hellen");
		System.out.println(cat.getName() + " has " + ((Exercise26Cat) cat).getLegNum() + " leg.");
		System.out.println(duck.getName() + " has " + ((Exercise26Duck) duck).getLegNum() + " leg.");
		System.out.println(dolphin.getName() + " has " + " 0 " + " leg.");
		cat.shout();
		duck.shout();
		dolphin.shout();
	}

}

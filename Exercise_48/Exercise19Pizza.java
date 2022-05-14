package Demo;

public class Exercise19Pizza {
	
	public String makePizza() {
		return "make a Pizza";
	}
	
	public static void main(String args[]){
		Exercise19BeefPizza bp = new Exercise19BeefPizza();
		Exercise19CheesePizza cp = new Exercise19CheesePizza();
		System.out.println("I have make a " + bp.makePizza() + " and " + cp.makePizza());
	}

}

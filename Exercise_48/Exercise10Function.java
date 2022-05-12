package Demo;
import java.io.IOException;
import java.util.Scanner;

public class Exercise10Function {
	Exercise10Card card;
	
	public void login(String username,String password,double remianing) {
		
		this.card = new Exercise10Card(username,password,remianing);
	}
	
	public void showRemain() throws IOException{
		String username,password;
		int count = 0;
		
		System.out.println("************");
		System.out.print("Welcome to visit our bank System ,please enter your username "
				+ "and password(q to quit) : ");
		do {
			if (count > 0) {
				System.out.println("Wrong username or password,please try it again");
			}
			if (count > 2) {
				System.out.println("Error limit reached");
				return;
			}
			Scanner sc = new Scanner(System.in);
			username = sc.next();
			password = sc.next();
			count++;
		}while(!username.equals(this.card.username) || !password.equals(this.card.password));
		System.out.println(card.username + " card has reminning : " + card.remianing + ".");
	}
	
	public void takeMoney() throws IOException{
		showRemain();
		System.out.print("Please enter the money you want to take : ");
		Scanner sc = new Scanner(System.in);
		double take = sc.nextDouble();
		if (take > card.remianing) {
			System.out.println("Insufficient Balance");
			return;
		}
		card.remianing -= take;
		System.out.println(card.username + " card has reminning : " + card.remianing + ".");
	}
	
	public void saveMoney() throws IOException{
		showRemain();
		System.out.print("Please enter the money you want to save : ");
		Scanner sc = new Scanner(System.in);
		card.remianing += sc.nextDouble();
		System.out.println(card.username + " card has reminning : " + card.remianing + ".");
	}
	
}

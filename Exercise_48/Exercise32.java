package Demo;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Exercise32 {
	
	public static Map<String,Exercise32User>table = new HashMap<String,Exercise32User>();
	
	public static void signUp() {
		System.out.println("Please enter user name: ");
		String id = new Scanner(System.in).next(); 
		System.out.println("Please enter user password: ");
		String password = new Scanner(System.in).next(); 
		if(password.length() >= 6) {
			Exercise32User user = new Exercise32User(id,password);
			table.put(id,user);
			System.out.println("succeed in registration");
			return;
		}
		System.out.println("The length of password must be longger than 6");
	}
	
	public static Exercise32User logIn() {
		Exercise32User user = null;
		int count = 0;
		String password;
		System.out.print("Please enter the user id :");
		String uid = new Scanner(System.in).next();
		if(table.containsKey(uid)) {
			do {
				if(count > 0) {
					System.out.println("You enter wrong password " + count +" times."
							      + " Over 3 times,system will be blocked.");
				}
				user = table.get(uid);
				System.out.print("Please enter the user password :");
				password = new Scanner(System.in).next();
				count++;
			}while(!user.password.equals(password));
			
			return user;
		}
		System.out.println("Not adept the user id .");
		
		return user;
	}
		
	public static void main(String args[]) {
		for(int i = 0; i < 6; i++) {
			System.out.println("-----------");
			signUp();
			}
		if(logIn() != null) {
			System.out.println("Log in successfully!");
		/*
		for(String uid :table.keySet()) {
			System.out.println("UserId : " + uid);
			Exercise32User user = table.get(uid);
			System.out.println("UserPassword : " + user.password);
			*/
		}
	}
}

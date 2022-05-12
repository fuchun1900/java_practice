package Demo;

import java.io.IOException;

public class Exercise10Demo {
	
	public static void main(String args[]) throws IOException {
		System.out.print("Please enter your username and password to login :");
		Exercise10Function test = new Exercise10Function();
		test.login("张三","88888888",0);
		test.saveMoney();
		test.takeMoney();
	}

}

package Demo;
import java.util.Scanner;

public class Exercise27Demo {
	
	public static void main(String args[]) throws Exercise27DrinkNotFoundException {
		System.out.println("Please enter the number of drink(1-3) you want to taste :");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Exercise27Drink.drinkType = choice;
		try {
			Exercise27Drink drink = Exercise27Drink.getDrink(choice);
			drink.taste();
		}catch(Exercise27DrinkNotFoundException e) {
			throw new Exercise27DrinkNotFoundException("The number you select not found."); 
		}
	}

}

package Demo;
import java.util.Scanner;

public class Exercise10 {
	
	public int computerGuess() {
		int computer = (int)(Math.random() * 3 + 1);
		
		return computer;
	}
	
	public int selfGuess() {
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		
		switch(guess) {
		case 1 :
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
		case 0:
			return 0;
		default:
			System.out.println("Please enter 1 - 3");
			return -1;
		}
	}
	
	public void guess() {
		int input,output;
		
		do {
			System.out.println("Plaes enter the number to choose:");
			System.out.println("1.Scissor  2.Stone  3.Cloth");
			input = selfGuess();
			if(input == -1 || input == 0)
				continue;
			output = computerGuess();
			int compare = (input - output + 4) % 3 - 1;
			if(compare >0) {
				System.out.println("You win");
			}
			else if(compare < 0) {
				System.out.println("You lose");
			}
			else
				System.out.println("Draw");
		}while(input != 0);
	}
	
	public static void main(String args[]) {
		Exercise10 test = new Exercise10();
		test.guess();
	}

}

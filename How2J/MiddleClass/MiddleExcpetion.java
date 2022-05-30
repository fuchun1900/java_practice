package MiddleClass;
import java.util.Scanner;

public class MiddleExcpetion {
	
	public static void bankManage(MiddleExceptionAccount bank) {
		
		try {
			System.out.println("please choose despoit or withdraw money :");
			System.out.println("1.despoit  2.withdraw  3.Check :");
			int choose = new Scanner(System.in).nextInt();
			double money = 0;
			switch(choose) {
			case 1: 
				System.out.print("How much you want to despoit : ");
				money = new Scanner(System.in).nextDouble();
				bank.despoit(money);
				break;
				
			case 2:
				System.out.print("How much you want to withdraw : ");
				money = new Scanner(System.in).nextDouble();
				bank.withdraw(money);
				break;
				
			case 3:
				System.out.print("How much you want to checkout : ");
				money = new Scanner(System.in).nextDouble();
				bank.withdraw(money);
				System.out.println("Your check amount is " + 
						((MiddleCheckingAccount)bank).OverdraftProtection);
				break;
				
			default:
				System.out.println("Out of range.");
				break;
			}
		}catch(OverdraftException e) {
			e.printStackTrace();
			System.out.println(" Overdraft " + e.getDeficit());
		}
		finally {
			System.out.println("Your balance is " + bank.getBalance());
		}
	}
	
	public static void main(String args[]) {
		
		MiddleExceptionAccount bank = new MiddleExceptionAccount(1490);
		bankManage(bank);
	}
}
	



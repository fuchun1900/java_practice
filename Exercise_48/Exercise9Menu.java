package Demo;
import java.util.Scanner;

public class Exercise9Menu {
	
	public void showLoginMenu() {
		int input;
		do {
			System.out.println("欢迎登陆我行我爱购物管理系统");
			System.out.println("        1.登陆系统");
			System.out.println("        2.退出");
			System.out.println("***********************");
			System.out.print("请选择，输入数字:");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			switch(input){
			case 1:
				showMainMenu();
				break;
			case 2:
				return;
			default:
				System.out.println("请输入1 - 2:");
			}
		}while(input != 2);
	}
	public void showMainMenu() {
		int input;
		do {
			System.out.println("我行我爱购物系统管理主菜单");
			System.out.println("        1.客户信息管理");
			System.out.println("        2.真情回馈");
			System.out.println("***********************");
			System.out.print("请选择，输入数字或按0返回上一级菜单:");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			switch(input){
			case 1:
				showCustMenu();
				break;
			case 2:
				sendGMenu();
				break;
			default:
				System.out.println("请输入0 - 1 - 2:");
			}
		}while(input != 0);
	}
	public void showCustMenu() {
		System.out.println("显示客户信息");
	}
	public void sendGMenu() {
		int input;
		do {
			System.out.println("我行我爱购物系统>真情回馈");
			System.out.println("*********************");
			System.out.println("        1.幸运大放送");
			System.out.println("        2.幸运抽奖");
			System.out.println("        3.生日词典");
			System.out.println("*********************");
			System.out.print("请选择，输入数字或按0返回上一级菜单:");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			switch(input){
			case 1:
				System.out.println("执行幸运大放送");
				break;
			case 2:
				System.out.println("执行幸运抽奖");
				break;
			case 3:
				System.out.println("执行生日词典");
				break;
			default:
				System.out.println("请输入0 - 1 - 2 - 3:");
			}
		}while(input != 0);
	}

}

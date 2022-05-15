package Demo;
import java.util.Scanner;

public class Exercise20Demo {

	public static void prt() {
		int input,choose,days;
		Scanner sc;
		
		do {
			System.out.println("       欢迎光临神车租赁系统👏         ");
			System.out.println("-----------------------------------");
			System.out.println("请选择租车的种类: 1. 轿车    2.客车    3.退出");
			sc = new Scanner(System.in);
			input = sc.nextInt();
			switch(input) {
			case 1:
				Exercise20Car car = null;
				do {
					System.out.println("           请选择轿车的种类           ");
					System.out.println("-----------------------------------");
					System.out.println("1. 别克商务舱GL8(600元/天）  2. 宝马550i(500元/天)" + "\n"
							   + "  3. 别克林荫大道(300元/天）    4.返回主菜单");
					System.out.println("请输入1至4之间的数字: ");
					sc = new Scanner(System.in);
					choose = sc.nextInt();
				    }while(choose < 1 || choose > 4);
				switch(choose) {
				case 1:
					car = new Exercise20Car("沪a87213","别克","商务舱GL8","黑色");
					break;
				case 2:
					car = new Exercise20Car("沪B14810","宝马","550i","白色");
					break;
				case 3:
					car = new Exercise20Car("沪A34912","别克","林荫大道","红色");
					break;
				case 4:
					continue;
				}
				System.out.print("您选择了 " + car.type + ",车牌号是: " + car.no + 
						",颜色为" + car.color + ",请输入租赁天数: ");
				sc = new Scanner(System.in);
				days = sc.nextInt();
				System.out.println(days + "天租赁价格为: " + car.calcRent(days) + "元");
				break;
			case 2:
				Exercise20Bus bus;
				System.out.println("           请选择巴士的种类           ");
				System.out.println("-----------------------------------");
				System.out.println("16座以上(￥1500/天)、16座以下(￥800/天)");
				System.out.println("请输入巴士的座位数,座位数默认8座 :");
				sc = new Scanner(System.in);
				int seats = sc.nextInt();
				if(seats < 4)
					bus = new Exercise20Bus();
				else
					bus = new Exercise20Bus("沪c87212",seats,"金黄色");
				System.out.print("您选择了 " + bus.seatcount + "座巴士,车牌号是: " + bus.no + 
						",颜色为" + bus.color + ",请输入租赁天数: ");
				sc = new Scanner(System.in);
				days = sc.nextInt();
				System.out.println(days + "天租赁价格为: " + bus.calcRent(days) + "元");
				break;
			case 3:
				System.out.println("谢谢光临，欢迎您下次再来!");
				return;
			default:
				System.out.println("请输入1至3之间的数字: ");
				break;
			}
		}while(input != 3);
	}
	
	public static void main(String args[]) {
		prt();
	}
}

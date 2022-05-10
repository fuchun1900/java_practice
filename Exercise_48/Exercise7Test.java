package Demo;

public class Exercise7Test {
	
	public static void main(String args[]) {
		Exercise7Customer customer1 = new Exercise7Customer(6000,"普卡");
		customer1.show();
		if((customer1.type.equals("金卡") && customer1.points > 1000)
		   || (customer1.type.equals("普卡") && customer1.points > 5000)) {
			customer1.points += 500;
			System.out.println("回馈积分500！");
		}
	}

}

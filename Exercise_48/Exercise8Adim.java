package Demo;
import java.util.Scanner;

public class Exercise8Adim {
	private String id;
	private String password;
	
	Exercise8Adim(String id, String password){
		this.id = id;
		this.password = password;
	}
	
	private void show() {
		System.out.println("姓名: " + id + ",密码: " + password);
	}
	
	public void modify() {
		String id, password;
		int count = 0;
		
		do {
			if(count > 0) {
				System.out.println("用户名和密码不匹配，请重新输入！");
			}
			if(count == 3)
			{
				System.out.println("您输错了三次，系统锁定！");
				return;
			}
			System.out.print("请输入用户名 : ");
			Scanner sc1 = new Scanner(System.in);
			id = sc1.next();
			System.out.print("请输入密码 : ");
			Scanner sc2 = new Scanner(System.in);
			password = sc2.next();
			count++;
		}while(!id.equals(this.id) || !password.equals(this.password));
		System.out.print("请输入新密码 : ");
		Scanner sc1 = new Scanner(System.in);
		this.password = sc1.next();
		System.out.print("密码修改成功！");
		this.show();
	}

}

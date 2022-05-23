package Demo;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Exercise34Demo {
	
	public final static Map<String,Exercise34User>table = new HashMap<String,Exercise34User>();
	
	public static void signUp() {
		String password1,password2,userid;
		
		do {
		System.out.print("请输入用户名: ");
		userid = new Scanner(System.in).next();
		System.out.print("请输入密码: ");
		password1 = new Scanner(System.in).next();
		System.out.print("请再次输入密码: ");
		password2 = new Scanner(System.in).next();
		if(!password2.equals(password1))
		{
			System.out.println("两次输入的密码不相同!");
			continue;
		}
		if(userid.length() < 3 || password2.length() < 6) {
			System.out.println("用户名不能小于3，用户密码不能小于6");
			continue;
		}
		}while(userid.length() < 3 || !(password2.equals(password1)) || password2.length() < 6);
		register(userid,password2);
	}
	
	public static void register(String uid, String password) {
		Exercise34User user = new Exercise34User(uid,password);
		table.put(uid,user);
		System.out.println("注册成功！");
	}
	
	public static void showTable(Map<String,Exercise34User> table) {
		Iterator<Exercise34User>it = table.values().iterator();
		Exercise34User user = null;
		if(it.hasNext()) {
			user = it.next();
			System.out.println("用户名: " + user.userid);
			System.out.println("密码: " + user.password);
		}
		else
			System.out.println("未注册用户");
	}
	
	public static void main(String args[]) {
		System.out.println("欢迎进入用户管理系统");
		System.out.println("---"
				+ "---------------");
		signUp();
		showTable(table);
		
	}
	

}

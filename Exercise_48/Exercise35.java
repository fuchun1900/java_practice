package Demo;
import java.util.Scanner;

public class Exercise35 {
	
	public static void main(String args[]) {
		System.out.println("----欢迎进入作业提交系统----");
		System.out.print("请输入文件名:");
		String filename = new Scanner(System.in).next();
		if(filename.endsWith(".java")) {
			System.out.println("文件名有效！请输入邮箱地址:");
			String mailadress = new Scanner(System.in).next();
			if(mailadress.contains(".") && mailadress.contains("@")
					&& (mailadress.indexOf(".") > mailadress.indexOf("@")))
				System.out.println("作业提交成功");
			else
				System.out.println("Email地址无效！");
		}
		else
			System.out.println("文件名无效，作业提交失败");
	}

}

package MiddleClass;
import java.io.File;
import java.util.Date;

public class MiddleIoTest {
	
	public static void main(String args[]) {
		File f1 = new File("/Users/fuchun/Document/java_project");
		System.out.println("f1的绝对路径:" + f1.getAbsolutePath());
		File f2 = new File("fuchun");
		System.out.println("f2的绝对路径:" + f2.getAbsolutePath());
		System.out.println("f1是否存在:" + f1.exists());
		System.out.println("f1的长度:" + f1.length());
		//文件最后修改时间
		long time = f1.lastModified();
		Date d = new Date(time);
		System.out.println("获取文件最后的修改时间: " + d);
		f1.setLastModified(0);
	}
	

}

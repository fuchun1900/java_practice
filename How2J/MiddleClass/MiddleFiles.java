package MiddleClass;
import java.io.File;
import java.io.IOException;

public class MiddleFiles {
	
	public static void main(String args[]) {
		
		File f = new File("/Users/fuchun/Document/c++_language_project/pppc++");
		//1⃣️字符串数组形式返回当前文件夹下所有文件	
		for(String s : f.list()) {
			System.out.print(s + " ");
		}
		System.out.println();
		//以文件数组的形式，返回当前文件夹下所有文件
		File[]fs = f.listFiles();
		for(File s : fs) {
			System.out.println(s + " ");
		}
		System.out.println();
		//以字符串方式返回所在文件夹
		System.out.println(f.getParent());
		
	}

}

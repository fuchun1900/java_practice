package MiddleClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MiddleIoStream {
	
	public static void main(String args[]) {
		try {
			File file = new File("/Users/fuchun/Document/java_project/Eclipse_workspace/How2J.CN/src/MiddleClass/test.txt");
			FileInputStream fls = new FileInputStream(file);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

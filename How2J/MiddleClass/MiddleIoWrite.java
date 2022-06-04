package MiddleClass;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MiddleIoWrite {
	
	public static File fileaddress = new File("/Users/fuchun/Document/java_project/Eclipse_workspace"
								+ "/How2J.CN/src/MiddleClass/iotest2.txt");
	
	public static void outputFile() {
		byte[] bt = new byte[]{65,66};
		try {
			FileOutputStream iof = new FileOutputStream(fileaddress);
			iof.write(bt);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		outputFile();
	}
	
	

}

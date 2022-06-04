package MiddleClass;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MiddleFileWrite {
	
	public static File files = new File("/Users/fuchun/Document/java_project/Eclipse_workspace"
			                        + "/How2J.CN/src/MiddleClass/编码文件夹/encoding.txt");
	
	public static void fileWrite(String text,File filename) {
		char[] input = text.toCharArray();
		FileWriter fwt = null;
		try {
			fwt = new FileWriter(filename);
			fwt.write(input);
		}
		catch(FileNotFoundException ef) {
			try {
				filename = new File("/Users/fuchun/Document/java_project/"
							+ "Eclipse_workspace/How2J.CN/src/MiddleClass/编码文件夹");
				filename.mkdirs();
				filename = new File(filename,"encoding.txt");
				fwt = new FileWriter(filename);
				fwt.write(input);
			}catch(IOException ex1) {
				ex1.printStackTrace();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fwt != null) {
				try {
					fwt.close();
				}catch(IOException ex2) {
					ex2.printStackTrace();
				}
			}
		}
		System.out.println("写入完成");
	}
	public static void main(String args[]) {
		fileWrite("2b0aA!@#$%^&*()_+!中",files);
	}
	

}

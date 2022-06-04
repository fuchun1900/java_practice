package MiddleClass;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MiddleFileReader {
	
	public static File files= new File("/Users/fuchun/Document/java_project/Eclipse_workspace/"
			                + "How2J.CN/src/MiddleClass");
	public static char[] all;
	
	public static void fileRead(String filename) {
		File inputfile = new File(files,filename);
		all = new char[(int)inputfile.length()];
		try {
			FileReader frd = new FileReader(inputfile);
			frd.read(all);
			for(char c: all) {
				System.out.println(c);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		fileRead("iotest2.txt");
	}
	


}

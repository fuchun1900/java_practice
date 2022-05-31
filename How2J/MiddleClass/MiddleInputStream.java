package MiddleClass;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MiddleInputStream {
	
	public static File file = new File("/Users/fuchun/Document/java_project/Eclipse_workspace/"
			                       + "How2J.CN/src/MiddleClass");
	
	public static void main(String args[]) {
		
		
		try {
			File inputfile = new File(file,"xyz/abc/def");
			inputfile.mkdirs();
			inputfile = new File(inputfile,"test1.txt");
			FileOutputStream fos = new FileOutputStream(inputfile);
			byte data[] = {121,122};
			fos.write(data);
			fos.close();			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	

}

package MiddleClass;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MiddleSeperate {
	public static File origin = new File("/Users/fuchun/Document/java_project/思考题及答案.doc");
	public static String output = "/Users/fuchun/Document/java_project"
			              + "/Eclipse_workspace/How2J.CN/src/MiddleClass/拆分文件/";
	public static byte[] all;
	public final static int step = 1024 * 100; 
	
	public static void readDoc(File file) {
		try {
			FileInputStream input = new FileInputStream(file);
			all = new byte[(int) file.length()];
			input.read(all);
			input.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeDoc() {
		int start = 0;
		int fileno = 1;
		FileOutputStream fos = null;
		while(start < (int) all.length) {
			byte temp[] = new byte[step];
			try {
				File file = new File(output + "思考题及答案" + fileno);
				fos = new FileOutputStream(file);
				try {
					  System.arraycopy(all,start,temp,0,step);
					}catch(IndexOutOfBoundsException e) {
						System.out.println(file.length());
						temp = new byte[(int) (all.length % step)];
						System.arraycopy(all,start,temp,0,(int) all.length % step);
					}
				 fos.write(temp);
				 fileno++;
				 start += step;
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				if(fos != null)
					try {
						fos.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
			}
		}
		System.out.println("Successful!");
	}
	
	public static void main(String args[]) {
		
		readDoc(origin);
		writeDoc();
		
	}

}

package MiddleClass;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class MiddleFileEncong extends MiddleFileWrite{
	
	public static File outfiles = new File("/Users/fuchun/Document/java_project/Eclipse_workspace"
                  + "/How2J.CN/src/MiddleClass/编码文件夹/decoding.txt");
	
	public static char[] fileReader() {
		FileReader frd = null;
		try {
			char[] all = null;
			frd = new FileReader(files);
			all = new char[(int)files.length()];
			frd.read(all);
			return all;
		}catch(IOException ex) {
			ex.printStackTrace();
			return null;
		}finally {
			if(frd != null) {
				try {
					frd.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static char[] decode(char[] all) {
		char[] temp = new char[(int)all.length];
		for(int i = 0 ;i < (int)all.length; i++) {
			if(all[i] <= '9' && all[i] >= '0') {
				if(all[i] == '0') {
					temp[i] = '9';
				}
				else
					temp[i] = ((char)(all[i] - 1));
			}
			else if((all[i] <= 'z' && all[i] >= 'a') ||
					(all[i] <= 'Z' && all[i] >= 'A')) {
				if(all[i] == 'a') {
					temp[i] = 'z';
				}
				else if(all[i] == 'A') {
					temp[i] = 'Z';
				}
				else
					temp[i] = ((char)(all[i] - 1));
					
			}
			else
				temp[i] = all[i];
		}
		return temp;
	}
	
	
	public static void main(String args[]) {
		String code = new String(decode(fileReader()));
		File files = new File("/Users/fuchun/Document/java_project/Eclipse_workspace"
				+ "/How2J.CN/src/MiddleClass/编码文件夹/decode.txt");
		fileWrite(code,files);
	}
}

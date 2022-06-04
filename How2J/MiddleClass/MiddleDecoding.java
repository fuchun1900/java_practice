package MiddleClass;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileReader;



public class MiddleDecoding {
	
	public static final String root = "/Users/fuchun/Document/java_project/Eclipse_workspace"
			+ "/How2J.CN/src/MiddleClass/编码文件夹";
	
	public static char[] readFile(File files, String filename) {
		files = new File(files, filename);
		FileReader frd = null;
		try {
			frd = new FileReader(files);
			char[] temp = new char[(int)(files.length())];
			frd.read(temp);
			return temp;
		}catch(IOException e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(frd != null) {
					frd.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static char[] phrase(char[] trans) {
		char[] temp = new char[(int)(trans.length)];
		for(int i = 0; i < trans.length; i++) {
			if(trans[i] <= '9' && trans[i] >='0') {
				if(trans[i] == '9') {
					temp[i] = '0';
				}
				else {
					temp[i] = (char)(trans[i] + 1);
				}
			}
			else if((trans[i] <= 'z' && trans[i] >= 'a') ||
					(trans[i] <= 'Z' && trans[i] >= 'A')) {
				if(trans[i] == 'Z') {
					temp[i] = 'A';
				}
				else if(trans[i] == 'z') {
					temp[i] = 'a';
				}
				else {
					temp[i] = (char) (trans[i] + 1);
				}
			}
			else {
				temp[i] = trans[i];
			}
		}
		
		return temp;
	}
	
	
	
	public static void main(String args[]) {
		File filename = new File(root);
		String origin = new String(readFile(filename,"encoding.txt"));
		String decode = new String(readFile(filename,"decode.txt"));
		String phrasedecode = new String(phrase(decode.toCharArray()));
		
		if( origin != null && decode != null) {
			System.out.println(phrasedecode + " length = " + phrasedecode.length());
			System.out.println(origin + " length = " + origin.length());
			System.out.println(phrasedecode.equals(origin)); //因为文件大小不同导致做出的结果不一致
		}
		
	}
	
	

}

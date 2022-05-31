package MiddleClass;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
public class MiddleCombine {
	
	public static String origin = "/Users/fuchun/Document/java_project/Eclipse_workspace/How2J.CN"
			+ "/src/MiddleClass/拆分文件/";
	public static File output = new File("/Users/fuchun/Document/java_project/Eclipse_workspace/How2J.CN"
			+ "/src/MiddleClass/测试文件.doc");
	public final static int step = 1024 * 100;
	
	public static List readFile() {
		int count = 1;
		File file = null;
		FileInputStream input = null;
		List<byte[]>inputlist = new ArrayList<byte[]>();
		byte[]arr;
		do {
			try {
				file = new File(origin + "思考题及答案" + count++);
				if(!file.exists()) 
					break;
				input = new FileInputStream(file);
				arr = new byte[(int) file.length()];
				input.read(arr);
				inputlist.add(arr);
				
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				if(input != null)
					try {
						input.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
			}
		}while(true);
		
		return inputlist;
	}
	
	public static void writeFile(List<byte[]> arrlist) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(output);
			for(byte[] arr : arrlist) {
				fos.write(arr);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fos != null) {
				try {
					fos.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("文件合并成功！");
	}
	
	public static void main(String args[]) {
		writeFile(readFile());
		
	}
	

}

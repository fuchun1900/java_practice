package MiddleClass;
import java.io.File;
import java.io.IOException;

public class MiddleIoExercise1 {
	
	public static void searchFile(File f) {
		File[] fs = f.listFiles();
		File biggest,smallest;
		biggest = smallest = fs[0];
		for(File file : fs) {
			if (file.length() > biggest.length()) {
				biggest = file;
			}
			else if(file.length() < smallest.length() && 
			      smallest.length() != 0){
				smallest = file;
			}
			else if(file.isDirectory() && file.listFiles() != null) {
				searchFile(file);
			}
		}
		System.out.println("The biggest file is : " + biggest.getName());
		System.out.println("The smallest file is : " + smallest.getName());
	}
		
	
	public static void main(String args[]) {
		
		File f = new File("/Users/fuchun/Document/c++_language_project/pppc++/chapter1-3");
		searchFile(f);
		
	}
	
}

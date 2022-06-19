package MiddleClass;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MiddleHashSet {
	
	public String[] sarry = new String[100];
	
	public String stringArr() {
		String ss = new String();
		for (int i = '0'; i <= '9'; i++) {
			ss += (char) i;
		}
		for (int i = 'a'; i <= 'z'; i++) {
			ss += (char) i;
		}
		for (int i = 'A'; i <= 'Z'; i++) {
			ss += (char) i;
		}
		return ss;
	}
	
	public void randString() {
		String st = stringArr();
		char[] temp = new char[2];
		for(int i = 0; i < sarry.length; i++) {
			for(int j = 0; j < temp.length; j++) {
				int index1 = new Random().nextInt(st.length());
				temp[j] = st.charAt(index1);
			}
			sarry[i] =new String(temp);
		}
	}
	
	public void prtString() {
		for(int i = 1; i <= this.sarry.length; i++) {
			System.out.print(sarry[i - 1] + ' ');
			if(i % 10 == 0) {
				System.out.println('\n');
			}
		}
	}
	
	public List<String> duplicate() {
		List<String> duplicate = new ArrayList();
		HashSet<String>dropduplicate = new HashSet<String>();
		for(int i = 0; i < sarry.length; i++) {
			if(!dropduplicate.add(sarry[i])) {
				duplicate.add(sarry[i]);
			}
		}
		return duplicate;
	}
	
	public static void main(String args[]) {
		MiddleHashSet test = new MiddleHashSet();
		test.randString();
		test.prtString();
		List<String> duplicate = test.duplicate();
		System.out.println("重复元素如下:");
		for(String s : duplicate) {
			System.out.print(s + ' ');
		}
	}
}

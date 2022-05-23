package Demo;

public class Exercise37 {
	
	public static void main(String args[]) {
		System.out.println("***原歌词格式***");
		System.out.println("长亭外 古道边 芳草碧连天 晚风拂柳笛声残 夕阳山外山\n\n");
		System.out.println("***拆分后的字符串***");
		String s = "长亭外 古道边 芳草碧连天 晚风拂柳笛声残 夕阳山外山\n\n";
		String []arr =  s.split(" ",5);
		for(String i : arr) {
			System.out.println(i);
		}
	}

}

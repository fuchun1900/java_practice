package Demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise39 {
	
	public static long getAge(String birth) {
		try {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = f.parse(birth);
		String nowadays = f.format(new Date());
		
		return getPeriod(f.parse(nowadays),birthday);
		
		}catch(ParseException e) {
			throw new RuntimeException(e.getMessage());
		}
		
	}
	
	public static long getPeriod(Date d1, Date d2) {
		long p = d1.getTime() - d2.getTime();
		
		return p/1000/60/60/24/365;
	}
	
	public static void main(String args[]) {
		System.out.print("Please enter your birthday such as yyyy-MM-dd :");
		String birthday = new Scanner(System.in).next();
		System.out.print("Your age is " + getAge(birthday) + " old .");
	}

}

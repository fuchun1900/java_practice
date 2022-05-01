package Demo;

import java.util.InputMismatchException;

public class Exercise3MyTime {
	private int save;
	private int hour;
	private int minute;
	private int second;
	final static private int day_sec = 24*60*60;
	final static private int day_hour = 60*60;
	
	public Exercise3MyTime(int n) throws InputMismatchException{
		this.save = n;
		this.hour = save / day_hour;  //求小时数
		this.second = (save - this.hour * day_hour) % 60 ;  //求秒数
		this.minute = (save - this.hour * day_hour) /60;
	}
	void showTime() {
		System.out.println("the time is "+this.hour+":"+this.minute+":"+this.second);
	}
	public static void main(String args[]) {
		Exercise3MyTime MyTime = new Exercise3MyTime(3602);
		MyTime.showTime();
	}

}

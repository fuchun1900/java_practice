package Demo;

public class Exercise21Motobike extends Exercise21Vehicle{
	
	protected String NoOfWheels(int n) {
		if(n == 2) {
			return "两轮车";
		}
		else if(n == 4) {
			return "四轮车";
		}
		else
			return "未知车辆";
	}
}

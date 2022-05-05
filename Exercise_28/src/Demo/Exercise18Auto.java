package Demo;

public class Exercise18Auto {
	protected int wheel = 4;
	protected String color = "白色";
	protected double weight;
	protected double speed = 0;
	
	public Exercise18Auto(int wheel,String color,double weight) {
		this.wheel = wheel;
		this.color = color;
		this.weight = weight;
	}
	public Exercise18Auto(double weight) {
		this.weight = weight;
	}
	protected void Start() {
		System.out.println("Start the engin....");
		this.speed = 10;
	}
	protected void SpeedUp(double up) {
		if(this.speed == 0) {
			Start();
		}
		this.speed += up;
		System.out.println("Now speed up to  " +this.speed);
	}
	protected void SpeedDown(double down) {
		if(down > this.speed) {
			System.out.println("You must to speed up !");
		}
		else {
			this.speed -= down;
			System.out.println("Now speed down to " + this.speed);
		}
	}
	protected void Stop() {
		if(this.speed != 0) {
			this.speed = 0;
		}
		System.out.println("Hault! ");
	}
	public static void main(String args[]) {
		Exercise18Auto auto = new Exercise18Auto(15);
		System.out.println(auto.color + " has " + auto.wheel + " wheels " + auto.weight + " tons weight.");
		auto.SpeedUp(120);
		auto.SpeedDown(100);
		auto.Stop();
		System.out.println(auto.speed);
		
		Exercise18Car car = new Exercise18Car(4,"蓝色",15,"大金空调","Sony音响");
		System.out.println("This car " +car.color + " has " + car.wheel + " wheels "
					+ car.weight + " tons weight."
					+ '\n' + "空调 ：" + car.ac + '\n' +"CD ：" + car.cd);
		car.SpeedUp(100);
		car.SpeedDown(40);
		car.Stop();
	}
	
		

	

}

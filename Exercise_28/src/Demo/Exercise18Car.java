package Demo;

public class Exercise18Car extends Exercise18Auto{
	protected String ac;
	protected String cd;
	
	public Exercise18Car(int wheel,String color,double weight,String ac,String cd) {
		super(wheel,color,weight);
		this.ac = ac;
		this.cd = cd;
	}
	public Exercise18Car(double weight,String ac,String cd) {
		super(weight);
		this.ac = ac;
		this.cd = cd;
	}
	@Override
	protected void SpeedUp(double up) {
		if(this.speed == 0) {
			Start();
		}
		this.speed += up;
		System.out.println("Car now speed up to  " +this.speed);
	}
	@Override
	protected void SpeedDown(double down) {
		if(down > this.speed) {
			System.out.println("You must to speed up !");
		}
		else {
			this.speed -= down;
			System.out.println("Car now speed down to " + this.speed);
		}
	}
}



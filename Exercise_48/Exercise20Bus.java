package Demo;

public final class Exercise20Bus extends Exercise20MotoVehicle{
	public int seatcount = 8;
	
	public Exercise20Bus() {
		this.color = "蓝色";
		this.no = "沪C9882";
	};
	
	public Exercise20Bus(String no, int seatcount) {
		this.no = no;
		this.seatcount = seatcount;
		this.color = "蓝色";
	}
	
	public Exercise20Bus(String no, int seatcount, String color) {
		this.no = no;
		this.seatcount = seatcount;
		this.color = color;
	}
	
	public double calcRent(int days) {
		if(this.seatcount <= 16) {
			return days * 800;
		}
		else
			return days * 1500;
	}
}

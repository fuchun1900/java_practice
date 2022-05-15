package Demo;

public final class Exercise20Car extends Exercise20MotoVehicle{
	public String type;
	
	public Exercise20Car() {};
	
	public Exercise20Car(String no, String brand, String type) {
		this.no = no;
		this.brand = brand;
		this.type = type;
	}
	
	public Exercise20Car(String no, String brand,String type, String color) {
		this.no = no;
		this.brand = brand;
		this.type = type;
		this.color = color;
	}
	
	public double calcRent(int days) {
		if(this.brand.equals("别克")) {
			if(this.type.equals("商务舱GL8")){
				return days * 600;
			}
			else
				return days * 300;
		}
		else  {
			return days * 500;
		}
	}
}

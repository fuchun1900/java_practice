package Demo;

public class Exercise7 {
	public String size;
	public double quantity;
	public Boolean likeSoup = false;
	
	public Exercise7(String size,double quantity, Boolean bo) {
		this.size = size;
		this.quantity = quantity;
		this.likeSoup = bo;
	}
	
	public Exercise7(String size,double quantity) {
		this.size = size;
		this.quantity = quantity;
	}
	public void check() {
		if(this.likeSoup) {
			System.out.println(this.quantity + " 两 " + this.size + "面" +" 带汤。");
		}
		else {
			System.out.println(this.quantity + " 两 "+ this.size + "面" +" 不带汤。");
		}
	}
	public static void main(String args[]) {
		Exercise7 test1 = new Exercise7("干拌面",20.5);
		test1.check();
		Exercise7 test2 = new Exercise7("牛肉面",22,true);
		test2.check();
	}
	

}

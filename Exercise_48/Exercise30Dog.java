package Demo;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise30Dog {
	private String name;
	private int health = 100;
	private int love = 100;
	private String strain;
	
	public Exercise30Dog(String name, String strain) {
		this.name = name;
		this.strain = strain;
	}
	
	protected String getName() {
		return this.name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	
	protected void setHealth(int health) {
		this.health = health;
	}
	
	public int getLove() {
		return this.love;
	}
	
	protected void setLove(int love) {
		this.love = love;
	}
	
	public void setStrain(String Strain) {
		this.strain = Strain;
	}
	
	public String getStrain() {
		return this.strain;
	}
	
	public static Exercise30Dog getDog(String name,Map<String,String> dogs) {
		Exercise30Dog dog;
		if(dogs.containsKey(name)) {
			dog = new Exercise30Dog(name,dogs.get(name));
			return dog;
		}
		return null;
	}
	
	public static void main(String args[]) {
		
		Map<String,String> dogs = new HashMap<String,String>();
		dogs.put("欧欧","雪纳瑞");
		dogs.put("亚亚","拉布拉多");
		dogs.put("美美","泰迪");
		dogs.put("菲菲","金毛犬");
		
		System.out.println("请输入狗狗昵称：");
		String name = new Scanner(System.in).next();
		Exercise30Dog dog;
		if((dog = getDog(name,dogs)) != null) {
			System.out.println("狗狗昵称: " + dog.getName());
			System.out.println("狗狗品种: " + dog.getStrain());
			System.out.println("狗狗健康值: " + dog.getHealth());
			System.out.println("狗狗爱心值: " + dog.getLove());
		}
		else
			System.out.println("没有这个狗狗!");
		
	}


}

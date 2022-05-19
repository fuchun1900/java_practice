package Demo;

public class Exercise29Penguin {
	public String name = "Pegi";
	public int health = 100;
	protected int love = 0;
	public String sex = "male";
	
	public Exercise29Penguin() {};
	
	public Exercise29Penguin(String name, int health,String sex) {
		this.name = name;
		this.health = health;
		this.sex = sex;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
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

}

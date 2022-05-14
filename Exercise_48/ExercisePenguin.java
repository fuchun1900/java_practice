package Demo;

public class ExercisePenguin {
	String nickname;
	int health = 60;
	int intimacy = 0;
	String gender = "雄性";
	
	public ExercisePenguin(String nickname, int health, String type) {
		this.nickname = nickname;
		this.health = health;
		this.gender = type;
	}
	
	public ExercisePenguin(String nickname, String type) {
		this.nickname = nickname;
		this.gender = type;
	}
		
	public void show() {
		System.out.println("我的名字是" + this.nickname + ", 健康值是" + this.health +
				       ",和主人的亲密度是" + this.intimacy + ",我是一个" + this.gender + "企鹅。");
	}

}


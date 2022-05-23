package Demo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Exercise31 {
	
	public static void main(String args[]) {
		ExercisePenguin ouou = new ExercisePenguin("欧欧","雄性");
		ExercisePenguin yaya = new ExercisePenguin("亚亚","雌性");
		ExercisePenguin meimei = new ExercisePenguin("美美","雌性");
		ExercisePenguin feifei = new ExercisePenguin("菲菲","雌性");
		
		Map<String,ExercisePenguin>penguins = new HashMap<String,ExercisePenguin>();
		penguins.put("欧欧",ouou);
		penguins.put("亚亚",yaya);
		penguins.put("美美",meimei);
		penguins.put("菲菲",feifei);
		/*
		for(int i = 0; i < penguins.size(); i++) {
			System.out.println(i + ":" +  penguins.values());
		}*/
		Iterator<ExercisePenguin>it = penguins.values().iterator();
		while(it.hasNext()) {
			ExercisePenguin penguin = it.next();
			System.out.println("企鹅昵称: " + penguin.nickname);
			System.out.println("企鹅性别: " + penguin.gender);
			System.out.println("企鹅健康值: " + penguin.health);
			System.out.println("企鹅爱心值: " + penguin.intimacy);
			System.out.println("----------------------");
		}
	}
}

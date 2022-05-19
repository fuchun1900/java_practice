package Demo;
import java.util.ArrayList;
import java.util.List;


public class Exercise29Demo {
	
	public static void show(List<Exercise29Penguin> l) {
		System.out.println("There are " + l.size() + " penguins.\n");
		for(Exercise29Penguin p : l) {
			System.out.println("name : " + p.getName());
			System.out.println("health : " + p.getHealth());
			System.out.println("love : " + p.getLove());
			System.out.println("sex :" + p.sex);
			System.out.println("--------------------");
		}
	}
	
	public static void del(int n,List<Exercise29Penguin>l) {
		if(n > l.size()) {
			System.out.println("Out of range.");
			return;
		}
		int i = 0;
		while(i < n - 1) {
			i++;
		}
		l.remove(i);
		System.out.println("Delete element " + i + " compeletly!");
	}
	
	public static void del(String name,List<Exercise29Penguin>l) {
		Exercise29Penguin penguin = null;
		for(Exercise29Penguin p : l) {
			if(p.name.equals(name))
				penguin = p;
		}
		if(l.remove(penguin)) {
			System.out.println("Delete " + penguin.name + " compeletly!");
		}
		else
			System.out.println("Delete " + penguin.name + " imcompeletly!");
	}
	
	public static void main(String args[]) {
		String name[] = new String[] {"pengpeng","mingming","feifei","zhuangzhuang","lili"};
		String sex[] = new String[] {"male","male","female","male","female"};
		int health[] = new int[] {89,72,56,77,93};
		List<Exercise29Penguin> penguins = new ArrayList<Exercise29Penguin>();
		
		for(int i = 0; i < name.length; i ++) {
			Exercise29Penguin penguin = new Exercise29Penguin(name[i],health[i],sex[i]);
			penguins.add(penguin);
		}
		show(penguins);
		del(1,penguins);
		show(penguins);
		del("feifei",penguins);
		show(penguins);
	}

}

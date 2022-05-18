package Demo;
import java.util.ArrayList;
import java.util.List;

public class Exercise28 {
	
	public static void main(String args[]) {
		ArrayList<Exercise28Student> Students = new ArrayList<Exercise28Student>();
		String[] student = new String[] {"Tom","Hellen","Jack","Peter","Linda"};
		for(int i = 0; i < 5; i++ ) {
			double scores = Math.random() * 100;
			Exercise28Student students = new Exercise28Student(student[i],scores);
			Students.add(students);
		}
		for(Exercise28Student s : Students) {
			System.out.printf(s.name + "  score: " + String.format("%.0f",s.scores) + "\n");
		}
	}

}

package ocp;
import java.util.ArrayList;

public class Earth {
	public static void main(String[] args) {

		Human human = new Human();
		human.setName("人間");

		Student student = new Student();
		student.setName("学生");

		ArrayList<Human> list = new ArrayList<Human>();
		list.add(human);
		list.add(student);

		for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			h.speak();
		}
	}
}
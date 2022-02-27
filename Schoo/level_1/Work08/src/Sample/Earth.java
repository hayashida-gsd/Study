package Sample;
public class Earth {
	public static void main(String[] args) {

		Animal a = new Animal();
		a.walk();

		Human h = new Human();
		h.walk();
		h.speak();

		Student s = new Student();
		s.walk();
		s.speak();
		s.study();
	}
}
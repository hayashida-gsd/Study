package Work;
import java.util.HashMap;

public class School {
	public static void main(String[] args) {

		Human h1 = new Human("太郎", 20);
		Human h2 = new Human("次郎", 18);
		Human h3 = new Human("三郎", 15);

		HashMap<Integer, Human> map = new HashMap<>();
		map.put(1, h1);
		map.put(2, h2);
		map.put(3, h3);

		for(int i = 1; i <= map.size(); i++) {
			map.get(i).introduction();
		}
	}
}
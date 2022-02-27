package Work;
import java.util.ArrayList;

public class Home {
	public static void main(String[] args) {

		Human h1 = new Human("太郎", 20);
		Human h2 = new Human("次郎", 18);
		Human h3 = new Human("三郎", 15);

		ArrayList<Human> list = new ArrayList<>();
		list.add(h1);
		list.add(h2);
		list.add(h3);

		for(int i = 0; i < list.size(); i++) {
			list.get(i).introduction();
		}
	}
}
package Sample;
import java.util.ArrayList;

public class ListSample {
	public static void main(String[] args) {
		ArrayList<String> stringlist =
				new ArrayList<String>();
		stringlist.add("ABC");
		stringlist.add("DEF");
		stringlist.add("GHI");

		System.out.println("文字列のリスト");
		for(int i = 0; i < stringlist.size(); i++) {
			System.out.println(stringlist.get(i));
		}

		ArrayList<Integer> integerlist =
				new ArrayList<Integer>();
		integerlist.add(1);
		integerlist.add(2);
		integerlist.add(3);
		System.out.println("数値のリスト");
		for(int i = 0; i < integerlist.size(); i++) {
			System.out.println(integerlist.get(i));
		}
	}
}
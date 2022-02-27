package Sample;
import java.util.HashMap;

public class MapSample {
	public static void main(String[] args) {
		HashMap<String, String> stringMap =
				new HashMap<String, String>();
		stringMap.put("value1", "ABC");
		stringMap.put("value2", "DEF");
		stringMap.put("value3", "GHI");

		System.out.println("文字列のマップ");
		for(int i = 1; i <= stringMap.size(); i++) {
			System.out.println(stringMap.get("value" + i));
		}

		HashMap<String, Integer> integerMap =
				new HashMap<String, Integer>();
		integerMap.put("value1", 1);
		integerMap.put("value2", 2);
		integerMap.put("value3", 3);

		System.out.println("数値のマップ");
		for(int i = 1; i <= integerMap.size(); i++) {
			System.out.println(integerMap.get("value" + i));
		}
	}
}
public class Student4 {
	// メンバ変数（このクラスの情報として必要な情報）
	String name = "スクー太郎";	// 氏名
	int age = 20;				// 年齢

	// String型の引数を2つ必要とするメソッド
	void setName(String lastName, String firstName) {
		// 名字と名前を連結して変数に格納
		name = lastName + firstName;
	}
	// String型とint型の引数を必要とするメソッド
	void setNameAndAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// String型の引数を3つ必要とし、戻り値にString型の配列を返すメソッド
	String[] memorize(String one, String two, String three) {
		String[] memory = new String[3];
		memory[0] = one;
		memory[1] = two;
		memory[2] = three;
		return memory;
	}
	// String型の引数を4つ必要とし、戻り値にString型の配列を返すメソッド
	String[] memorize(String one, String two, String three, String four) {
		String[] memory = new String[4];
		memory[0] = one;
		memory[1] = two;
		memory[2] = three;
		memory[3] = four;
		return memory;
	}
	// int型の引数を必要とし、戻り値にString型を返すメソッド（static）
	static String createMessage(int number) {
		String message = "番号は" + number + "番です";
		return message;
	}
	// 自己紹介メソッド
	void introduction() {
		System.out.println("私の名前は" + name + "です");
		System.out.println("私の年齢は" + age + "歳です");
	}
	// 年齢計算メソッド
	void ageCalculation() {
		age = age + 1;
		System.out.println("私は" + age + "歳になりました");
	}
}
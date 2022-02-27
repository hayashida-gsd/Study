public class Earth {
	public static void main(String[] args) {

		Human h = new Human();
		h.setName("human");
		h.setAge(50);

		Student s = new Student();
		s.setName("student");
		s.setAge(20);

		// 親クラスのデータ型の変数に親クラスのオブジェクトを代入
		Human h1 = h;
		// 子クラスのデータ型の変数に親クラスのオブジェクトを代入
		Human h2 = s;

		System.out.println("親クラスのspeakメソッドを実行");
		h1.speak();
		System.out.println("子クラスのspeakメソッドを実行");
		h2.speak();
	}
}
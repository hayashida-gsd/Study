package lsp;

public class Earth {
	public static void main(String[] args) {

		// doSpeakメソッドを実行し、speak機能の実行を期待
		Human h = new Human();
		h.setName("人間");
		doSpeak(h);

		// 引数をHumanクラスの子クラスで実行しても同様の結果を期待
		Student s = new Student();
		s.setName("学生");
		doSpeak(s);
	}

	// このメソッドはHumanクラスのオブジェクトを引数に取る代わりに
	// 自己紹介機能を実行することを保証します
	public static void doSpeak(Human h) {
		h.speak();
	}
}
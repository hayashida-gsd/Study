public class School3 {
	public static void main(String[] args) {
		// インスタンス化
		Student2 s = new Student2("渋谷太郎", 22);
		// 自己紹介 (1回目）
		s.introduction();
		// アクセッサメソッドを使って設定
		s.setName("変更太郎");
		s.setAge(23);
		// 自己紹介 (2回目）
		s.introduction();
	}
}
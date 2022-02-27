public class School2 {
	public static void main(String[] args) {
		// インスタンス化
		Student2 s = new Student2();
		// 住所の設定
		s.setAddress("東京都渋谷区");
		// 住所の取得
		String address = s.getAddress();
		System.out.println("住所は" + address + "です");
	}
}
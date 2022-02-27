public class Student2 {
	// メンバ変数（このクラスの情報として必要な情報）
	String name = "スクー太郎";	// 氏名
	int age = 20;				// 年齢
	String address;				// 住所

	// 住所設定メソッド
	void setAddress(String address) {
		this.address = address;
	}
	// 住所取得メソッド
	String getAddress() {
		return address;
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
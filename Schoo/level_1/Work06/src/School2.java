public class School2 {
	public static void main(String[] args) {
		// インスタンス化（1人目）
		Student s1 = new Student();
		// 自己紹介
		s1.introduction();

		// インスタンス化（2人目）
		Student s2 = new Student();
		// 年齢計算
		s2.ageCalculation();
		// 自己紹介
		s2.introduction();

		// インスタンス化（3人目）
		Student s3 = new Student();
		// 年齢計算
		s3.ageCalculation();
		s3.ageCalculation();
		s3.ageCalculation();
		// 自己紹介
		s3.introduction();
	}
}
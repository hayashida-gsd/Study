public class School4 {
	public static void main(String[] args) {
		// インスタンス化
		Student3 s = new Student3("ワーク太郎",18,1,10);
		// 自己紹介
		s.introduction();
		// 年齢計算
		s.ageCalculation();
		s.setGrade(2);
		s.setRank(1);
		// 自己紹介
		s.introduction();
	}
}
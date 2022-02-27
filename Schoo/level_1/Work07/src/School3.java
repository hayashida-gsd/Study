public class School3 {
	public static void main(String[] args) {
		// インスタンス化
		Student3 s = new Student3();
		s.setName("渋谷", "たろう");
		s.introduction();

		s.setNameAndAge("渋谷じろう", 18);
		s.introduction();

		String[] memory = s.memorize("ABC", "abc", "123");
		for(int i = 0; i < memory.length; i++) {
			System.out.println("覚えた単語は" + memory[i] + "です");
		}

		String message = s.createMessage(100);
		System.out.println(message);
	}
}
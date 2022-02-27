public class School4 {
	public static void main(String[] args) {
		// インスタンス化
		Student4 s = new Student4();
		String[] memory = s.memorize("ABC", "abc", "123");
		for(int i = 0; i < memory.length; i++) {
			System.out.println("覚えた単語は" + memory[i] + "です");
		}

		memory = s.memorize("あ", "い", "う", "え");
		for(int i = 0; i < memory.length; i++) {
			System.out.println("覚えた単語は" + memory[i] + "です");
		}

		//String message = s.createMessage(100);
		String message = Student4.createMessage(100);
		System.out.println(message);
	}
}
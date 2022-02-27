public class Sample3_5 {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println("strの値は" + str);
		System.out.println("strの値は" + str.length());
		System.out.println("strの値は" + str.toUpperCase());
		// 応用
		System.out.println("strの値は" + str.toLowerCase());
		System.out.println("strの値は" + str.indexOf("e"));
		System.out.println("strの値は" + str.substring(1, 4));
	}
}

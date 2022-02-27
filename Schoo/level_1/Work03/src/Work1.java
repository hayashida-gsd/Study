public class Work1 {
	public static void main(String[] args) {
		String[] str;
		str = new String[3];
		str[0] = "こんにちは";
		str[1] = "私の名前は";
		str[2] = "schooです";

		String a1 = str[0];
		String a2 = str[1];
		String a3 = str[2];
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		int[] i;
		i = new int[3];
		i[0] = 1000;
		i[1] = 1500;
		i[2] = 5000;
		int b1 = i[0];
		long b2 = i[1];
		byte b3 = (byte)i[2];
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}

public class Sample3_6 {
	public static void main(String[] args) {
		int[] x;
		x = new int[3];
		x[0] = 10;
		x[1] = 100;
		x[2] = 150;

		String[] s;
		s = new String[2];
		s[0] = "ABC";
		s[1] = "あいう";

		System.out.println("x[0]の値は" + x[0]);
		System.out.println("x[1]の値は" + x[1]);
		System.out.println("x[2]の値は" + x[2]);
		System.out.println("s[0]の値は" + s[0]);
		System.out.println("s[1]の値は" + s[1]);

		// 応用
		int[] x2 = x;
		System.out.println("x2[0]の値は" + x2[0]);
		System.out.println("x2[1]の値は" + x2[1]);
		System.out.println("x2[2]の値は" + x2[2]);

		x2[0] = 1111;
		System.out.println("x2[0]変更後のx[0]の値は" + x[0]);

		System.out.println("s[3]の値は" + s[3]);
	}
}

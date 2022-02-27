package Work;
public class RunCalc {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int i = 0;
		try {
			i = c.division(9);
			System.out.println("余りは" + i + "です");
		} catch (OddNumberException e) {
			e.printStackTrace();
			System.out.println("例外が発生しました");
		}
	}
}
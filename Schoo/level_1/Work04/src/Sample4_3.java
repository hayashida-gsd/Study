public class Sample4_3 {
	public static void main(String[] args) {

		String str = "ABC";
		switch(str) {
		case "ABC":
			System.out.println("値はABCです");
			break;
		case "DEF":
			System.out.println("値はDEFです");
			break;
		default:
			System.out.println("それ以外です");
		}
	}
}

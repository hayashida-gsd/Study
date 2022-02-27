public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("12345", "pass", "ABC");

		account.changePassword("pass", "abc12345");

		account.printInfomation("abc12345");
	}
}
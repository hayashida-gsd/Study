public class BankAccount {

	private String bankNumber;
	private String password;
	private String bankCode;

	public BankAccount(
		String bankNumber, String password, String bankCode) {
		this.bankNumber = bankNumber;
		this.password = password;
		this.bankCode = bankCode;
	}

	public void changePassword(
			String oldPassword, String newPassword) {
		if (password.equals(oldPassword)) {
			password = newPassword;
			System.out.println("パスワードを変更しました");
		}
	}

	public void printInfomation(String password) {
		if (this.password.equals(password)) {
			System.out.println("支店コード：" + bankCode);
			System.out.println("口座番号：" + bankNumber);
		}
	}
}
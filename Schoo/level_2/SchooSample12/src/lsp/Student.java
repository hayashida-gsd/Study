package lsp;
public class Student extends Human {
	void speak() {
		System.out.println("私の名前は" + super.getName() + "です");
	}
}
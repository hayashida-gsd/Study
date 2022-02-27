package isp;
public class Student implements Human {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void speak() {
		System.out.println("私の名前は" + name + "です");
	}

	public void fly() {
		System.out.println("空を飛びます");
	}
}
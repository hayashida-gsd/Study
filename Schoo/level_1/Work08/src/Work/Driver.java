package Work;
public class Driver {
	public static void main(String[] args) {
		SportCar car = new SportCar();

		int speed = car.getSpeed();
		System.out.println("現在の速度は" + speed + "kmです");

		car.accele(50);
		speed = car.getSpeed();
		System.out.println("現在の速度は" + speed + "kmです");

		car.speedUp(20);
		speed = car.getSpeed();
		System.out.println("現在の速度は" + speed + "kmです");

		car.play();

		car.brake();
		speed = car.getSpeed();
		System.out.println("現在の速度は" + speed + "kmです");
	}
}
package Work;
public class Car {
	int speed;

	void accele(int speed) {
		this.speed = speed;
		System.out.println("時速" + speed + "kmで走行します");
	}

	void brake() {
		this.speed = 0;
		System.out.println("停止します");
	}

	int getSpeed() {
		return speed;
	}
}
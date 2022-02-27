package Work;
public class SportCar extends Car implements Audio {

	void speedUp(int speed) {
		super.speed = super.speed + speed;
		System.out.println(speed + "km加速しました");
	}

	@Override
	public void play() {
		System.out.println("音楽を再生します");
	}
}
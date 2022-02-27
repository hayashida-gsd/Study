public class Drive {
	public static void main(String[] args) {

		Truck truck = new Truck();
		SportCar sportCar = new SportCar();

		Driver driver = new Driver();
		driver.drive(truck);
		driver.drive(sportCar);
	}
}
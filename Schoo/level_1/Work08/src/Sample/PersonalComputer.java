package Sample;
public class PersonalComputer implements UniversalSerialBus {
	@Override
	public void energizing() {
		System.out.println("充電します");
		System.out.println("データを転送します");
	}
}
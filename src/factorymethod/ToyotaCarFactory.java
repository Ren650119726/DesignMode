package factorymethod;


public class ToyotaCarFactory extends CarFactory {

	@Override
	public Car car() {
		return new ToyotaCar();
	}
	
}

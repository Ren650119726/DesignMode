package factorymethod;


public class BenzCarFactory extends CarFactory {

	@Override
	public Car car() {
		return new BenzCar();
	}
	
}

package factorymethod;


public class FordCarFactory extends CarFactory {

	@Override
	public Car car() {
		return new FordCar();
	}
	
}

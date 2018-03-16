package abstractfactory;

public class FordCarFactory implements CarFactory{

	@Override
	public Car getCar() {
		
		return new FordCar();
	}
}

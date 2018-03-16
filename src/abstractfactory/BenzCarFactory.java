package abstractfactory;

public class BenzCarFactory implements CarFactory{

	@Override
	public Car getCar() {
		
		return new BenzCar();
	}
}

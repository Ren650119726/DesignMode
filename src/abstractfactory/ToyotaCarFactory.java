package abstractfactory;

public class ToyotaCarFactory implements CarFactory{

	@Override
	public Car getCar() {
		
		return new ToyotaCar();
	}
}

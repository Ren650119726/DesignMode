package abstractfactory;

public class SSSS {
	
	private CarFactory factory;
	
	public SSSS(CarFactory factory){
		this.factory=factory;
	}
	
	public Car sell(){
		return factory.getCar();
	}
}

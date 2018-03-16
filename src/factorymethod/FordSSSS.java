package factorymethod;

public class FordSSSS implements SSSS{
	
	private CarFactory factory;
	
	public FordSSSS(){
		factory=new FordCarFactory();
	}
	
	public Car sell(){
		return factory.getCar();
	}
}

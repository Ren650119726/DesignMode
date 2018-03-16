package simplefactory;

public class Family {
	
	private Car car;
	
	public Family(Car car){
		this.car=car;
	}
	
	public void drive(){
		car.run();
	}
}

package abstractfactory;

public class Family {
	
	private Car car;
	
	public void buy(SSSS ssss){
		car= ssss.sell();
	}
	
	public void drive(){
		if(car!=null){
			car.run();
		}
	}
}

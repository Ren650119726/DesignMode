package simplefactory;

/**
 * 静态工厂
 * @author xiao
 *
 */
public class CarFactory {
	private Car car;
	
	public Car getCar(String type){
		if("ford".equals(type)){
			car=new FordCar();
		}else if("toyota".equals(type)){
			car=new ToyotaCar();
		}
		return car;
	}
}

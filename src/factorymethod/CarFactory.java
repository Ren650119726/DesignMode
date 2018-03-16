package factorymethod;

public abstract class CarFactory {
	
	public Car getCar(){
		return car();
	}
	//父类不知道具体实例化哪一个，交给子类来实例对象并返回
	public abstract Car car();
}

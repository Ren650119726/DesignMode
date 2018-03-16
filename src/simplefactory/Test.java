package simplefactory;

public class Test {
	public static void main(String[] args) {
//		Car car=new FordCar();
//		Family family=new Family(car);
//		family.drive();
		
//		CarFactory factory=new CarFactory();
//		Car car=factory.getCar("toyota");
//		Family family=new Family(car);
//		family.drive();
		
		/*
		 * 静态工厂用单例模式加载properties文件获取类名利用反射创建实例并返回。 
		 */
		CarFactory_Reflect factory=new CarFactory_Reflect();
		Car car=factory.getCar("ford");
		Family family=new Family(car);
		family.drive();
	}
}

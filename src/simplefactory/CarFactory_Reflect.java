package simplefactory;

/**
 * 静态工厂    利用加载配置文件和反射
 * @author xiao
 *
 */
public class CarFactory_Reflect {
	private Car car;
	private CarProperties properties;
	
	public CarFactory_Reflect(){
		properties=CarProperties.newInstance();
	}
	
	public Car getCar(String type){
		String path=properties.getProperty(type);
		try {
			Class clazz=Class.forName(path);
			car=(Car) clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return car;
	}
}

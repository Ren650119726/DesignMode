package simplefactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 使用单例设计模式加载properties文件
 * @author xiao
 *
 */
public class CarProperties {
	private  Properties properties;
	
	private static CarProperties carProperties=new CarProperties();
	
	private CarProperties(){
		readConfig();
	}
	
	public static CarProperties newInstance(){
		
		return carProperties;
	}
	private void readConfig(){
		properties=new Properties();
		InputStream in=null;
		try {
			in=new FileInputStream(this.getClass().getClassLoader().getResource("simplefactory").getPath()+"/Car.properties");
			properties.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getProperty(String key){
		return properties.getProperty(key);
	}
}

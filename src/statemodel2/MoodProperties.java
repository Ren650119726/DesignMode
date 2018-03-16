package statemodel2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 使用单例设计模式加载properties文件
 * @author xiao
 *
 */
public class MoodProperties {
	private  Properties properties;
	
	private static MoodProperties carProperties=new MoodProperties();
	
	private MoodProperties(){
		readConfig();
	}
	
	public static MoodProperties newInstance(){
		
		return carProperties;
	}
	private void readConfig(){
		properties=new Properties();
		InputStream in=null;
		try {
			in=this.getClass().getResourceAsStream("mood.properties");
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

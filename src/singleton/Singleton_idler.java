package singleton;

/**
 * 单例设计模式 之 懒汉式  存在线程安全问题
 *  
 * @author xiao
 *
 */
public class Singleton_idler {
	private static Singleton_idler singleton_idler;
	
	private Singleton_idler(){}
	
	public static Singleton_idler newInstance(){
		if(singleton_idler==null){
			singleton_idler = new Singleton_idler();
		}
		return singleton_idler;
	}
}

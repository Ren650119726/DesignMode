package singleton;

/**
 * 单例模式  之内部类
 * @author xiao
 *
 */
public class Singleton_inner {
	private static class SingletonHolder{
		 //静态初始化器，由JVM来保证线程安全
		private static Singleton_inner singleton_inner=new Singleton_inner();
	}
	
	private Singleton_inner(){}
	
	public static Singleton_inner newInstance(){
		return SingletonHolder.singleton_inner;
	}
}

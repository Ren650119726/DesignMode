package singleton;

/**
 * 单例模式  之饿汉式
 * @author xiao
 *
 */
public class Singleton_eager {
	private static Singleton_eager singleton_eager=new Singleton_eager();
	
	private Singleton_eager(){}
	
	public static Singleton_eager newInstance(){
		return singleton_eager;
	}
}

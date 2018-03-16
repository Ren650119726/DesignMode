package singleton;

/**
 * 单例模式 之懒汉式 线程安全版   又称 双检查
 * @author xiao
 *
 */
public class Singleton_idler_safety {
	private static Singleton_idler_safety idler_safety=null;
	
	private Singleton_idler_safety(){}
	
	public static Singleton_idler_safety newInstance(){
		if(idler_safety==null){
			synchronized (Singleton_idler_safety.class) {
				if(idler_safety==null){
					idler_safety=new Singleton_idler_safety();
				}
			}
		}
		return idler_safety;
	}
}

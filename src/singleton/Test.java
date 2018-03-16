package singleton;

/**
 * 疑问  测试多次 懒汉式 并没有出现线程安全问题？
 * 
 * @author xiao
 *
 */
public class Test implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println(Singleton_idler.newInstance());
	}
	
	public static void main(String[] args) {
		Singleton_idler singleton_idler1=Singleton_idler.newInstance();
		Singleton_idler singleton_idler2=Singleton_idler.newInstance();
		System.out.println(singleton_idler1==singleton_idler2);
		
		//疑问  测试多次 懒汉式 并没有出现线程安全问题？
		
		Test test1=new Test();
		Test test2=new Test();
		
		Thread th1=new Thread(test1);
		Thread th2=new Thread(test2);
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread());
	}
	
	
}

package singleton;

public class Test24 implements Runnable {
	public void run() {
		System.out.println(TestSingleton.getInstance());
	}

	public static void main(String[] args) {
		Test24 test1 = new Test24();
		Test24 test2 = new Test24();
		Thread thread1 = new Thread(test1);
		Thread thread2 = new Thread(test2);

		thread1.start();
		thread2.start();
	}
	
}

class TestSingleton {
	private static TestSingleton testSingleton;

	private TestSingleton() {
	}

	public static TestSingleton getInstance() {
		if (testSingleton == null) {
			testSingleton = new TestSingleton();
		}
		return testSingleton;
	}
}
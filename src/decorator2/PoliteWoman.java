package decorator2;

public class PoliteWoman extends Womanpper{

	public PoliteWoman(Woman woman) {
		super(woman);
	}

	@Override
	public void say() {
		System.out.println("你好，我是一个女人");
	}
	
}

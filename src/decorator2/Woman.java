package decorator2;

public class Woman {
	private int level=60;
	private int iq=80;
	
	public int getLevel() {
		return level;
	}

	public int getIq() {
		return iq;
	}

	public void say(){
		System.out.println("我是一个女人");
	}
}

package decorator2;


public class Womanpper extends Woman{
	protected Woman woman;
	
	public Womanpper(Woman woman) {
		super();
		this.woman = woman;
	}

	@Override
	public int getLevel() {
		return woman.getLevel();
	}

	@Override
	public int getIq() {
		return woman.getIq();
	}

	@Override
	public void say() {
		woman.say();
	}
	
}

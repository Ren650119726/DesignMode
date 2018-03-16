package decorator2;

public class MakeWoman extends Womanpper{

	public MakeWoman(Woman woman) {
		super(woman);
	}

	@Override
	public int getLevel() {
		return super.getLevel()+20;
	}

}

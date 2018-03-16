package decorator;

public class MakeWoman extends Woman{

	@Override
	public int getLevel() {
		return super.getLevel()+20;
	}

}

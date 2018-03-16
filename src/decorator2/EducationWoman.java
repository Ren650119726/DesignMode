package decorator2;

public class EducationWoman extends Womanpper{
	
	public EducationWoman(Woman woman) {
		super(woman);
	}

	@Override
	public int getIq() {
		return super.getIq()+20;
	}
}

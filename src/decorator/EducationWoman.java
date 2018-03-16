package decorator;

public class EducationWoman extends Woman{

	@Override
	public int getIq() {
		return super.getIq()+20;
	}
}

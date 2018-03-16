package statemodel3;

public class OldState implements State {

	@Override
	public void perform() {
		System.out.println("老年了，日落西山");
	}

	@Override
	public State nextState() {
		return new TeenState();
	}

}

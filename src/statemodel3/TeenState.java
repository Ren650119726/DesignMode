package statemodel3;

public class TeenState implements State {

	@Override
	public void perform() {
		System.out.println("我是青年时候，精力旺盛");
	}

	@Override
	public State nextState() {
		return new MiddleState();
	}

}

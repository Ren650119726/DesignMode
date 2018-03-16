package statemodel3;

public class MiddleState implements State{

	@Override
	public void perform() {
		System.out.println("一到中年时候就力不从心啊");
	}

	@Override
	public State nextState() {
		
		return new OldState();
	}

}

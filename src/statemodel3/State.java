package statemodel3;

public interface State {
	public void perform();
	
	public State nextState();
}

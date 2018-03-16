package statemodel;

public class Person {
	private Mood mood;
	
	public Person(Mood mood) {
		super();
		this.mood = mood;
	}

	public void behave(){
		mood.mood();
	}
}

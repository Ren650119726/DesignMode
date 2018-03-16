package statemodel;

public class Test {
	public static void main(String[] args) {
		Mood happy=new HappyMood();
		Mood sad=new SadMood();
		Person person=new Person(sad);
		person.behave();
	}
}

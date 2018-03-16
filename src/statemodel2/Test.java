package statemodel2;

public class Test {
	public static void main(String[] args) {
		Person person=new Person();
		person.addMood("happy", new HappyMood());
		person.addMood("anger", new AngerMood());
		person.addMood("sad", new SadMood());
		person.perform();
	}
}

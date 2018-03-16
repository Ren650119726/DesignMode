package statemodel2;

import java.util.HashMap;
import java.util.Map;

public class Person {
	
	private Map<String, Mood> moods = new HashMap<String, Mood>(); 
	
	private Mood currmood;
	
	public Person() {
		moods.put("default", new HappyMood());
	}
	
	public void addMood(String name,Mood mood){
		moods.put(name, mood);
	}

	private String getMoodName(String name) {
		String mood=MoodProperties.newInstance().getProperty(name);
		return mood;
	}
	
	public void perform(){
		currmood=moods.get(getMoodName("mood"));
		if(currmood==null){
			currmood=moods.get("default");
		}
		
		//解决线程不安全
		Mood currmood_=currmood;
		currmood.setI(2);
		System.out.println(currmood_.getI());
		currmood_.mood();
	}
}

package decorator2;

public class Test {
	public static void main(String[] args) {
		
		Woman woman = new PoliteWoman(new MakeWoman(new EducationWoman(new Woman())));
		
		System.out.println("IQ:"+woman.getIq());
		System.out.println("颜值:"+woman.getLevel());
		woman.say();
	}
}

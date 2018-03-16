package decorator;

public class Test {
	public static void main(String[] args) {
		Woman woman = new MakeWoman();
		System.out.println("IQ:"+woman.getIq());
		System.out.println("颜值:"+woman.getLevel());
		woman.say();
	}
}

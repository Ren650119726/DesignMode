package factorymethod;

public class Test {
	public static void main(String[] args) {
		SSSS fordSSSS=new FordSSSS();
		Family family=new Family();
		family.buy(fordSSSS);
		family.drive();
	}
}	

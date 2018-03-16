package abstractfactory;

public class Test {
	public static void main(String[] args) {
		
		CarFactory factory=new BenzCarFactory();
		SSSS ssss=new SSSS(factory);
		Family family=new Family();
		family.buy(ssss);
		family.drive();
	}
}

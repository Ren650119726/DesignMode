package statemodel3;

import java.math.BigDecimal;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		person.setState(new TeenState());
		person.perform();
		person.perform();
		person.perform();
		
		
//		System.out.println(1.0/Double.valueOf("0.0"));
//		BigDecimal decimal2=new BigDecimal(1.0);
//		BigDecimal decimal1=new BigDecimal(0.0);
//		
//		System.out.println(decimal2.divide(decimal1));
	}
}

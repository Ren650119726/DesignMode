package staticProxy;

/**
 * 货币
 * @author zhao
 *
 */
public class Currency {
	public static enum CurrencyType{
		RMB,USD,YEN
	}
	
	private CurrencyType type;
	private double value;
	
	
	
	public Currency(CurrencyType type, double value) {
		super();
		this.type = type;
		this.value = value;
	}
	public CurrencyType getType() {
		return type;
	}
	public void setType(CurrencyType type) {
		this.type = type;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	
}

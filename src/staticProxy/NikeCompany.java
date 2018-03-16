package staticProxy;

import staticProxy.Currency.CurrencyType;

/**
 * Nike 总公司
 * @author zhao
 *
 */
public class NikeCompany implements NikeProvider{
	
	private final double standarUsPrice = 100.0;
	
	@Override
	public Shoes provideShoes(NikeCustomer customer) {
		return new Shoes("kobe 9", new Currency(CurrencyType.USD,standarUsPrice*customer.getDiscount()));
	}
	
}

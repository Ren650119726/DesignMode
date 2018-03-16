package staticProxy;

import staticProxy.Currency.CurrencyType;

/**
 * 中国区总代理
 * @author zhao
 *
 */
public class ChinaNikeProxy implements NikeCustomer, NikeProvider {
	private NikeCompany nikeCompany;
	private double discount;
	
	public ChinaNikeProxy(NikeCompany nikeCompany, double discount) {
		super();
		this.nikeCompany = nikeCompany;
		this.discount = discount;
	}
	
	public NikeCompany getNikeCompany() {
		return nikeCompany;
	}

	public void setNikeCompany(NikeCompany nikeCompany) {
		this.nikeCompany = nikeCompany;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public Shoes provideShoes(NikeCustomer customer) {
		Shoes shoes = nikeCompany.provideShoes(this);
		shoes.setName("黑曼巴");
		Currency currency = shoes.getPrice();
		double usPrice = currency.getValue();
		double remPrice = getRmbPrice(usPrice)*customer.getDiscount();
		currency.setType(CurrencyType.RMB);
		currency.setValue(remPrice);
		return shoes;
	}
	
	private double getRmbPrice(double usPrice){
		return Rate.getRMBRate()*usPrice;
	}

	@Override
	public double getDiscount() {
		return discount;
	}

}

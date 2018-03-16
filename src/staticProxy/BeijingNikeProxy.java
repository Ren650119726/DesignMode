package staticProxy;


/**
 * Nike 北京代理
 * @author zhao
 *
 */
public class BeijingNikeProxy implements NikeCustomer, NikeProvider {
	private ChinaNikeProxy chinaNikeProxy;
	
	public BeijingNikeProxy(ChinaNikeProxy chinaNikeProxy) {
		super();
		this.chinaNikeProxy = chinaNikeProxy;
	}
	

	public ChinaNikeProxy getChinaNikeProxy() {
		return chinaNikeProxy;
	}


	public void setChinaNikeProxy(ChinaNikeProxy chinaNikeProxy) {
		this.chinaNikeProxy = chinaNikeProxy;
	}


	@Override
	public Shoes provideShoes(NikeCustomer customer) {
		if(!(customer instanceof NikeRetailCustomer)){//不是终端客户
			throw new RuntimeException();
		}
		NikeRetailCustomer customer2 = (NikeRetailCustomer) customer;
		Shoes shoes = chinaNikeProxy.provideShoes(this);
		Currency price = shoes.getPrice();
		price.setValue(price.getValue()*customer2.getDiscount()+100);
		return shoes;
	}


	@Override
	public double getDiscount() {
		return 0.98;
	}
}

package staticProxy;

/**
 * Nike零售客户
 * @author zhao
 *
 */
public class NikeRetailCustomer implements NikeCustomer{
	public static enum Location{
		BEIJING,SICHUAN,JAPAN;
	}
	private Location location;
	private double discount;
	
	
	public NikeRetailCustomer(Location location, double discount) {
		super();
		this.location = location;
		this.discount = discount;
	}

	@Override
	public double getDiscount() {
		return discount;
	}

	public Location getLocation() {
		return location;
	}

}

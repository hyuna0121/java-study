package sec05.exercise;

public class ShopService {
	private static ShopService shopService = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		return shopService;
	}
}

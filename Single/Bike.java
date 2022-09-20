package Single;

public class Bike {
	String brand;
	int price;
	int tax;
	public int netPrice(int price, int tax) {
		return price+tax;
	}
}

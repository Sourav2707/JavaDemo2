package Single;

public class UseBike {
	public static void main(String[] args) {
	MountBike mb = new MountBike();
	mb.brand = "BMW";
	mb.price = 100000;
	mb.tax = 25000;
	mb.weight = 105.5f;
	mb.speed = 120;
	System.out.println(mb.netPrice(mb.price, mb.tax));
	}
}

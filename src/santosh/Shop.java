package santosh;
public class Shop {

	static int maggie;
	static int dosa;
	static int pouches;
	static int panipuri;
	static int masala;

	void setInitialQuantity(int setmaggie, int setdosa, int setpouches, int setpanipuri, int setmasala) {
		Shop.maggie = setmaggie;
		Shop.dosa = setdosa;
		Shop.pouches = setpouches;
		Shop.panipuri = setpanipuri;
		Shop.masala = setmasala;
	}

	void purchaseMaggie(int quantity) {
		if (quantity > maggie) {
			System.out.println("The required quantity of Maggie item is not available");
		} else {
			Shop.maggie -= quantity;
		}
	}

	void purchaseDosa(int quantity) {
		if (quantity > dosa) {
			System.out.println("The required quantity of Dosa item is not available");

		} else {
			Shop.dosa -= quantity;
		}

	}

	void purchasePouches(int quantity) {
		if (quantity > pouches) {
			System.out.println("The required quantity of Pouches item is not available");

		} else {
			Shop.pouches -= quantity;
		}

	}

	void purchasePanipuri(int quantity) {
		if (quantity > panipuri) {
			System.out.println("The required quantity of Panipuri item is not available");

		} else {
			Shop.panipuri -= quantity;
		}

	}

	void purchaseMasala(int quantity) {
		if (quantity > masala) {
			System.out.println("The required quantity of Masala item is not available");

		} else {
			Shop.masala -= quantity;
		}

	}

	void displayOutofStockItems() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Below Items are not Available in stock's");
		if (Shop.maggie <= 0)
			System.out.println("Maggie");
		if (Shop.dosa <= 0)
			System.out.println("Dosa");
		if (Shop.pouches <= 0)
			System.out.println("{Pouches");
		if (Shop.panipuri <= 0)
			System.out.println("Panipuri");
		if (Shop.masala <= 0)
			System.out.println("Masala");

	}

	void displayInStockItems() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Below Items Available in Stock's ");
		if(Shop.maggie>0)
			System.out.println("The Available Quantity of Maggie is "+Shop.maggie);
		if(Shop.dosa>0)
			System.out.println("The Available Quantity of Dosa is "+Shop.dosa);
		if(Shop.pouches>0)
			System.out.println("The Available Quantity of Pouches is "+Shop.pouches);
		if(Shop.panipuri>0)
			System.out.println("The Available Quantity of Panipuri is "+Shop.panipuri);
		if(Shop.masala>0)
			System.out.println("The Available Quantity of Masala is "+Shop.masala);
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public static void main(String[] args) {
		Shop shop1 = new Shop();
		shop1.setInitialQuantity(50, 43, 39, 43, 73);
		shop1.purchaseMaggie(45);
		shop1.purchaseDosa(43);
		shop1.purchasePouches(33);
		shop1.purchasePanipuri(43);
		shop1.purchaseMasala(65);
		shop1.displayOutofStockItems();
		shop1.displayInStockItems();
	}

}

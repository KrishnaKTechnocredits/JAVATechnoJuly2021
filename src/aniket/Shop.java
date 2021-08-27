package aniket;

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
		System.out.println("Below Items are running out of stock");
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
		System.out.println("Below Items are in Stock ");
		if(Shop.maggie>0)
			System.out.println("The available quantity of maggie is "+Shop.maggie);
		if(Shop.dosa>0)
			System.out.println("The available quantity of dosa is "+Shop.dosa);
		if(Shop.pouches>0)
			System.out.println("The available quantity of pouches is "+Shop.pouches);
		if(Shop.panipuri>0)
			System.out.println("The available quantity of panipuri is "+Shop.panipuri);
		if(Shop.masala>0)
			System.out.println("The available quantity of masala is "+Shop.masala);
	}

	public static void main(String[] args) {
		Shop assignment_9_1 = new Shop();
		assignment_9_1.setInitialQuantity(50, 43, 39, 43, 73);
		assignment_9_1.purchaseMaggie(48);
		assignment_9_1.purchaseDosa(43);
		assignment_9_1.purchasePouches(31);
		assignment_9_1.purchasePanipuri(43);
		assignment_9_1.purchaseMasala(71);
		assignment_9_1.displayOutofStockItems();
		assignment_9_1.displayInStockItems();
	}

}

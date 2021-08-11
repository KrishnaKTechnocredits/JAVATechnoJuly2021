package neha;

public class ShoppingAssignment9_Alternate {
	// variables are static so that shopping can be done by multiple customers to
	// replicate real life scenario
	static int qtyMaggie = 50;;
	static int qtyDosa = 43;
	static int qtyOilPouch = 39;
	static int qtyPanipuriPacket = 43;
	static int qtyMasalaPacket = 73;

	// method to show those items which are "Out of stock".
	void itemsOutOfStock() {
		System.out.println("\r\nChecking if any item is out of stock.... ");
		if (qtyMaggie == 0 && qtyOilPouch == 0 && qtyDosa == 0 && qtyPanipuriPacket == 0 && qtyMasalaPacket == 0) {
			System.out.println("All Items are out of stock");
		} else if (qtyMaggie == 0 || qtyDosa == 0 || qtyOilPouch == 0 || qtyPanipuriPacket == 0
				|| qtyMasalaPacket == 0) {
			if (qtyMaggie == 0) {
				System.out.println("Maggie is out of stock");
			}
			if (qtyDosa == 0) {
				System.out.println("Dosa is out of stock");
			}
			if (qtyOilPouch == 0) {
				System.out.println("Oil is out of stock");
			}
			if (qtyPanipuriPacket == 0) {
				System.out.println("Panipuri is out of stock");
			}
			if (qtyMasalaPacket == 0) {
				System.out.println("Masala is out of stock");
			}
		} else {
			System.out.println("All items are available, please check individual item availability");
		}
	}

	// method shows items "Available in stock" & respective quantities
	void itemsInStock() {
		System.out.println("\r\nChecking availabity of items..... ");
		if (qtyMaggie == 0 && qtyOilPouch == 0 && qtyDosa == 0 && qtyPanipuriPacket == 0 && qtyMasalaPacket == 0) {
			System.out.println("All Items are out of stock");
		} else {
			if (qtyMaggie > 0) {
				System.out.println("Available Quantity for Maggie: " + qtyMaggie);
			}
			if (qtyDosa > 0) {
				System.out.println("Available Quantity for Dosa: " + qtyDosa);
			}
			if (qtyOilPouch > 0) {
				System.out.println("Available Quantity for Oil: " + qtyOilPouch);
			}
			if (qtyPanipuriPacket > 0) {
				System.out.println("Available Quantity for Panipuri: " + qtyPanipuriPacket);
			}
			if (qtyMasalaPacket > 0) {
				System.out.println("Available Quantity for Masala: " + qtyMasalaPacket);
			}
		}
	}

	void shopMaggie(int userQty) {
		System.out.println("\r\nPurchasing Maggie with quantity:" + userQty + " .....");
		if (userQty <= qtyMaggie) {
			qtyMaggie = qtyMaggie - userQty;
			System.out.println("Maggie is successfully purchased for quantity: " + userQty);
		} else {
			if (qtyMaggie == 0) {
				System.out.println("Maggie is out of stock");
			} else {
				System.out.println("Item is running out of stock");
				System.out.println("Insufficient quantity available");
				System.out.println("Available quantity for Maggie: " + qtyMaggie);
			}

		}
	}

	void shopDosa(int userQty) {
		System.out.println("\r\nPurchasing Dosa with quantity:" + userQty + " .....");
		if (userQty <= qtyDosa) {
			qtyDosa = qtyDosa - userQty;
			System.out.println("Dosa is successfully purchased for quantity:" + userQty);
		} else {
			if (qtyDosa == 0) {
				System.out.println("Dosa is out of stock");
			} else {
				System.out.println("Item is running out of stock");
				System.out.println("Insufficient quantity available");
				System.out.println("Available quantity for Dosa: " + qtyDosa);
			}

		}
	}

	void shopOilPouch(int userQty) {
		System.out.println("\r\nPurchasing Oil with quantity:" + userQty + " .....");
		if (userQty <= qtyOilPouch) {
			qtyOilPouch = qtyOilPouch - userQty;
			System.out.println("Oil is successfully purchased for quantity:" + userQty);
		} else {
			if (qtyOilPouch == 0) {
				System.out.println("Oil is out of stock");
			} else {
				System.out.println("Item is running out of stock");
				System.out.println("Insufficient quantity available");
				System.out.println("Available quantity for Oil: " + qtyOilPouch);
			}

		}
	}

	void shopPanipuri(int userQty) {
		System.out.println("\r\nPurchasing Panipuri with quantity:" + userQty + " .....");
		if (userQty <= qtyPanipuriPacket) {
			qtyPanipuriPacket = qtyPanipuriPacket - userQty;
			System.out.println("Panipuri is successfully purchased for quantity:" + userQty);
		} else {
			if (qtyPanipuriPacket == 0) {
				System.out.println("Panipuri is out of stock");
			} else {
				System.out.println("Item is running out of stock");
				System.out.println("Insufficient quantity available");
				System.out.println("Available quantity for Panipuri: " + qtyPanipuriPacket);
			}

		}
	}

	void shopMasala(int userQty) {
		System.out.println("\r\nPurchasing Masala with quantity:" + userQty + " .....");
		if (userQty <= qtyMasalaPacket) {
			qtyMasalaPacket = qtyMasalaPacket - userQty;
			System.out.println("Masala is successfully purchased for quantity:" + userQty);
		} else {
			if (qtyMasalaPacket == 0) {
				System.out.println("Masala is out of stock");
			} else {
				System.out.println("Item is running out of stock");
				System.out.println("Insufficient quantity available");
				System.out.println("Available quantity for Masala: " + qtyMasalaPacket);
			}

		}
	}

	public static void main(String[] args) {
		// customer 1
		int shopMaggie;
		int shopDosa;
		int shopMasala;
		int shopOil;
		int shopPanipuri;
		ShoppingAssignment9_Alternate shoppingAssignment9_1 = new ShoppingAssignment9_Alternate();
		// check if item is out of stock
		shoppingAssignment9_1.itemsOutOfStock();
		// check available items
		shoppingAssignment9_1.itemsInStock();
		// shop for maggie
		shopMaggie = 50;
		shoppingAssignment9_1.shopMaggie(shopMaggie);
		// shop for dosa
		shopDosa = 40;
		shoppingAssignment9_1.shopDosa(shopDosa);
		// shop for Masala
		shopMasala = 10;
		shoppingAssignment9_1.shopMasala(shopMasala);
		// shop for oil
		shopOil = 8;
		shoppingAssignment9_1.shopOilPouch(shopOil);
		// shop for Panipuri
		shopPanipuri = 10;
		shoppingAssignment9_1.shopPanipuri(shopPanipuri);
		// check if item is out of stock
		shoppingAssignment9_1.itemsOutOfStock();
		// check available items
		shoppingAssignment9_1.itemsInStock();
		// shop for maggie
		shopMaggie = 5;
		shoppingAssignment9_1.shopMaggie(shopMaggie);
		// shop for dosa
		shopDosa = 4;
		shoppingAssignment9_1.shopDosa(shopDosa);

	}

}

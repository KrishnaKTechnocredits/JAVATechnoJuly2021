package kalpesh;

public class Shop {

	static int maggie;
	static int dosa;
	static int pouches;
	static int panipuri;
	static int masala;

	void setQuantity(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ) {

		maggie = maggieQ;
		dosa = dosaQ;
		pouches = pouchesQ;
		panipuri = panipuriQ;
		masala = masalaQ;
	}

	void getOrderDetails(int maggieOrder, int dosaOrder, int pouchesOrder, int panipuriOrder, int masalaOrder) {

		if (maggie > 0) {
			if (maggieOrder <= maggie) {
				maggie = maggie - maggieOrder;
			} else {
				System.out.println("Don't have sufficient quanity of maggie. The quantity you have requested is "
						+ maggieOrder + " And the Available Quantity is " + maggie);
				maggieOrder = 0;
			}
		} else {
			System.out.println("Maggie is out of stock.");
			maggieOrder = 0;
		}

		if (dosa > 0) {
			if (dosaOrder <= dosa) {
				dosa = dosa - dosaOrder;

			} else {
				System.out.println("Dont have sufficient quantity of Dosa.The quantity you have requested is "
						+ dosaOrder + " And the Available Quantity is " + dosa);
				dosaOrder = 0;
			}
		} else {
			System.out.println(" Dosa is out of stock");
			dosaOrder = 0;
		}

		if (pouches > 0) {
			if (pouchesOrder <= pouches) {
				pouches = pouches - pouchesOrder;

			} else {
				System.out.println("Dont have sufficient quantity of pouches.The quantity you have requested is "
						+ pouchesOrder + " And the Available Quantity is " + pouches);
				pouchesOrder = 0;
			}
		} else {
			System.out.println("Pouches is out of stock");
			pouchesOrder = 0;

		}

		if (panipuri > 0) {
			if (panipuriOrder <= panipuri) {
				panipuri = panipuri - panipuriOrder;

			} else {
				System.out.println("Dont have sufficient quantity of panipuri.The quantity you have requested is "
						+ panipuriOrder + " And the Available Quantity is " + panipuri);
				panipuriOrder = 0;
			}
		} else {
			System.out.println("Panipuri is out of stock");
			panipuriOrder = 0;
		}

		if (masala > 0) {
			if (masalaOrder <= masala) {
				masala = masala - masalaOrder;

			} else {
				System.out.println("Dont have sufficient quantity of masala.The quantity you have requested is "
						+ masalaOrder + " And the Available Quantity is " + masalaOrder);

				masalaOrder = 0;
			}
		} else {
			System.out.println("Masalas is out of stock");
			masalaOrder = 0;
		}
		System.out.println(" Hi, we have served you total : " + maggieOrder + " maggie," + dosaOrder + " dosa,"
				+ pouchesOrder + "pouches ," + panipuriOrder + " panipuri, " + masalaOrder + " Masala ");
	}

	void availableStock() {
		if (maggie > 0) {
			System.out.println("Available stock of maggie is " + maggie);
		}
		if (dosa > 0) {
			System.out.println("Available stock of Dosa is " + dosa);
		}
		if (pouches > 0) {
			System.out.println("Available stock of pouches is " + pouches);
		}
		if (panipuri > 0) {
			System.out.println("Available stock of panipuri is " + panipuri);
		}
		if (masala > 0) {
			System.out.println("Available stock of masalas is " + masala);
		}
	}

	void outOfStock() {
		if (maggie <= 0) {
			System.out.println("Maggie is out of stock ");
		}
		if (dosa <= 0) {
			System.out.println("Dosa is out of stock ");
		}
		if (pouches <= 0) {
			System.out.println("Pouches is out of stock ");
		}
		if (panipuri <= 0) {
			System.out.println("Panipuri is out of stock ");
		}

		if (masala <= 0) {
			System.out.println("Masalas is out of stock ");
		}
	}

	public static void main(String[] args) {
		Shop shop_1 = new Shop();
		shop_1.setQuantity(50, 43, 39, 43, 73);
		shop_1.getOrderDetails(50, 20, 50, 40, 30);
		System.out.println("------Product which are in stock --------- ");
		shop_1.availableStock();
		System.out.println("------Product which are in not in stock --------- ");
		shop_1.outOfStock();

	}

}

/*
 * Create a system (Shop) which maintains each item's quantity.
 * 
 * a. Initial stocks of Maggie: 50 Maggie packets b. Initial stocks of Dosa : 43
 * packets c. Initial stocks of pouches : 39 oil packets d. Initial stocks of
 * panipuri : 43 packets e. Initial stocks of masala’s : 73 packets.
 * 
 * Expectation: 1) Only one Customer came for shopping, he picked different
 * items with different quantities, print "running out of stock" message if a
 * particular item is sold out otherwise deduct requested quantity from total
 * quantity. 2) Create a method which shows only those item which is
 * "Out of stock". 3) Create a method which shows only those item which is
 * "Available in stock" & respective quantities.
 */
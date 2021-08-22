package trupti;

public class Assignment_9 {
	static int maggie;
	static int dosa;
	static int oilPouches;
	static int paniPuri;
	static int masala;

	void setInitialQuantity(int setMagi, int setDosa, int setPouches, int setGolgappe, int setSpices) {
		maggie = setMagi;
		dosa = setDosa;
		oilPouches = setPouches;
		paniPuri = setGolgappe;
		masala = setSpices;
	}

	void purchaseMaggie(int quantity) {
		if (quantity > maggie)
			System.out.println("Maggie is not available in the required quantity");
		else
			maggie = maggie - quantity;
	}

	void purchaseDosa(int quantity) {
		if (quantity > dosa)
			System.out.println("dosa is not available in the required quantity");
		else
			dosa = dosa - quantity;
	}

	void purchaseOilPouches(int quantity) {
		if (quantity > oilPouches)
			System.out.println("Oilpouches is not available in the required quantity");
		else
			oilPouches = oilPouches - quantity;
	}

	void purchasePaniPuri(int quantity) {
		if (quantity > paniPuri)
			System.out.println("Panipuri is not available in the required quantity");
		else
			paniPuri = paniPuri - quantity;
	}

	void purchaseMasala(int quantity) {
		if (quantity > masala)
			System.out.println("Masala is not available in the required quantity");
		else
			masala = masala - quantity;
	}

	void displayOutOfStockItemsList() {
		if (maggie == 0 || dosa == 0 || oilPouches == 0 || paniPuri == 0 || masala == 0) {
			System.out.println("These Items are Out of Stock");
			if (maggie <= 0)
				System.out.println("Maggie");
			if (paniPuri <= 0)
				System.out.println("Pani Puri");
			if (oilPouches <= 0)
				System.out.println("Oil Pouches");
			if (dosa <= 0)
				System.out.println("Dosa");
			if (masala <= 0)
				System.out.println("Masala");
		}
	}

	void displayInStockItemsList() {
		if (maggie != 0 || dosa != 0 || oilPouches != 0 || paniPuri != 0 || masala != 0) {
			System.out.println("These Item are available in stock");
			if (maggie > 0)
				System.out.println("Maggie quantity is: " + maggie);
			if (paniPuri > 0)
				System.out.println("Pani Puri quantity is: " + paniPuri);
			if (oilPouches > 0)
				System.out.println("Oil Pouches quantity is: " + oilPouches);
			if (dosa > 0)
				System.out.println("Dosa quantity is: " + dosa);
			if (masala > 0)
				System.out.println("Masala quantity is: " + masala);
		}

	}

	public static void main(String[] args) {
		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.setInitialQuantity(50, 43, 39, 43, 73);
		assignment_9.purchaseMaggie(20);
		assignment_9.purchaseDosa(43);
		assignment_9.purchaseOilPouches(4);
		assignment_9.purchasePaniPuri(3);
		assignment_9.purchaseMasala(3);
		assignment_9.displayOutOfStockItemsList();
		assignment_9.displayInStockItemsList();
	}

}

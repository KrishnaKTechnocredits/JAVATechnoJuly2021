package amol_Vyas;

public class Assignment_9 {

	static int maggie;
	static int dosa;
	static int oilPouches;
	static int paniPuri;
	static int masala;

	void setInitialQty(int setMaggie, int setDosa, int setOilPouches, int setPaniPuri, int setMasala) {
		Assignment_9.maggie = setMaggie;
		Assignment_9.dosa = setDosa;
		Assignment_9.oilPouches = setOilPouches;
		Assignment_9.paniPuri = setPaniPuri;
		Assignment_9.masala = setMasala;
	}

	void purchaseMaggie(int qty) {
		if (qty > Assignment_9.maggie)
			System.out.println("Item is not available in the required quantity");
		else
			Assignment_9.maggie -= qty;
	}

	void purchaseDosa(int qty) {
		if (qty > Assignment_9.dosa)
			System.out.println("Item is not available in the required quantity");
		else
			Assignment_9.dosa -= qty;
	}

	void purchaseOilPouches(int qty) {
		if (qty > Assignment_9.oilPouches)
			System.out.println("Item is not available in the required quantity");
		else
			Assignment_9.oilPouches -= qty;
	}

	void purchasePaniPuri(int qty) {
		if (qty > Assignment_9.paniPuri)
			System.out.println("Item is not available in the required quantity");
		else
			Assignment_9.paniPuri -= qty;
	}

	void purchaseMasala(int qty) {
		if (qty > Assignment_9.masala)
			System.out.println("Item is not available in the required quantity");
		else
			Assignment_9.masala -= qty;
	}

	void displayOutOfStockItems() {
		System.out.println("Below Items are Out of Stock");
		if (Assignment_9.maggie <= 0)
			System.out.println("Maggie");
		if (Assignment_9.paniPuri <= 0)
			System.out.println("Pani Puri");
		if (Assignment_9.oilPouches <= 0)
			System.out.println("Oil Pouches");
		if (Assignment_9.dosa <= 0)
			System.out.println("Dosa");
		if (Assignment_9.masala <= 0)
			System.out.println("Masala");
	}

	void displayInStockItems() {
		System.out.println("Below Item are available");
		if (Assignment_9.maggie > 0)
			System.out.println("Maggie quantity is " + Assignment_9.maggie);
		if (Assignment_9.paniPuri > 0)
			System.out.println("Pani Puri quantity is " + Assignment_9.paniPuri);
		if (Assignment_9.oilPouches > 0)
			System.out.println("Oil Pouches quantity is " + Assignment_9.oilPouches);
		if (Assignment_9.dosa > 0)
			System.out.println("Dosa quantity is " + Assignment_9.dosa);
		if (Assignment_9.masala > 0)
			System.out.println("Masala quantity is " + Assignment_9.masala);

	}

	public static void main(String[] args) {
		Assignment_9 assignment_9_1 = new Assignment_9();
		assignment_9_1.setInitialQty(50, 43, 39, 43, 73);
		assignment_9_1.purchaseMaggie(48);
		assignment_9_1.purchaseDosa(43);
		assignment_9_1.purchaseOilPouches(31);
		assignment_9_1.purchasePaniPuri(43);
		assignment_9_1.purchaseMasala(71);
		assignment_9_1.displayOutOfStockItems();
		assignment_9_1.displayInStockItems();
	}

}

package suruchi;

public class Shop_Assignment9 {

	static int currentMaggieStock = 50;
	static int currentDosaStock = 43;
	static int currentOilPouchesStock = 39;
	static int currentPanipuriStock = 43;
	static int currentMasalaStock = 73;

	void purchaseMaggie(int maggiStocks) {
		currentMaggieStock = currentMaggieStock - maggiStocks;
	}

	void purchaseDosa(int dosaStocks) {
		currentDosaStock = currentDosaStock - dosaStocks;
	}

	void purchaseOilPouches(int oilPouchesStocks) {
		currentOilPouchesStock = currentOilPouchesStock - oilPouchesStocks;
	}

	void purchasePanipuri(int panipuriStocks) {
		currentPanipuriStock = currentPanipuriStock - panipuriStocks;
	}

	void purchaseMasala(int masalaStocks) {
		currentMasalaStock = currentMasalaStock - masalaStocks;
	}

	void displayOutOfStockItems() {
		System.out.println("Below items are out of stock: ");
		if (currentMaggieStock == 0)
			System.out.println("Maggie");
		if (currentDosaStock == 0)
			System.out.println("Dosa");
		if (currentOilPouchesStock == 0)
			System.out.println("Oil Pouches");
		if (currentPanipuriStock == 0)
			System.out.println("Panipuri");
		if (currentMasalaStock == 0)
			System.out.println("Masala");
	}

	void displayInStockItems() {
		System.out.println();
		System.out.println("Below items are in stock: ");
		if (currentMaggieStock > 3)
			System.out.println("Maggie - quantity - " + currentMaggieStock);
		else if (currentMaggieStock <= 3 && currentMaggieStock >= 1)
			System.out.println("Maggie (running out of stock) - " + currentMaggieStock + " left");
		if (currentDosaStock > 3)
			System.out.println("Dosa - quantity -  " + currentDosaStock);
		else if (currentDosaStock <= 3 && currentDosaStock >= 1)
			System.out.println("Dosa (running out of stock) - " + currentDosaStock + " left");
		if (currentOilPouchesStock > 3)
			System.out.println("Oil Pouches - quantity - " + currentOilPouchesStock);
		else if (currentOilPouchesStock <= 3 && currentOilPouchesStock >= 1)
			System.out.println("Oil Pouches (running out of stock) - " + currentOilPouchesStock + " left");
		if (currentPanipuriStock > 3)
			System.out.println("Panipuri - quantity - " + currentPanipuriStock);
		else if (currentPanipuriStock <= 3 && currentPanipuriStock >= 1)
			System.out.println("Panipuri (running out of stock) - " + currentPanipuriStock + " left");
		if (currentMasalaStock > 3)
			System.out.println("Masala - quantity - " + currentMasalaStock);
		else if (currentMasalaStock <= 3 && currentMasalaStock >= 1)
			System.out.println("Panipuri (running out of stock) - " + currentMasalaStock + " left");
	}

	public static void main(String[] a) {
		Shop_Assignment9 shop_assignment9 = new Shop_Assignment9();
		shop_assignment9.purchaseMaggie(47);
		shop_assignment9.purchaseDosa(43);
		shop_assignment9.purchaseOilPouches(39);
		shop_assignment9.purchasePanipuri(41);
		shop_assignment9.purchaseMasala(53);

		shop_assignment9.displayOutOfStockItems();
		shop_assignment9.displayInStockItems();
	}
}

package shalaka.Assignment_9;

public class Shop {
	int maggieQnt = 50;
	int dosaQnt = 43;
	int pouchesQnt = 39;
	int panipuriQnt = 43;
	int masalaQnt = 73;

	void checkQuantity(String product, int qnt) {
		if (product.equals("Maggi")) {
			if (qnt > maggieQnt) {
				System.out.println(product + " :Running out of stock");
			} else {
				maggieQnt = maggieQnt - qnt;
				System.out.println(product + " is avaibale and remaining quntity will be  " + maggieQnt);
			}
		} else if (product.equals("Dosa")) {
			if (qnt > dosaQnt) {
				System.out.println(product + " :Running out of stock");
			} else {
				dosaQnt = dosaQnt - qnt;
				System.out.println(product + " is avaibale and remaining quntity will be  " + dosaQnt);
			}
		} else if (product.equals("Panipuri")) {
			if (qnt > panipuriQnt) {
				System.out.println(product + " :Running out of stock");
			} else {
				panipuriQnt = panipuriQnt - qnt;
				System.out.println(product + " is avaibale and remaining quntity will be  " + panipuriQnt);
			}

		} else if (product.equals("Masala")) {
			if (qnt > masalaQnt) {
				System.out.println(product + " :Running out of stock");
			} else {
				masalaQnt = masalaQnt - qnt;
				System.out.println(product + " is avaibale and remaining quntity will be  " + masalaQnt);
			}
		} else if (product.equals("Pouches")) {
			if (qnt > pouchesQnt) {
				System.out.println(product + " :Running out of stock");
			} else {
				pouchesQnt = pouchesQnt - qnt;
				System.out.println(product + " is avaibale and remaining quntity will be  " + pouchesQnt);
			}
		}
	}

	void outOfStock() {
		System.out.println("Below items out of stock:");
		if (maggieQnt == 0)
			System.out.println("Maggi");
		if (dosaQnt == 0)
			System.out.println("Dosa");
		if (pouchesQnt == 0)
			System.out.println("Pouches");
		if (panipuriQnt == 0)
			System.out.println("Panipuri");
		if (masalaQnt == 0)
			System.out.println("Panipuri");
		System.out.println(" ");

	}

	void AvailableStock() {
		System.out.println("Below items are in stock:");
		if (maggieQnt > 0)
			System.out.println("Maggi: " + maggieQnt);
		if (dosaQnt > 0)
			System.out.println("Dosa: " + dosaQnt);
		if (pouchesQnt > 0)
			System.out.println("Puches: " + dosaQnt);
		if (panipuriQnt > 0)
			System.out.println("Panipuri: " + panipuriQnt);
		if (masalaQnt > 0)
			System.out.println("Masala: " + masalaQnt);

		System.out.println(" ");
	}

	public static void main(String[] args) {
		Shop shop = new Shop();

		shop.checkQuantity("Maggi", 60);
		shop.checkQuantity("Dosa", 10);
		shop.checkQuantity("Pouches", 39);
		shop.outOfStock();
		shop.AvailableStock();
	}
}

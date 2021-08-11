/*
Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.

*/
package umakant;

public class Shop {

	static int maggieCount;
	static int dosaCount;
	static int oilCount;
	static int panipuriCount;
	static int masalaCount;

	static void setInitialQuantity(int maggie, int dosa, int oil, int panipuri, int masala) {
		maggieCount = maggie;
		dosaCount = dosa;
		oilCount = oil;
		panipuriCount = panipuri;
		masalaCount = masala;
	}

	static void outOfStockItems() {
		if (maggieCount == 0 || dosaCount == 0 || oilCount == 0 || panipuriCount == 0 || masalaCount == 0) {
			System.out.println("Below items are Out Of stock:");
			if (maggieCount == 0)
				System.out.println("Maggie");
			if (dosaCount == 0)
				System.out.println("Dosa");
			if (oilCount == 0)
				System.out.println("Oil");
			if (panipuriCount == 0)
				System.out.println("Panipuri");
			if (masalaCount == 0)
				System.out.println("Masala");
		} else
			System.out.println("All the items are in stock.");
	}

	static void availableItems() {
		if (maggieCount > 0 || dosaCount > 0 || oilCount > 0 || panipuriCount > 0 || masalaCount > 0) {
			System.out.println("Below items are available:");
			if (maggieCount > 0)
				System.out.println("Maggie -" + maggieCount + " Packets");
			if (dosaCount > 0)
				System.out.println("Dosa -" + dosaCount + " Packets");
			if (oilCount > 0)
				System.out.println("Oil -" + oilCount + " Pouches");
			if (panipuriCount > 0)
				System.out.println("Panipuri -" + panipuriCount + " Packets");
			if (masalaCount > 0)
				System.out.println("Masala -" + masalaCount + " Packets");
		} else
			System.out.println("No items are available.");
	}

	static void purchase(int maggie, int dosa, int oil, int panipuri, int masala) {
		if (maggie >= 0 && dosa >= 0 && oil >= 0 && panipuri >= 0 && masala >= 0) {
			if (maggieCount >= maggie)
				maggieCount -= maggie;
			else
				System.out.println("Maggie is running out of stock.");
			if (dosaCount >= dosa)
				dosaCount -= dosa;
			else
				System.out.println("Dosa is running out of stock.");
			if (oilCount >= oil)
				oilCount -= oil;
			else
				System.out.println("Oil is running out of stock.");
			if (panipuriCount >= panipuri)
				panipuriCount -= panipuri;
			else
				System.out.println("Panipuri is running out of stock.");
			if (masalaCount >= masala)
				masalaCount -= masala;
			else
				System.out.println("Masala is running out of stock.");
		} else
			System.out.println("Quantity of item must be greater than 0");
	}

	public static void main(String[] args) {
		Shop.setInitialQuantity(50, 43, 39, 43, 73);
		Shop.availableItems();
		Shop.outOfStockItems();
		Shop.purchase(5, 1, -1, 3, 3);
		Shop.purchase(45, 43, 39, 40, 70);
		Shop.availableItems();
		Shop.outOfStockItems();
		Shop.purchase(5, 1, 1, 3, 3);
		Shop.availableItems();
		Shop.outOfStockItems();
	}
}
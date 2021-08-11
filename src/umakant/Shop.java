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

	static int maggieCount = 50;
	static int dosaCount = 43;
	static int oilCount = 39;
	static int panipuriCount = 43;
	static int masalaCount = 73;

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
				System.out.println("Maggie -"+maggieCount +" Packets");
			if (dosaCount > 0)
				System.out.println("Dosa -"+dosaCount+" Packets");
			if (oilCount > 0)
				System.out.println("Oil -"+oilCount+" Pouches");
			if (panipuriCount > 0)
				System.out.println("Panipuri -"+panipuriCount+" Packets");
			if (masalaCount > 0)
				System.out.println("Masala -"+masalaCount+" Packets");
		} else
			System.out.println("No items are available.");
	}

	static void purchase(String item, int quantity) {
		if (item.equals("Maggie")) {
			if (maggieCount >= quantity)
				maggieCount -= quantity;
			else
				System.out.println(item + " is out of stock.");
		} else if (item.equals("Dosa")) {
			if (dosaCount >= quantity)
				dosaCount -= quantity;
			else
				System.out.println(item + " is out of stock.");
		} else if (item.equals("Oil")) {
			if (oilCount >= quantity)
				oilCount -= quantity;
			else
				System.out.println(item + " is out of stock.");
		} else if (item.equals("Panipuri")) {
			if (panipuriCount >= quantity)
				panipuriCount -= quantity;
			else
				System.out.println(item + " is out of stock.");
		} else if (item.equals("Masala")) {
			if (masalaCount >= quantity)
				masalaCount -= quantity;
			else
				System.out.println(item + " is out of stock.");
		} else
			System.out.println("We don't store " + item + ". Please choose item from the available stock.");
	}

	public static void main(String[] args) {
		Shop.availableItems();
		Shop.outOfStockItems();
		Shop.purchase("Maggie", 45);
		Shop.purchase("Cake", 45);
		Shop.purchase("Dosa", 43);
		Shop.purchase("Oil", 39);
		Shop.purchase("Panipuri", 39);
		Shop.purchase("Masala", 70);
		Shop.availableItems();
		Shop.outOfStockItems();
		Shop.purchase("Maggie", 5);
		Shop.purchase("Dosa", 1);
		Shop.purchase("Oil", 1);
		Shop.purchase("Panipuri", 4);
		Shop.purchase("Masala", 3);
		Shop.purchase("Biscuit", 45);
		Shop.availableItems();
		Shop.outOfStockItems();
	}
}
//Assignment 9;

package parthav;

public class Shop {
	static int maggieQuantity;
	static int dosaQuantity;
	static int oilPouchesQuantity;
	static int panipuriQuantity;
	static int masalaQuantity;
	String customerName;
	int customerID;

	// This method performs the pick up transactions for the customers
	void itemPickUp(int maggieCount, int dosaCount, int oilCount, int panipuriCount, int masalaCount) {
		if (maggieCount > Shop.maggieQuantity) {
			System.out.print("Maggie packets running out of stock. ");
			System.out.println("Only " + Shop.maggieQuantity + " Maggie packets are available");
		} else
			Shop.maggieQuantity = Shop.maggieQuantity - maggieCount;

		if (dosaCount > Shop.dosaQuantity) {
			System.out.print("Dosa packets running out of stock. ");
			System.out.println("Only " + Shop.dosaQuantity + " Dosa packets are available");
		} else
			Shop.dosaQuantity = Shop.dosaQuantity - dosaCount;

		if (oilCount > Shop.oilPouchesQuantity) {
			System.out.print("Oil pouches running out of stock. ");
			System.out.println("Only " + Shop.oilPouchesQuantity + " Oil pouches are available");
		} else
			Shop.oilPouchesQuantity = Shop.oilPouchesQuantity - oilCount;

		if (panipuriCount > Shop.panipuriQuantity) {
			System.out.print("Panipuri packets running out of stock. ");
			System.out.println("Only " + Shop.panipuriQuantity + " Panipuri packets are available");
		} else
			Shop.panipuriQuantity = Shop.panipuriQuantity - panipuriCount;

		if (masalaCount > Shop.masalaQuantity) {
			System.out.print("Masala packets running out of stock. ");
			System.out.println("Only " + Shop.masalaQuantity + " Masala packets are available");
		} else
			Shop.masalaQuantity = Shop.masalaQuantity - masalaCount;

	}

	// This method sets initial stock quantity of all the goods
	static void setInitialQuantity(int maggieCount, int dosaCount, int oilCount, int panipuriCount, int masalaCount) {
		Shop.maggieQuantity = maggieCount;
		Shop.dosaQuantity = dosaCount;
		Shop.oilPouchesQuantity = oilCount;
		Shop.panipuriQuantity = panipuriCount;
		Shop.masalaQuantity = masalaCount;
	}

	// This method displays Out of stock status for items if they are out of stock
	static void showOutofStockStatus() {
		if (Shop.maggieQuantity == 0)
			System.out.println("The Maggie packets are out of stock");
		if (Shop.dosaQuantity == 0)
			System.out.println("The Dosa packets are out of stock");
		if (Shop.oilPouchesQuantity == 0)
			System.out.println("The Oil pouches are out of stock");
		if (Shop.panipuriQuantity == 0)
			System.out.println("The Panipuri packets are out of stock");
		if (Shop.masalaQuantity == 0)
			System.out.println("The Masala packets are out of stock");

	}

	// This method shows the current quantity of the items
	static void showCurrentStockStatus() {
		System.out.println("There are currently " + Shop.maggieQuantity + " Maggie packets in stock");
		System.out.println("There are currently " + Shop.dosaQuantity + " Dosa packets in stock");
		System.out.println("There are currently " + Shop.oilPouchesQuantity + " Oil pouches in stock");
		System.out.println("There are currently " + Shop.panipuriQuantity + " Panipuri packets in stock");
		System.out.println("There are currently " + Shop.masalaQuantity + " Masala packets in stock");
	}

	void setCustomerDetails(String custName, int custID) {
		customerName = custName;
		customerID = custID;
	}

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setCustomerDetails("Parthav Dani", 120);
		Shop.setInitialQuantity(50, 43, 39, 43, 73);
		shop.itemPickUp(55, 35, 20, 45, 30);
		shop.itemPickUp(50, 8, 0, 25, 0);
		Shop.showOutofStockStatus();
		Shop.showCurrentStockStatus();

	}

}

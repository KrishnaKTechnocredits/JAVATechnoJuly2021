package varun;

public class Assignment_9 {
	int maggieStock = 50;
	int dosaStock = 43;
	int pouchesStock = 39;
	int panipuriStocks = 43;
	int masalaStock = 73;

	void stockOfItemsAvlbl(String itemName, int itemQuantity) {
		if (itemName.equalsIgnoreCase("Maggie")) {
			if (maggieStock < itemQuantity)
				outOfStock(itemName);
			else if (maggieStock >= itemQuantity) {
				System.out.println(itemName + " is availabe with " + maggieStock + " quantity");
				maggieStock = maggieStock - itemQuantity;
				System.out.println("User picked " + itemQuantity + " quantity of " + itemName);
				if (maggieStock != 0) {
					System.out.println(itemName + " is available in stock with " + maggieStock + " quantity remaining");
					System.out.println("*****************************************");
				} else
					outOfStock(itemName);
			}
		} else if (itemName.equalsIgnoreCase("Dosa")) {
			if (dosaStock < itemQuantity)
				outOfStock(itemName);
			else if (dosaStock >= itemQuantity) {
				System.out.println(itemName + " is availabe with " + dosaStock + " quantity");
				dosaStock = dosaStock - itemQuantity;
				System.out.println("User picked " + itemQuantity + " quantity of " + itemName);
				if (dosaStock != 0) {
					System.out.println(itemName + " is available in stock with " + dosaStock + " quantity remaining");
					System.out.println("*****************************************");
				} else
					outOfStock(itemName);
			}
		} else if (itemName.equalsIgnoreCase("Pouches")) {
			if (pouchesStock < itemQuantity)
				outOfStock(itemName);
			else if (pouchesStock >= itemQuantity) {
				System.out.println(itemName + " is availabe with " + pouchesStock + " quantity");
				pouchesStock = pouchesStock - itemQuantity;
				System.out.println("User picked " + itemQuantity + " quantity of " + itemName);
				if (pouchesStock != 0) {
					System.out
							.println(itemName + " is available in stock with " + pouchesStock + " quantity remaining");
					System.out.println("*****************************************");
				} else
					outOfStock(itemName);
			}
		} else if (itemName.equalsIgnoreCase("panipuri")) {
			if (panipuriStocks < itemQuantity)
				outOfStock(itemName);
			else if (panipuriStocks >= itemQuantity) {
				System.out.println(itemName + " is availabe with " + panipuriStocks + " quantity");
				panipuriStocks = panipuriStocks - itemQuantity;
				System.out.println("User picked " + itemQuantity + " quantity of " + itemName);
				if (panipuriStocks != 0) {
					System.out.println(
							itemName + " is available in stock with " + panipuriStocks + " quantity remaining");
					System.out.println("*****************************************");

				} else
					outOfStock(itemName);
			}
		} else {
			if (masalaStock < itemQuantity)
				outOfStock(itemName);
			else if (masalaStock >= itemQuantity) {
				System.out.println(itemName + " is availabe with " + masalaStock + " quantity");
				masalaStock = masalaStock - itemQuantity;
				System.out.println("User picked " + itemQuantity + " quantity of " + itemName);
				if (masalaStock != 0) {
					System.out.println(itemName + " is available in stock with " + masalaStock + " quantity remaining");
					System.out.println("*****************************************");
				} else
					outOfStock(itemName);
			}
		}
	}

	void outOfStock(String itemName) {
		System.out.println(itemName + " is out of stock ");
	}

	public static void main(String[] args) {
		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.stockOfItemsAvlbl("Maggie", 40);
		assignment_9.stockOfItemsAvlbl("Panipuri", 11);
		assignment_9.stockOfItemsAvlbl("Pouches", 11);
		assignment_9.stockOfItemsAvlbl("Dosa", 11);
		assignment_9.stockOfItemsAvlbl("Masala", 65);
		assignment_9.stockOfItemsAvlbl("Maggie", 15);
		assignment_9.stockOfItemsAvlbl("Pouches", 70);

	}
}

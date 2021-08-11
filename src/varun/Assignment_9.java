package varun;

public class Assignment_9 {
	int maggieStock = 50;
	int dosaStock = 43;
	int pouchesStock = 39;
	int panipuriStocks = 43;
	int masalaStock = 73;

	void stockOfItemsAvlbl(String itemName, int itemQuantity) {
		if(itemName.equalsIgnoreCase("Maggie")) {
			maggieStock = maggieStock-itemQuantity;
			if(maggieStock<0) {
				outOfStock(itemName);
			}
			else if(maggieStock<=10)
			System.out.println(itemName+ " is running out of stock with only " +maggieStock+ " quantity remaining");
			else
				System.out.println(itemName+ " is available in stock with " +maggieStock+ " quantity");
		}
		else if(itemName.equalsIgnoreCase("Dosa")) {
			dosaStock = dosaStock-itemQuantity;
			if(dosaStock<0) {
				outOfStock(itemName);
			}
			else if(dosaStock<=10)
			System.out.println(itemName+ " is running out of stock");
			else
				System.out.println(itemName+ " is available in stock with " +dosaStock+ " quantity");
		}
		else if(itemName.equalsIgnoreCase("Pouches")) {
			pouchesStock = pouchesStock-itemQuantity;
			if(pouchesStock<0) {
				outOfStock(itemName);
			}
			else if(pouchesStock<=10)
			System.out.println(itemName+ " is running out of stock");
			else
				System.out.println(itemName+ " is available in stock with " +pouchesStock+ " quantity");
		}
		else if(itemName.equalsIgnoreCase("Panipuri")) {
			panipuriStocks = panipuriStocks-itemQuantity;
			if(panipuriStocks<0) {
				outOfStock(itemName);
			}
			else if(panipuriStocks<=10)
			System.out.println(itemName+ " is running out of stock");
			else
				System.out.println(itemName+ " is available in stock with " +panipuriStocks+ " quantity");
		}
		else {
			masalaStock = masalaStock-itemQuantity;
			if(masalaStock<0) {
			outOfStock(itemName);
		}
			else if(masalaStock<=10)
				System.out.println(itemName+ " is running out of stock");
			else
				System.out.println(itemName+ " is available in stock with " +panipuriStocks+ " quantity");
		}
	}
	
	void outOfStock(String itemName) {
		System.out.println(itemName+ " is out of stock " );
	}
	
	public static void main(String[] args) {
		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.stockOfItemsAvlbl("Maggie", 40);
		assignment_9.stockOfItemsAvlbl("Dosa", 11);
		assignment_9.stockOfItemsAvlbl("Pouches", 11);
		assignment_9.stockOfItemsAvlbl("Panipuri", 11);
		assignment_9.stockOfItemsAvlbl("Masala", 88);
	}
}

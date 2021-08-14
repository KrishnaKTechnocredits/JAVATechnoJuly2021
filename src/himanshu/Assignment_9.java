package himanshu;

public class Assignment_9 {

	int maggieQuantity= 50;
	int dosaQuantity= 43;
	int paniPuriQuantity=43;
	int pouchesQuantity=39;
	int masalasQuantity=73;
		
	void stocks(String itemName, int itemQuantity) {
		if(itemName.equalsIgnoreCase("Maggie")) {
			maggieQuantity = maggieQuantity-itemQuantity;
			if(maggieQuantity<0) {
				outOfStock(itemName);
			}
			else
				System.out.println(itemName+ " is available in stock with " +maggieQuantity+ " Packets");
		}
		else if(itemName.equalsIgnoreCase("Dosa")) {
			dosaQuantity = dosaQuantity-itemQuantity;
			if(dosaQuantity<0) {
				outOfStock(itemName);
			}
			else
				System.out.println(itemName+ " is available in stock with " +dosaQuantity+ " Packets");
		}
		else if(itemName.equalsIgnoreCase("Pouches")) {
			pouchesQuantity = pouchesQuantity-itemQuantity;
			if(pouchesQuantity<0) {
				outOfStock(itemName);
			}
			else
				System.out.println(itemName+ " is available in stock with " +pouchesQuantity+ " Packets");
		}
		else if(itemName.equalsIgnoreCase("Panipuri")) {
			paniPuriQuantity = paniPuriQuantity-itemQuantity;
			if(paniPuriQuantity<0) {
				outOfStock(itemName);
			}
			else
				System.out.println(itemName+ " is available in stock with " +paniPuriQuantity+ " Packets");
		}
		else {
			masalasQuantity = masalasQuantity-itemQuantity;
			if(masalasQuantity<0) {
			outOfStock(itemName);
		}
		else
			System.out.println(itemName+ " is available in stock with " +masalasQuantity+ " Packets");
		}
	}

	void outOfStock(String itemName) {
		System.out.println(itemName+ " is out of stock " );
	}

	public static void main(String[] args) {
		Assignment_9 ass9 = new Assignment_9();
		ass9.stocks("Maggie", 22);
		ass9.stocks("Dosa", 100);
		ass9.stocks("Pouches", 05);
		ass9.stocks("Panipuri", 11);
		ass9.stocks("Masala", 88);
	}
	
	}


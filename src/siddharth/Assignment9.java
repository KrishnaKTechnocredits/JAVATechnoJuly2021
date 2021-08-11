package siddharth;

public class Assignment9 {

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
				maggieCount = quantity;
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
		Assignment9.availableItems();
		Assignment9.outOfStockItems();
		Assignment9.purchase("Maggie", 45);
		Assignment9.purchase("Cake", 45);
		Assignment9.purchase("Dosa", 43);
		Assignment9.purchase("Oil", 39);
		Assignment9.purchase("Panipuri", 39);
		Assignment9.purchase("Masala", 70);
		Assignment9.availableItems();
		Assignment9.outOfStockItems();
		Assignment9.purchase("Maggie", 5);
		Assignment9.purchase("Dosa", 1);
		Assignment9.purchase("Oil", 1);
		Assignment9.purchase("Panipuri", 4);
		Assignment9.purchase("Masala", 3);
		Assignment9.purchase("Biscuit", 45);
		Assignment9.availableItems();
		Assignment9.outOfStockItems();
	}
} 

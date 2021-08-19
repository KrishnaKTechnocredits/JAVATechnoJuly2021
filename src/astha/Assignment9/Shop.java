package astha.Assignment9;

public class Shop {
	int initialMaggieStocks = 50;
	int initialDosaStocks = 43;
	int initialPouchesStocks = 0;
	int initialPanipuriStocks = 43;
	int initialMasalaStocks = 73;
	
	/*method to update the inventory value*/
	void updateInventory (int requestedMaggieQty, int requestedDosaQty, int requestedPouchesQty, int requestedPanipuriQty, int requestedMasalaQty) {
		/* to update maggie stock*/
		if (initialMaggieStocks >= requestedMaggieQty) {
			initialMaggieStocks = initialMaggieStocks - requestedMaggieQty;
		}else if (initialMaggieStocks == 0) {
			System.out.println("Maggie is currently out of stock");
		}else 
			System.out.println("Requested maggie quantity is not available");
		
		/*to update Dosa stock*/
		if (initialDosaStocks >= requestedDosaQty) {
			initialDosaStocks = initialDosaStocks - requestedDosaQty;
		}else if (initialDosaStocks == 0) {
			System.out.println("Dosa is currently out of stock");
		}else 
			System.out.println("Requested dosa quantity is not available");
		
		/*to update Pouches stock*/
		if (initialPouchesStocks >= requestedPouchesQty) {
			initialPouchesStocks = initialPouchesStocks - requestedPouchesQty;
		}else if (initialPouchesStocks == 0) {
			System.out.println("Pouches are currently out of stock");
		}else 
			System.out.println("Requested pouches quantity is not available");
		
		/*to update Panipuri stock*/
		if (initialPanipuriStocks >= requestedPanipuriQty) {
			initialPanipuriStocks = initialPanipuriStocks - requestedPanipuriQty;
		}else if (initialPanipuriStocks == 0) {
			System.out.println("Panipuri is currently out of stock");
		}else 
			System.out.println("Requested panipuri quantity is not available");
		/*to update Masala stock*/
		if (initialMasalaStocks >= requestedMasalaQty) {
			initialMasalaStocks = initialMasalaStocks - requestedMasalaQty;
		}else if (initialMasalaStocks == 0) {
			System.out.println("Masala is currently out of stock");
		}else 
			System.out.println("Requested masala quantity is not available");
	}
	
	/* Method to display out of stock items*/
	void displayOutOfStockItems () {
		System.out.println("Out of stock items are :");
		if (initialMaggieStocks == 0) {
			System.out.println("Maggie");
		}
		if (initialDosaStocks == 0) {
			System.out.println("Dosa");
		}
		if (initialPouchesStocks == 0) {
			System.out.println("Pouches");
		}
		if (initialPanipuriStocks == 0) {
			System.out.println("Panipuri");
		}
		if (initialMasalaStocks == 0) {
			System.out.println("Masala");
		}
	}
	
	/*Method to display available items*/
	void displayAvailableInStockItem () {
		System.out.println("Items available in stock are :");
		if (initialMaggieStocks > 0) {
			System.out.println("Maggie, Available Quantity: "+initialMaggieStocks);
		}
		if (initialDosaStocks > 0) {
			System.out.println("Dosa, Available Quantity: "+initialDosaStocks);
		}
		if (initialPouchesStocks > 0) {
			System.out.println("Pouches, Available Quantity: "+initialPouchesStocks);
		}
		if (initialPanipuriStocks > 0) {
			System.out.println("Panipuri, Available Quantity: "+initialPanipuriStocks);
		}
		if (initialMasalaStocks > 0) {
			System.out.println("Masala, Available Quantity: "+initialMasalaStocks);
		}
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.updateInventory(50,8,23,45,73);
		shop.displayOutOfStockItems();
		shop.displayAvailableInStockItem();
	}
}

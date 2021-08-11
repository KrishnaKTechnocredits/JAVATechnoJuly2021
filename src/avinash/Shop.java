package avinash;

public class Shop {
	
	private static final int stockOfPanipuri = 0;
	static int intialStockofMaggie;
	static int intialStockofDosa;
	static int initialStockofPouches;
	static int initialStockofPanipuri;
	static int initialStockofMasals;
	
	void setInitialStock(int maggieStock,int dosaStock,int pouchesStock,int paniPuriStocks,int masalaStock){
		intialStockofMaggie = maggieStock;
		intialStockofDosa = dosaStock;
		initialStockofPouches = pouchesStock;
		initialStockofPanipuri = paniPuriStocks;
		initialStockofMasals = masalaStock;		
	}
	
	void purchaseMaggie(int quantity) {
		if(quantity > intialStockofMaggie) {
			System.out.println("The required quantity of Maggie item is not available");
		}else {
			intialStockofMaggie -= quantity;
		}
		
	}
		
	void purchaseDosa(int quantity) {
		if(quantity > intialStockofDosa) {
			System.out.println("The required quantity of dosa item is not available");
		}else {
			intialStockofDosa -= quantity;
		}
		
	}
	
	void purchasePouches(int quantity) {
		if(quantity > initialStockofPouches) {
			System.out.println("The required quantity of pouches item is not available");
		}else {
			initialStockofPouches -= quantity;
		}
		
	}
	void purchasePanipuri(int quantity) {
		
		if(quantity > initialStockofPanipuri) {
			System.out.println("The required quantity of panipuri item is not available");
		}else {
			initialStockofPanipuri -= quantity;
		}	
	}
	
	void purchaseMasals(int quantity) {
		if(quantity > initialStockofMasals) {
			System.out.println("The required quantity of masals item is not available");
		}else {
			initialStockofMasals -= quantity;
		}
		
	}
	
	void displayOutOfStockItems() {
		if(intialStockofMaggie<=0)
			System.out.println("Maggie is out of stock");
		if(intialStockofDosa<=0)
			System.out.println("Dosa is out of stock");
		if(initialStockofPouches<=0)
			System.out.println("pouches is out of stock");
		if(initialStockofPanipuri<=0)
			System.out.println("Panipuri is out of stock");
		if(initialStockofMasals<=0)
			System.out.println("Masala is out of stock");

	}
	
	void displayInStockItems() {
		System.out.println("Below Items are in Stock ");
		if(intialStockofMaggie>0)
			System.out.println("The available quantity of maggie is "+intialStockofMaggie);
		if(intialStockofDosa>0)
			System.out.println("The available quantity of dosa is "+intialStockofDosa);
		if(initialStockofPouches>0)
			System.out.println("The available quantity of pouches is "+initialStockofPouches);
		if(initialStockofPanipuri>0)
			System.out.println("The available quantity of panipuri is "+initialStockofPanipuri);
		if(initialStockofMasals>0)
			System.out.println("The available quantity of masala is "+initialStockofMasals);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.setInitialStock(50, 43, 39, 43, 73);
		shop.purchaseMaggie(48);
		shop.purchaseDosa(43);
		shop.purchasePouches(25);
		shop.purchasePanipuri(43);
		shop.purchaseMasals(50);
		shop.displayInStockItems();
		shop.displayOutOfStockItems();

	}

}

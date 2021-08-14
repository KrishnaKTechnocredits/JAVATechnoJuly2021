package shantanu.assignment9;

public class ShopSystem {
	static int stockOfMaggie, stockOfDosa, stockOfOil, stockOfPanipuri, stockOfMasala;
	
	void setInitialStockOfCommodities(int maggieStock, int dosaStock, int oilStock, int panipuriStock, int masalaStock) {
		stockOfMaggie = maggieStock;
		stockOfDosa = dosaStock;
		stockOfOil = oilStock;
		stockOfPanipuri = panipuriStock;
		stockOfMasala = masalaStock;
	}
	
	void purchaseMaggie(int quantity) {
		if(stockOfMaggie == 0)
			System.out.println("Maggie is out of stock");
		else if(stockOfMaggie < quantity)
			System.out.println("Not enough quantity of maggie in stock");
		else
			stockOfMaggie = stockOfMaggie - quantity;
	}
	
	void purchaseDosa(int quantity) {
		if(stockOfDosa == 0)
			System.out.println("Dosa is out of stock");
		else if(stockOfDosa < quantity)
			System.out.println("Not enough quantity of dosa in stock");
		else
			stockOfDosa = stockOfDosa - quantity;
	}
	
	void purchaseOil(int quantity) {
		if(stockOfOil == 0)
			System.out.println("Oil is out of stock");
		else if(stockOfOil < quantity)
			System.out.println("Not enough quantity of oil in stock");
		else
			stockOfOil = stockOfOil - quantity;
	}
	
	void purchasePanipuri(int quantity) {
		if(stockOfPanipuri == 0)
			System.out.println("Panipuri is out of stock");
		else if(stockOfPanipuri < quantity)
			System.out.println("Not enough quantity of panipuri in stock");
		else
			stockOfPanipuri = stockOfPanipuri - quantity;
	}
	
	void purchaseMasala(int quantity) {
		if(stockOfMasala == 0)
			System.out.println("Masala is out of stock");
		else if(stockOfMasala < quantity)
			System.out.println("Not enough quantity of masala in stock");
		else
			stockOfMasala = stockOfMasala - quantity;
	}
	
	void displayOutOfStockItems() {
		if(stockOfMaggie == 0)
			System.out.println("Maggie is out of stock");
		if(stockOfDosa == 0)
			System.out.println("Dosa is out of stock");
		if(stockOfOil == 0)
			System.out.println("Oil is out of stock");
		if(stockOfPanipuri == 0)
			System.out.println("Panipuri is out of stock");
		if(stockOfMasala == 0)
			System.out.println("Masala is out of stock");
		
	}
	
	void displayQuantityOfEachItem() {
		if(stockOfMaggie == 0)
			System.out.println("Maggie is out of stock");
		else
			System.out.println("Total packets of Maggie in stock: "+ stockOfMaggie);
		if(stockOfDosa == 0)
			System.out.println("Dosa is out of stock");
		else
			System.out.println("Total packets of Dosa in stock: "+ stockOfDosa);
		if(stockOfOil == 0)
			System.out.println("Oil is out of stock");
		else
			System.out.println("Total packets of Oil in stock: "+ stockOfOil);
		if(stockOfPanipuri == 0)
			System.out.println("Panipuri is out of stock");
		else
			System.out.println("Total packets of Panipuri in stock: "+ stockOfPanipuri);
		if(stockOfMasala == 0)
			System.out.println("Masala is out of stock");
		else
			System.out.println("Total packets of Masala in stock: "+ stockOfMasala);
		
	}
	
	public static void main(String[] args) {
		ShopSystem shopSystem = new ShopSystem();
		shopSystem.setInitialStockOfCommodities(50, 43, 39, 43, 73);
		shopSystem.displayQuantityOfEachItem();
		System.out.println("--------------------------------------------------");
		shopSystem.purchaseMaggie(50);
		shopSystem.displayQuantityOfEachItem();
		System.out.println("--------------------------------------------------");
		shopSystem.displayOutOfStockItems();
		System.out.println("--------------------------------------------------");
		shopSystem.purchaseMaggie(5);
		System.out.println("--------------------------------------------------");
		shopSystem.purchaseDosa(10);
		shopSystem.purchaseOil(22);
		shopSystem.purchasePanipuri(25);
		shopSystem.purchaseMasala(30);
		shopSystem.displayQuantityOfEachItem();
		System.out.println("--------------------------------------------------");
		shopSystem.purchaseOil(18);
		System.out.println("--------------------------------------------------");
		shopSystem.displayQuantityOfEachItem();
		
		
	}
}

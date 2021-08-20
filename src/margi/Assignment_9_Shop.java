package margi;

class Assignment_9_Shop{
	
	static int maggieQty, dosaQty, pouchesQty, panipuriQty, masalaQty;
	
	void setInitialQty(int maggie, int dosa, int pouches, int panipuri, int masala){
		maggieQty = maggie;
		dosaQty = dosa;
		pouchesQty = pouches;
		panipuriQty = panipuri;
		masalaQty = masala;
	}
	
	void customerPurchase(int maggie, int dosa, int pouches, int panipuri, int masala){
		//maggie
		if(maggieQty >= maggie){
			maggieQty = maggieQty - maggie;
		}
		else{
			System.out.println("\nMaggie packets are running out of Stock!!");
		}
		//dosa
		if(dosaQty >= dosa){
			dosaQty = dosaQty - dosa;
		}
		else{
			System.out.println("\nDosa packets are running out of Stock!!");
		}
		//pouches
		if(pouchesQty >= pouches){
			pouchesQty = pouchesQty - pouches;
		}
		else{
			System.out.println("\nOil Pouches are running out of Stock!!");
		}
		//panipuri
		if(panipuriQty >= panipuri){
			panipuriQty = panipuriQty - panipuri;
		}
		else{
			System.out.println("\nPanipuri packets are running out of Stock!!");
		}
		//masala
		if(masalaQty > masala){
			masalaQty = masalaQty - masala;
		}
		else{
			System.out.println("\nMasala packets are running out of Stock!!");
		}
	}
	
	void getOutOfStockItems(){
		System.out.println("\nItems which are OUT OF STOCK are: ");
		if(maggieQty == 0)
			System.out.println("maggie");
		if(dosaQty == 0)
			System.out.println("dosa");
		if(pouchesQty == 0)
			System.out.println("oil pouches");
		if(panipuriQty == 0)
			System.out.println("panipuri");
		if(masalaQty == 0)
			System.out.println("masala");
	}
	
	void getAvailableInStockItems(){
		System.out.println("\nItems Avaiable in Stock are: ");
		if(maggieQty != 0)
			System.out.println("maggie: " + maggieQty + " packets");
		if(dosaQty != 0)
			System.out.println("dosa: " + dosaQty + " packets");
		if(pouchesQty != 0)
			System.out.println("oil pouches: " + pouchesQty + " pouches");
		if(panipuriQty != 0)
			System.out.println("panipuri: " + panipuriQty + " packets");
		if(masalaQty != 0)
			System.out.println("masala: " + masalaQty + " packets");
	}
	
	public static void main(String[] args){
		Assignment_9_Shop shop = new Assignment_9_Shop();
		shop.setInitialQty(50,43,39,43,73);
		shop.getAvailableInStockItems();
		shop.customerPurchase(45,43,25,45,60);
		shop.getOutOfStockItems();
		shop.getAvailableInStockItems();
	}
}
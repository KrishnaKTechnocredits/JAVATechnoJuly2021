package sagar_Anasane;

class Shop{
	int initial_Stock_of_Maggie = 50;
	int initial_Stock_of_Dosa = 43;
	int initial_Stock_of_Oil_Pouches = 39;
	int initial_Stock_of_Panipuri = 43;
	int initial_Stock_of_masala = 73;
	
	void availableInStock(int availableMaggie, int availableDosa, int availableOil,int availablePanipuri, int availableMasala){
		if (availableMaggie <= 50){
			initial_Stock_of_Maggie = initial_Stock_of_Maggie - availableMaggie;
			System.out.println("Available stock of maggie = " +initial_Stock_of_Maggie);
		}else
			Shop.outOfStock();	
		
		if (availableDosa <= 43){
			initial_Stock_of_Dosa = initial_Stock_of_Dosa - availableDosa;
			System.out.println("Available stock of Dosa = " +initial_Stock_of_Dosa);
		}else
			Shop.outOfStock();
		
		if (availableOil <= 39){
			initial_Stock_of_Oil_Pouches = initial_Stock_of_Oil_Pouches - availableOil;
			System.out.println("Available stock of Oil Pouches = " +initial_Stock_of_Oil_Pouches);
		}else
			Shop.outOfStock();
		
		if (availablePanipuri <= 43){
			initial_Stock_of_Panipuri = initial_Stock_of_Panipuri - availablePanipuri;
			System.out.println("Available stock of Panipuri = " +initial_Stock_of_Panipuri);
		}else
			Shop.outOfStock();
		
		if (availableMasala <= 73){
			initial_Stock_of_masala = initial_Stock_of_masala - availableMasala;
			System.out.println("Available stock of Masala = " +initial_Stock_of_masala);
		}else
			Shop.outOfStock();
	}
	
	static void outOfStock(){
		System.out.println("Item is Out of Stock");
	}
	
	public static void main(String[] args){
		
		Shop shop = new Shop();
		shop.availableInStock(40,48,28,30,90);
		System.out.println("\n"+"Quantity should be count as Packets");
		
	}
}
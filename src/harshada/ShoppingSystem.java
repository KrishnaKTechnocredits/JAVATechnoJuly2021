package harshada;

public class ShoppingSystem {
	
	static int maggieQuantity=50;
	static int dosaQuantity=43;
	static int pouchesQuantity=39;
	static int panipuriQuantity=43;
	static int masalaQuantity=73;
	
	static void availableStock() {
		System.out.println("**** Welcome to the 6to9 Glocery store: *****\n ");
		System.out.println("Order from the following list of Items: ");
		System.out.println("Available Items and their Quantity are: ");
		System.out.println("Maggie= "+ maggieQuantity);
		System.out.println("Dosa= "+ dosaQuantity);
		System.out.println("Pouches = "+pouchesQuantity );
		System.out.println("Pani Puri= "+ panipuriQuantity);
		System.out.println("Masala ="+ masalaQuantity);
	}
			
	
	void purchase(int mQ, int dQ, int pQ, int ppQ,int msQ, String username) {
		
		System.out.println("\nUsername= "+ username);
		System.out.println("Itmes and its quantity purchased by above customer are as follows: ");
		
		//Maggiee Purchase
		if(mQ<=maggieQuantity)
		{
			maggieQuantity=maggieQuantity-mQ;
			
			System.out.println("Maggie="+ mQ);
		}
		else
		{
			System.out.println("Maggiee is Running out of Stock");
		}
		//Dosa Purchase
		if(dQ<=dosaQuantity)
		{
			dosaQuantity=dosaQuantity-dQ;
			System.out.println("Dosa= "+ dQ);
		}
		else
		{
			System.out.println("Dosa is Running out of Stock");
		}
		//pouches Purchase
		if(pQ<=pouchesQuantity)
		{
			pouchesQuantity=pouchesQuantity-pQ;
			System.out.println("Pouches= "+ dQ);
		}
		else
		{
			System.out.println("Pouches are Running out of Stock");
		}
		//Pani-puri purchase
		if(ppQ<=panipuriQuantity)
		{
			panipuriQuantity=panipuriQuantity-ppQ;
			System.out.println("Pani-Puri= "+ ppQ);
		}
		else
		{
			System.out.println("Pani-puri is Running out of Stock");
		}
		//Masala purchase
		if(msQ<=masalaQuantity)
		{
			masalaQuantity=masalaQuantity-msQ;
			System.out.println("Masala's= "+ msQ);
		}
		else
		{
			System.out.println("Masala's is Running out of Stock");
		}
	}
	
	static void outOfStockItems() {
		
		System.out.println("\nOut of Stock Itmes are: ");
		if(maggieQuantity<=0) {
			System.out.println("Maggie");
		}
		if(dosaQuantity<=0) {
			System.out.println("Dosa");
		}
		if(pouchesQuantity<=0) {
			System.out.println("Pouches");
		}
		if(panipuriQuantity<=0) {
			System.out.println("Pani Puri");
		}
		if(masalaQuantity<=0) {
			System.out.println("Masala");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingSystem ss1= new ShoppingSystem();
		ShoppingSystem.availableStock();
		ss1.purchase(50, 12, 15, 20, 73, "Charlie");
		ShoppingSystem.outOfStockItems();
	}

}

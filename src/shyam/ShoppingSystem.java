package shyam;

public class ShoppingSystem {
	static int maggieQuantity = 50;
	static int dosaQuantity=43;
	static int pouchesQuantity=39;
	static int panipuriQuantity=43;
	static int masalaQuantity=73;
	
	static void availableStock() {
		System.out.println("Maggie ="+ maggieQuantity);
		System.out.println("Dosa =" + dosaQuantity);
		System.out.println("Pouches = "+pouchesQuantity );
		System.out.println("Pani Puri= "+ panipuriQuantity);
		System.out.println("Masala ="+ masalaQuantity);
	}
	
	void purchase(int mQ, int dQ, int pQ, int ppQ,int msQ, String username) {

		System.out.println("\nUsername= "+ username);
		System.out.println("Itmes and its quantity purchased by above customer are as follows: ");

		if(mQ<=maggieQuantity)
		{
			maggieQuantity=maggieQuantity-mQ;

			System.out.println("Maggie="+ mQ);
		}
		else
		{
			System.out.println("Maggie is Running out of Stock");
		}
		
		if(dQ<=dosaQuantity)
		{
			dosaQuantity=dosaQuantity-dQ;
			System.out.println("Dosa= "+ dQ);
		}
		else
		{
			System.out.println("Dosa is Running out of Stock");
		}
		
		if(pQ<=pouchesQuantity)
		{
			pouchesQuantity=pouchesQuantity-pQ;
			System.out.println("Pouches= "+ dQ);
		}
		else
		{
			System.out.println("Pouches are Running out of Stock");
		}
		
		if(ppQ<=panipuriQuantity)
		{
			panipuriQuantity=panipuriQuantity-ppQ;
			System.out.println("Pani-Puri= "+ ppQ);
		}
		else
		{
			System.out.println("Pani-puri is Running out of Stock");
		}
		
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
		
		ShoppingSystem ss= new ShoppingSystem();
		ShoppingSystem.availableStock();
		ss.purchase(50, 17, 25, 20, 75, "ABC");
		ShoppingSystem.outOfStockItems();
	}
}

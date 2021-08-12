package shreya;

public class ShopSystem {
	static int maggieStock;
	static int dosaStock;
	static int pouchesStock;
	static int panipuriStock;
	static int masalasStock;

	void setInitialvalue(int maggie, int dosa, int pouches, int panipuri, int masala) {
		maggieStock = maggie;
		dosaStock = dosa;
		pouchesStock = pouches;
		panipuriStock = panipuri;
		masalasStock = masala;
	}

	void purchase(int maggieQunt, int dosaQunt, int pouchesQunt, int panipuriQunt, int masalaQunt) {
		System.out.println("-----Item:Maggie-----");
		if(maggieStock >= maggieQunt) {
			maggieStock = maggieStock - maggieQunt;
			System.out.println("Running out of stock");
			
		}else {
			System.out.println("Minimum quantity is available");
		}
		
		System.out.println("-----Item:Dosa-----");
		if(dosaStock >= dosaQunt) {
			dosaStock = dosaStock - dosaQunt;
			System.out.println("Running out of stock");
		}else {
			System.out.println("Minimum quantity is available");
		}
		
		System.out.println("-----Item:Pouches-----");
		if(pouchesStock >= pouchesQunt) {
			pouchesStock = pouchesStock - pouchesQunt;
			System.out.println("Running out of stock");
		}else{
			System.out.println("Minimum quantity is available");
		}
		
		System.out.println("-----Item:Panipuri-----");
		if(panipuriStock >= panipuriQunt) {
			panipuriStock = panipuriStock - panipuriQunt;
			System.out.println("Running out of stock");
		}else {
			System.out.println("Minimum quantity is availlable");
		}
		
		System.out.println("-----Item:Masala-----");
		if(masalasStock >= masalaQunt) {
			masalasStock = masalasStock - masalaQunt;
			System.out.println("Running out of stock");
		}else {
			System.out.println("Minimum quantity is availlable");
		}
	}

	void availableStock() {
		System.out.println("-----Available in Stocks-----");
		if (maggieStock > 0) {
			System.out.println("Available Stock of maggie " + maggieStock);
		}
		if (dosaStock > 0) {
			System.out.println("Available Stock of dosa " + dosaStock);
		}
		if (pouchesStock > 0) {
			System.out.println("Available Stock of pouches " + pouchesStock);
		}
		if (panipuriStock > 0) {
			System.out.println("Available Stock of panipuri " + panipuriStock);
		}
		if (masalasStock > 0) {
			System.out.println("Available Stock of Masala " + masalasStock);
		}
	}

	void outOfStock() {
		System.out.println("-----out of stock-----");
		if(maggieStock == 0) 
			System.out.println("Maggie Out Of Stock");
		
		if(dosaStock == 0) 
			System.out.println("Dosa Out Of Stock");
		
		if(pouchesStock == 0) 
			System.out.println("Pouches Out Of Stock");
		
		if(panipuriStock == 0) 
			System.out.println("Panipuri Out Of Stock");
		
		if(masalasStock == 0) 
			System.out.println("Masala Out Of Stock");
		
	}

	public static void main(String[] args) {
		ShopSystem shopSystem = new ShopSystem();
		shopSystem.setInitialvalue(50, 43, 39, 43, 73);
		shopSystem.purchase(30,60,39,50,73);
		shopSystem.availableStock();
		shopSystem.outOfStock();

	}

}

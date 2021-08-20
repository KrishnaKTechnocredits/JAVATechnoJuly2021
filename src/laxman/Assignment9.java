package laxman;

public class Assignment9 {
	int maggie= 50;
	int dosa=43;
	int pouches=39;
	int panipuri=43;
	int masala=73;
	String customer;
	static int totalQuantity;
	
	
	 void outOfStock(){
		if(maggie <= 0) {
			System.out.println("Maggie is Out of stock");
		}
		if(dosa<=0) {
				System.out.println("Dosa is Out of Stock");
		}
		if(pouches<=0) {
				System.out.println("Pouches is Out of Stock");
		}
		if(panipuri<=0) {
			System.out.println("Panipuri is Out of Stock");
		}
		if(masala<=0) {
			System.out.println("masala is Out of Stock");
		}
	 }
	void stockAvaiable(){
		if (maggie>0) {
			System.out.println("Stock Available "+ maggie);
		}
		if (dosa>0) {
			System.out.println("Stock Available "+ dosa);
		}
		if (pouches>0) {
			System.out.println("Stock Available "+ pouches);
		}
		if (panipuri>0) {
			System.out.println("Stock Available "+ panipuri);
		}
		if (masala>0) {
			System.out.println("Stock Available "+ masala);
		}
	}
	
	void soldItems(int maggieQty,int dosaQty, int pouchesQty, int panipuriQty,int masalaQty) {
		if(maggie < maggieQty) {
			System.out.println("Maggie out of stock");
		}else {
			maggie =maggie-maggieQty;
			System.out.println("Maggie Quantity "+ maggieQty);
			System.out.println("Avaible Maggie Quantity "+ maggie);
		}
		if (dosa < dosaQty) {
			System.out.println("dosa out of stock");
		} else {
			dosa = dosa - dosaQty;
			System.out.println("Quantity of dosa : " + dosaQty);
			System.out.println("Available dosa quantity : " + dosa);
		}

		if (pouches < pouchesQty) {
			System.out.println("pouches is out of stock");
		} else {
			pouches = pouches - pouchesQty;
			System.out.println("Quantity of pouches : " + pouchesQty);
			System.out.println("Available quantity : " + pouches);
		}

		if (panipuri < panipuriQty) {
			System.out.println("panipuri is out of stock");
		} else {
			panipuri = panipuri - panipuriQty;
			System.out.println("Quantity of panipuri : " + panipuriQty);
			System.out.println("Quantity of panipuri available: " + panipuri);
		}

		if (masala < masalaQty) {
			System.out.println("masala is out of stock");
		} else {
			masala = masala - masalaQty;
			System.out.println("Quantity of masala : " + masalaQty);
			System.out.println("Quantity available: " + masala);
		}
	}
	
	public static void main(String[] a) {
			Assignment9 assignment9 = new Assignment9();
			assignment9.stockAvaiable();
			assignment9.soldItems(40, 30, 20,43, 10);
			assignment9.outOfStock();

	}

}

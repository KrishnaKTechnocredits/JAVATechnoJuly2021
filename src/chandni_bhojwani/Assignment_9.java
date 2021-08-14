package chandni_bhojwani;

public class Assignment_9 {

	static int maggid;
	static int dosad;
	static int paniPurid;
	static int oilPackd;
	static int masalad;

	void setRequiredqty (int maggiReq, int dosaReq, int paniPuriReq, int oilPackReq, int masalaReq) {
		maggid = maggiReq;
		dosad = dosaReq;
		paniPurid = paniPuriReq;
		oilPackd = oilPackReq;
		masalad = masalaReq;	
	}

	void maggiStatus (int availableQty) {
		if (maggid > availableQty)
			System.out.println ("Maggi is not available");
		else 
			maggid = availableQty;			
	}

	void dosaStatus (int availableQty) {
		if (dosad > availableQty)
			System.out.println ("Dosa is not available");
		else 
			dosad = availableQty;			
	}

	void paniPuriStatus (int availableQty) {
		if (paniPurid > availableQty)
			System.out.println ("Panipuri is not available");
		else 
			paniPurid = availableQty;			
	}

	void oilPackStatus (int availableQty) {
		if (oilPackd > availableQty)
			System.out.println ("Oilpack is not available");
		else 
			oilPackd = availableQty;			
	}

	void masalaStatus (int availableQty) {
		if (masalad > availableQty)
			System.out.println ("Masala is not available");
		else 
			masalad = availableQty;			
	}

	void displayOutOfStockItems () {
		System.out.println ("Below items are out of stock");
		if (maggid >= 0);
		System.out.println ("Maggi");
		if (dosad >= 0);
		System.out.println ("Dosa");
		if (paniPurid >= 0);
		System.out.println ("Panipuri");
		if (oilPackd >= 0);
		System.out.println ("Oilpack");
		if (masalad >= 0);
		System.out.println ("Masala");
	}

	void displayInStockIntems () {
		System.out.println ("Below items are in stock");
		if (maggid >= 0);
		System.out.println ("Maggi");
		if (dosad >= 0);
		System.out.println ("Dosa");
		if (paniPurid >= 0);
		System.out.println ("Panipuri");
		if (oilPackd >= 0);
		System.out.println ("Oilpack");
		if (masalad >= 0);
		System.out.println ("Masala");

	}

	public static void main(String[] args) {
		Assignment_9 assignment_9 = new Assignment_9 ();
		assignment_9.setRequiredqty(55, 35, 75, 25, 20);
		assignment_9.maggiStatus(65);
		assignment_9.dosaStatus(25);
		assignment_9.paniPuriStatus(45);
		assignment_9.oilPackStatus(35);
		assignment_9.masalaStatus(30);
		assignment_9.displayOutOfStockItems();
		assignment_9.displayInStockIntems();


	}


}

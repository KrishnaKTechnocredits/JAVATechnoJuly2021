package akanksha_Jain;

public class Assignment_9 {
	static int iniMagQ, iniDosaQ, iniOilPouchesQ, iniPanipuriQ, iniMasalaQ;
	
	void setInitialQuantity(int magQ, int dosaQ, int oilPouchesQ, int panipuriQ, int masalaQ) {
		iniMagQ = magQ;
		iniDosaQ = dosaQ;
		iniOilPouchesQ = oilPouchesQ;
		iniPanipuriQ = panipuriQ;
		iniMasalaQ = masalaQ;
	}
	
	void purchaseItems(int purMagQ, int purDosaQ, int purOilPouchesQ, int purPanipuriQ, int purMasalaQ) {
		if (iniMagQ > 0 || iniDosaQ > 0 || iniOilPouchesQ > 0 || iniPanipuriQ > 0 || iniMasalaQ > 0) {
			iniMagQ = iniMagQ - purMagQ;
			iniDosaQ = iniDosaQ - purDosaQ;
			iniOilPouchesQ = iniOilPouchesQ - purOilPouchesQ;
			iniPanipuriQ = iniPanipuriQ - purPanipuriQ;
			iniMasalaQ = iniMasalaQ - purMasalaQ;
		}
		if (iniMagQ == 0)
			System.out.println("Maggie Running out of stock");
		if (iniDosaQ == 0)
			System.out.println("Dosa Running out of stock");
		if (iniOilPouchesQ == 0)
			System.out.println("Oil Pouches Running out of stock");
		if (iniPanipuriQ == 0)
			System.out.println("Panipuri Running out of stock");
		if (iniMasalaQ == 0)
			System.out.println("Masala's Running out of stock");
	}
	
	void outOfStock() {
		if (iniMagQ == 0)
			System.out.println("Out of stock(Maggie)");
		if (iniDosaQ == 0)
			System.out.println("Out of Stock(Dosa)");
		if (iniOilPouchesQ == 0)
			System.out.println("Out of Stock(Oil Pouches)");
		if (iniPanipuriQ == 0)
			System.out.println("Out of Stock(Panipuri)");
		if (iniMasalaQ == 0)
			System.out.println("Out of Stock(Masala)");
	}
	
	void availableInStock() {
		if (iniMagQ > 0)
			System.out.println("Available in Stock(Maggie): " + iniMagQ);
		if (iniDosaQ > 0)
			System.out.println("Available in Stock(Dosa): " + iniDosaQ);
		if (iniOilPouchesQ > 0)
			System.out.println("Available in Stock(Oil Pouches): " + iniOilPouchesQ);
		if (iniPanipuriQ > 0)
			System.out.println("Available in Stock(Panipuri): " + iniPanipuriQ);
		if (iniMasalaQ > 0)
			System.out.println("Available in Stock(Masala): " + iniMasalaQ);
	}
	
	public static void main(String[] args) {
		Assignment_9 assignment_9_1 = new Assignment_9();
		assignment_9_1.setInitialQuantity(50, 43, 39, 43, 73);
		assignment_9_1.purchaseItems(20, 30, 39, 43, 50);
		assignment_9_1.outOfStock();
		assignment_9_1.availableInStock();
	}
}

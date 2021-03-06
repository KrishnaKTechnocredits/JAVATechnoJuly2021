package sayali_V;

public class Assignment_9 
{
	static int iniMagQ, iniDosaQ, iniOilPouchesQ, iniPanipuriQ, iniMasalaQ;
		
	void setInitialQuantity(int magQ, int dosaQ, int oilPouchesQ, int panipuriQ, int masalaQ) 
	{
			iniMagQ = magQ;
			iniDosaQ = dosaQ;
			iniOilPouchesQ = oilPouchesQ;
			iniPanipuriQ = panipuriQ;
			iniMasalaQ = masalaQ;
	}
		
	void purchaseItems(int purMagQ, int purDosaQ, int purOilPouchesQ, int purPanipuriQ, int purMasalaQ) 
	{
		if (iniMagQ > 0 || iniDosaQ > 0 || iniOilPouchesQ > 0 || iniPanipuriQ > 0 || iniMasalaQ > 0)
		{
			iniMagQ = iniMagQ - purMagQ;
			iniDosaQ = iniDosaQ - purDosaQ;
			iniOilPouchesQ = iniOilPouchesQ - purOilPouchesQ;
			iniPanipuriQ = iniPanipuriQ - purPanipuriQ;
			iniMasalaQ = iniMasalaQ - purMasalaQ;
		}
			if (iniMagQ == 0)
				System.out.println("Running out of stock: Maggie");
			if (iniDosaQ == 0)
				System.out.println("Running out of stock: Dosa");
			if (iniOilPouchesQ == 0)
				System.out.println("Running out of stock: Oil Pouches");
			if (iniPanipuriQ == 0)
				System.out.println("Running out of stock: Panipuri");
			if (iniMasalaQ == 0)
				System.out.println("Running out of stock: Masala");
	}
		
	void outOfStock()
	{
		if (iniMagQ == 0)
			System.out.println("Out of stock: Maggie");
		if (iniDosaQ == 0)
			System.out.println("Out of Stock: Dosa");
		if (iniOilPouchesQ == 0)
			System.out.println("Out of Stock: Oil Pouches");
		if (iniPanipuriQ == 0)
			System.out.println("Out of Stock: Panipuri");
		if (iniMasalaQ == 0)
			System.out.println("Out of Stock: Masala");
	}
		
	void availableInStock() 
	{
		System.out.println("List of items available in stock:-");
		if (iniMagQ > 0)
			System.out.println("Maggie: " + iniMagQ);
		if (iniDosaQ > 0)
			System.out.println("Dosa: " + iniDosaQ);
		if (iniOilPouchesQ > 0)
			System.out.println("Oil Pouches: " + iniOilPouchesQ);
		if (iniPanipuriQ > 0)
			System.out.println("Panipuri: " + iniPanipuriQ);
		if (iniMasalaQ > 0)
			System.out.println("Masala: " + iniMasalaQ);
	}
		
	public static void main(String[] args)
	{
		Assignment_9 assignment = new Assignment_9();
		assignment.setInitialQuantity(60, 40, 49, 43, 63);
		assignment.purchaseItems(20, 30, 49, 43, 60);
		assignment.outOfStock();
		assignment.availableInStock();
	}
}


	

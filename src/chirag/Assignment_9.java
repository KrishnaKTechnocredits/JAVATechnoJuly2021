package chirag;

public class Assignment_9 {

	static int totalMaggie;
	static int totalDosa;
	static int totalOil;
	static int totalMasala;
	static int totalSoap;
	
	void setInitialQuantity(int maggie,int dosa, int oil, int masala, int soap) {
		totalMaggie = maggie;
		totalDosa = dosa;
		totalOil = oil;
		totalMasala = masala;
		totalSoap = soap;
	}
	
	void purchaseItems(int maggie,int dosa, int oil, int masala,int soap) {
		if (maggie<=totalMaggie)
			totalMaggie=totalMaggie-maggie;
		else {
			System.out.println("Maggie running out of stock");
			totalMaggie=0;
		}
		if (dosa<=totalDosa)
			dosa=totalDosa-dosa;
		else {
			System.out.println("Dosa running out of stock");
			totalDosa=0;
		}
		if (oil<=totalOil)
			totalOil=totalOil-oil;
		else {
			System.out.println("Oil running out of stock");
			totalOil=0;
		}
		if (soap<=totalSoap)
			totalSoap=totalSoap-soap;
		else {
			System.out.println("Panipuri running out of stock");
			totalSoap=0;
		}
		if (masala<=totalMasala)
			totalMasala=totalMasala-masala;
		else {
			System.out.println("Masala running out of stock");
			totalMasala=0;
		}
	}
	
	void itemsInStock() {
		System.out.println("Items in stock :");
		if (totalMaggie!=0) 
			System.out.println("Maggie packets : "+ totalMaggie);
		if (totalDosa!=0) 
			System.out.println("Dosa packets : "+ totalDosa);
		if (totalOil!=0) 
			System.out.println("Oil Packets : "+ totalOil);
		if (totalMasala!=0) 
			System.out.println("Masala Packets : "+ totalMasala);
		if (totalSoap!=0) 
			System.out.println("Soap Packets : "+ totalSoap);
	}
	void itemsOutOfStock() {
		System.out.println("\nBelow items are out of stock :");
		if (totalMaggie==0) 
			System.out.println("Maggie");
		if (totalDosa==0) 
			System.out.println("Dosa");
		if (totalOil==0) 
			System.out.println("Oil Packets");
		if (totalMasala==0) 
			System.out.println("Pani Puri Packets");
		if (totalSoap==0) 
			System.out.println("Masala Packets");
	}
	
	
	public static void main(String[] args) {
		 Assignment_9 assignment_9 = new Assignment_9();
		 assignment_9.setInitialQuantity(44, 63, 72, 15, 55);
		 assignment_9.purchaseItems(6, 15, 77, 16, 25);
		 System.out.println("-------------------------");
		 assignment_9.itemsInStock();
		 System.out.println("--------------------------");
		 assignment_9.itemsOutOfStock();
	}
}

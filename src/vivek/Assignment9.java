package vivek;

public class Assignment9 {

	int maggiecnt;
	int dosacnt;
	int oilcnt;
	int panipuricnt;
	int masalacnt;
	
	void setInitialQuantity(int maggie,int dosa, int oil, int panipuri, int masala) {
		maggiecnt=maggie;
		dosacnt=dosa;
		oilcnt=oil;
		panipuricnt=panipuri;
		masalacnt=masala;
	}
	
	void purchaseItems(int maggie,int dosa, int oil, int panipuri, int masala) {
		if (maggie<=maggiecnt)
			maggiecnt=maggiecnt-maggie;
		else {
			System.out.println("Maggie running out of stock");
			maggiecnt=0;
		}
		if (dosa<=dosacnt)
			dosa=dosacnt-dosa;
		else {
			System.out.println("Dosa running out of stock");
			dosacnt=0;
		}
		if (oil<=oilcnt)
			oilcnt=oilcnt-oil;
		else {
			System.out.println("Oil running out of stock");
			oilcnt=0;
		}
		if (panipuri<=panipuricnt)
			panipuricnt=panipuricnt-panipuri;
		else {
			System.out.println("Panipuri running out of stock");
			panipuricnt=0;
		}
		if (masala<=masalacnt)
			masalacnt=masalacnt-masala;
		else {
			System.out.println("Masala running out of stock");
			masalacnt=0;
		}
	}
	
	void itemsOutOfStock() {
		System.out.println("\nBelow items are out of stock :");
		if (maggiecnt==0) 
			System.out.println("Maggie");
		if (dosacnt==0) 
			System.out.println("Dosa");
		if (oilcnt==0) 
			System.out.println("Oil Packets");
		if (panipuricnt==0) 
			System.out.println("Pani Puri Packets");
		if (masalacnt==0) 
			System.out.println("Masala Packets");
	}
	
	void itemsInStock() {
		System.out.println("\nInventory of in stock items :");
		if (maggiecnt!=0) 
			System.out.println("Maggie" + " - " + maggiecnt);
		if (dosacnt!=0) 
			System.out.println("Dosa" + " - " + dosacnt);
		if (oilcnt!=0) 
			System.out.println("Oil Packets" + " - " + oilcnt);
		if (panipuricnt!=0) 
			System.out.println("Pani Puri Packets" + " - " + panipuricnt);
		if (masalacnt!=0) 
			System.out.println("Masala Packets" + " - " + masalacnt);
	}
	
	public static void main(String[] args) {
		 Assignment9 assignment9 = new Assignment9();
		 assignment9.setInitialQuantity(50, 43, 39, 43, 73);
		 assignment9.purchaseItems(25, 44, 20, 10, 25);
		 assignment9.itemsOutOfStock();
		 assignment9.itemsInStock();
	}
}

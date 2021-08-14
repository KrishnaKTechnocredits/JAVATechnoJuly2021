package bhagyashree;

public class Assignment9 {

	int maggieCount;
	int dosaCount;
	int oilpouchCount;
	int panipuriCount;
	int masalaCount;

	void setItem(int maggie, int dosa, int pouch, int panipuri, int masala) {
		maggieCount = maggie;
		dosaCount = dosa;
		oilpouchCount = pouch;
		panipuriCount=panipuri;
		masalaCount=masala;
	}

	void printOutofStockItem() {
		if (maggieCount == 0) {
			System.out.println("Maggie is out of Stock");
		}
		if (dosaCount == 0) {
			System.out.println("Dosa is out of stock");
		}
		if (oilpouchCount == 0) {
			System.out.println("Oil pouches are out of stock");
		}
		
		if(panipuriCount==0)
		{
			System.out.println("Panipuri is out of stock");
		}

		if(masalaCount==0)
		{
			System.out.println("Masala packets out of stock");
		}
	}

	void printAvailableItems() {
		if (maggieCount > 0) {
			System.out.println("Maggie is available: " + maggieCount);
		}
		if (dosaCount > 0) {
			System.out.println("Dosa is available: " + dosaCount);
		}
		if (oilpouchCount > 0) {
			System.out.println("Oil Pouches are availble: " + oilpouchCount);
		}
		if (panipuriCount > 0) {
			System.out.println("Panipuri packets are availble: " + panipuriCount);
		}
		if (masalaCount > 0) {
			System.out.println("Masala packets are availble: " + masalaCount);
		}
	}

	void SetPurchaseItems(int maggiepackets, int dosapackets, int oilpackets, int panipuripackets,int masalapackets) {
		System.out.println("Maggie:" + maggiepackets + " Dosa:" + dosapackets + " oilpouches:" + oilpackets+"  Panipuri:"+panipuripackets+"  Masala:"+masalapackets);

		if (maggieCount >= maggiepackets) {
			maggieCount = maggieCount - maggiepackets;
		} else if(maggieCount==0){
			System.out.println("Maggie packets not available");
		} // maggie

		if (dosaCount >= dosapackets) {
			dosaCount = dosaCount - dosapackets;
		} else if(dosaCount==0){
			System.out.println("Dosa packets not available");
		} // dosa

		if (oilpouchCount >= oilpackets) {
			oilpouchCount = oilpouchCount - oilpackets;
		} else if(oilpouchCount==0){
			System.out.println("Oil Packets not available");
		} // oilpouch
		
		if (panipuriCount >= panipuripackets) {
			panipuriCount = panipuriCount - panipuripackets;
		} else if(panipuriCount==0){
			System.out.println("Panipuri Packets not available");
		} //panipuri
		
		if (masalaCount >= masalapackets) {
			masalaCount = masalaCount - masalapackets;
		} else if(masalaCount==0){
			System.out.println("Masala Packets not available");
		} 
	}

	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.setItem(43,39,50,50,25);

		System.out.println("Items ordered:");
		assignment9.SetPurchaseItems(43,39,10,20,25);
		System.out.println("---------------------------------");

		System.out.println("Available Items in Stock:");
		assignment9.printAvailableItems();
		System.out.println("---------------------------------");

		System.out.println("Items not available in stock:");
		assignment9.printOutofStockItem();
		System.out.println("---------------------------------");
	}
}

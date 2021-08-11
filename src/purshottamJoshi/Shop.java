package purshottamJoshi;

public class Shop{
	String customerName;
	static int totalMaggieStock = 50;
	static int totalDosaStock = 43;
	static int totalOilPouches = 39;
	static int totalPanipuriPackets = 43;
	static int totalMasalaPackets = 73;
	void setQuantity(int maggie, int dosa, int oil, int panipuri, int masala) {
		totalMaggieStock = maggie;
		totalDosaStock = dosa;
		totalOilPouches = oil;
		totalPanipuriPackets = panipuri;
		totalMasalaPackets = masala;
	}
	void purchaseProcess(int maggie,int dosa,int oil,int panipuri,int masala) {
		displayOutofStockProduct();
		if (maggie > 0) {
			if (maggie <= totalMaggieStock) {
				totalMaggieStock = totalMaggieStock - maggie;

			} else {
				System.out.println("Dont have sufficient quantity of maggie, Requested maggie is " + maggie+ " but available qauntity is " + totalMaggieStock);
			}
		} else {
			System.out.println(" Maggie is out of stock");
			maggie = 0;
		}
		if (dosa > 0) {
			if (dosa <= totalDosaStock) {
				totalDosaStock = totalDosaStock - dosa;

			} else {
				System.out.println("Dont have sufficient quantity of Dosa, Requested Dosa is " + dosa+ " but available qauntity is " + totalDosaStock);
			}
		} else {
			System.out.println(" Dosa is out of stock");
		}
		if (oil > 0) {
			if (oil <= totalOilPouches) {
				totalOilPouches = totalOilPouches - oil;

			} else {
				System.out.println("Dont have sufficient quantity of Oil, Requested Oil is " + oil+ " but available qauntity is " + totalOilPouches);			
			}
		} else {
			System.out.println(" Oil is out of stock");
			
		}
		if (panipuri > 0) {
			if (panipuri <= totalPanipuriPackets) {
				totalPanipuriPackets = totalPanipuriPackets - panipuri;

			} else {
				System.out.println("Dont have sufficient quantity of PaniPuri, Requested PaniPuri is " + panipuri+ " but available qauntity is " + totalPanipuriPackets);
			
			}
		} else {
			System.out.println(" Panipuri is out of stock");
		}
		if (masala > 0) {
			if (masala <= totalMasalaPackets) {
				totalMasalaPackets = totalMasalaPackets - masala;

			} else {
				System.out.println("Dont have sufficient quantity of Masala, Requested Masala is " + masala+ " but available qauntity is " + totalMasalaPackets);
			}
		} else {
			System.out.println(" Masala is out of stock");
		}
				
	}
	void displayOutofStockProduct(){
		if(totalMaggieStock <= 0)
			System.out.println("Maggie runnung out of stock");
		if(totalDosaStock <= 0)
			System.out.println("Dosa running out of Stock");
		if(totalOilPouches <= 0)
			System.out.println("Oil puches running out of stock");
		if(totalPanipuriPackets <= 0)
			System.out.println("Pani Puri Running out of Stock");
		if(totalMasalaPackets <= 0)
			System.out.println("Masala running out of stock");
	}
	void displayAvailableinStock() {
		if(totalMaggieStock > 0) {
			System.out.println("Maggie Packets: "+totalMaggieStock);
		}	
		if(totalDosaStock > 0) {
			System.out.println("Dosa Stock : "+totalDosaStock);
		}
		if(totalOilPouches > 0) {
			System.out.println("Oil Pouches : "+totalOilPouches);
		}
		if(totalPanipuriPackets > 0) {
			System.out.println("Pani Puri Packs: "+totalPanipuriPackets);
		}
		if(totalMasalaPackets > 0) {
			System.out.println("Masala Packets : "+totalMasalaPackets);
		}
	}

	public static void main(String[] args){
		Shop shop = new Shop();
		shop.setQuantity(80,80,80,80,80);
		shop.purchaseProcess(100,80,20,25,30);
		shop.displayOutofStockProduct();
		shop.displayAvailableinStock();
		
	}
	
}
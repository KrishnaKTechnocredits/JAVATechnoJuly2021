package purshottamJoshi;

public class Shop{
	String customerName;
	static int totalMaggieStock = 50;
	static int totalDosaStock = 43;
	static int totalOilPouches = 39;
	static int totalPanipuriPackets = 43;
	static int totalMasalaPackets = 73;
	void setCustomerDetails(String customer1) {
		customerName = customer1;
	}
	void purchaseProcess(int maggie,int dosa,int oil,int panipuri,int masala) {
		displayOutofStockProduct();
		if(maggie >  totalMaggieStock) {
			System.out.println(totalMaggieStock+" maggie packets available");
				
		} else if(maggie <= totalMaggieStock) {
				totalMaggieStock = totalMaggieStock - maggie;
		}
		if(dosa > totalDosaStock) {
			System.out.println(totalDosaStock+" Dosa available : ");
		} else if ( dosa <= totalDosaStock) {
			totalDosaStock = totalDosaStock - dosa;
		}
		if(oil > totalOilPouches) {
			System.out.println(totalOilPouches+" Oil pouche available"  );
		}else if(oil <= totalOilPouches) {
			totalOilPouches = totalOilPouches - oil;
		}
		if(panipuri > totalPanipuriPackets){
			System.out.println(totalPanipuriPackets +" Panipuri packets available" );
		}else if(panipuri <= totalPanipuriPackets) {
			totalPanipuriPackets = totalPanipuriPackets - panipuri;
		}
		if(masala > totalMasalaPackets) {
			System.out.println(totalMasalaPackets+" Masala Packets available" );
		}else if(masala <= totalMasalaPackets) {
			totalMasalaPackets = totalMasalaPackets - masala;
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
			System.out.println("***** Available Stocks *****");
			System.out.println("Maggie Packets: "+totalMaggieStock);
			System.out.println("Dosa Stock : "+totalDosaStock);
			System.out.println("Oil Pouches : "+totalOilPouches);
			System.out.println("Pani Puri Packs: "+totalPanipuriPackets);
			System.out.println("Masala Packets : "+totalMasalaPackets);
	}

	public static void main(String[] args){
		Shop shop = new Shop();
		//shop.setCustomerDetails("Purshottam");
		shop.purchaseProcess(50,10,20,25,30);
		shop.displayOutofStockProduct();
		shop.displayAvailableinStock();
		
	}
	
}
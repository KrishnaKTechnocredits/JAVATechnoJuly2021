package bharat.assignment;

public class Shop {

	static int totalMaggiePacketsQty;
	static int totalDosaPacketsQty;
	static int totalOilPacketsQty;
	static int totalPanipuriPacketsQty;
	static int totalMasalaPacketsQty;
	
	
	void setInitialstock(int initialMaggiestock, int initialDosaStock, int initialOilStock, int initialPanipuriStock, int initialMasalaStock ) {
		totalMaggiePacketsQty =  initialMaggiestock;
		totalDosaPacketsQty = initialDosaStock;
		totalOilPacketsQty = initialOilStock;
		totalPanipuriPacketsQty = initialPanipuriStock;
		totalMasalaPacketsQty = initialMasalaStock;
	}
	
	void customerShopingReq(int reqMaggiePacket, int reqDosaPacket, int reqOilPacket, int reqPanipuriPacket, int reqMasalaPacket ) {
		
		System.out.println("---Maggie Packets---");
		if (totalMaggiePacketsQty >= reqMaggiePacket) {
			totalMaggiePacketsQty = totalMaggiePacketsQty - reqMaggiePacket;
			System.out.println("order served to customer.");
		}else {
			System.out.println("out off stock Maggie");
		}
		
		System.out.println("---Dosa---");
		if (totalDosaPacketsQty >= reqDosaPacket) {
			totalDosaPacketsQty = totalDosaPacketsQty - reqDosaPacket;
			System.out.println("order served to customer");
		}else {
			System.out.println("out of stock Dosa");
		}
		
		System.out.println("---Oil---");
		if (totalOilPacketsQty >= reqOilPacket) {
			totalOilPacketsQty = totalOilPacketsQty - reqOilPacket;
			System.out.println("Order served to customer");
		}else {
			System.out.println("out of stock oil");
		}
		
		System.out.println("---Panipuri---");
		if (totalPanipuriPacketsQty >= reqPanipuriPacket) {
			totalPanipuriPacketsQty = totalPanipuriPacketsQty - reqPanipuriPacket;
			System.out.println("order served to customer.");
		}else {
			System.out.println("out of stock");
		}
		
		System.out.println("---Masala---");
		
		if(totalMasalaPacketsQty >= reqMasalaPacket) {
			totalMasalaPacketsQty =totalMasalaPacketsQty - reqMasalaPacket;
			System.out.println("order served to customer");
		}else {
			System.out.println("out of stock");
		}
	}
		
		void availableStock() {
			System.out.println("-----Avalable----");
			
			if(totalMaggiePacketsQty > 0)
				System.out.println("Avalaible maggie packet:"+totalMaggiePacketsQty);
			
			if(totalDosaPacketsQty > 0)
				System.out.println("Avalaible dosa packet:"+totalDosaPacketsQty);
			
			if(totalOilPacketsQty > 0)
				System.out.println("Avalable oil packet:"+totalOilPacketsQty);
			
			if(totalPanipuriPacketsQty > 0)
				System.out.println("Avalable panipure:"+totalPanipuriPacketsQty);
			
			if (totalMasalaPacketsQty > 0)
				System.out.println("Avalable masala packet:"+totalMasalaPacketsQty);
		
		}
		
		void outOfstock() {
			System.out.println("----out of stock------");
			if(totalMaggiePacketsQty == 0)
				System.out.println("maggie out of stock");
			
			if(totalDosaPacketsQty == 0)
				System.out.println("dosa out of stock");
			
			if(totalOilPacketsQty == 0)
				System.out.println("oil out of stock");
			
			if(totalPanipuriPacketsQty == 0)
				System.out.println("panipuri out of stock");
			
			if(totalMasalaPacketsQty == 0)
				System.out.println("masala out of stock");
		
		}
public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setInitialstock(50,43,39,43,73);
		shop.customerShopingReq(29,55,35,43,75);
		shop.availableStock();
		shop.outOfstock();
}
	
}

/* Assignment - 9 : 11th Aug'2021

Create a system (Shop) which maintains each item's quantity.

a. Initial stocks of Maggie: 50 Maggie packets
b. Initial stocks of Dosa : 43 packets
c. Initial stocks of pouches : 39 oil packets
d. Initial stocks of panipuri : 43 packets
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.

Do we need to create seprate purchase method for each item or it will be a single method?*/



package sushant;


public class ShopSystemAssignment_9 {
	static int totalMaggiePacketQuantity;
	static int totalDosaPacketQuantity;
	static int totalOilPacketQuantity;
	static int totalPanipuriPacketQuantity;
	static int totalMasalaPacketQuantity;
	
	void setIntialquantity(int initialMaggieQuant, int initialDosaQuant, int initialOilQuant, int initialPanipuriQuant, int initialMasalaQuant) {
		totalMaggiePacketQuantity = initialMaggieQuant;
		totalDosaPacketQuantity = initialDosaQuant;
		totalOilPacketQuantity = initialOilQuant;
		totalPanipuriPacketQuantity = initialPanipuriQuant;
		totalMasalaPacketQuantity = initialMasalaQuant;
	}
	
	void requestingProduct(int reqmaggiepacket, int reqdosapacket, int reqoilpacket, int reqpanipuripacket, int reqmasalpacket){
		
		System.out.println("Maggie Packets is: ");
		if(totalMaggiePacketQuantity >= reqmaggiepacket) {
			totalMaggiePacketQuantity = totalMaggiePacketQuantity - reqmaggiepacket;
			System.out.println("Order served to customer.");
			
		}else{
			System.out.println("We have minimum quantity of Maggie packets then you order.");	
		}
		
		System.out.println("Dosa Packets is: ");
		if(totalDosaPacketQuantity >= reqdosapacket) {
			totalDosaPacketQuantity = totalDosaPacketQuantity - reqdosapacket;
			System.out.println("Order served to customer.");
			
		}else{
			System.out.println("We have minimum quantity of Dosa packets than you order.");	
		}
		
		System.out.println("Oil Packets is: ");
		if(totalOilPacketQuantity >= reqoilpacket) {
			totalOilPacketQuantity = totalOilPacketQuantity - reqoilpacket;
			System.out.println("Order served to customer.");
			
		}else{
			System.out.println("We have minimum quantity of Oil packets than you order.");		
		}
		
		System.out.println("Panipuri Packets is: ");
		if(totalPanipuriPacketQuantity >= reqpanipuripacket) {
			totalPanipuriPacketQuantity = totalPanipuriPacketQuantity - reqpanipuripacket;
			System.out.println("Order served to customer.");
			
		}else{
			System.out.println("We have minimum quantity of Panipuri packets than you order.");	
		}
		
		System.out.println("Masala Packets is: ");
		if(totalMasalaPacketQuantity >= reqmasalpacket) {
			totalMasalaPacketQuantity = totalMasalaPacketQuantity - reqmasalpacket;
			System.out.println("Order served to customer.");
			
		}else{
			System.out.println("We have minimum quantity of Masala packets than you order.");		
		}
	}
	
	void availableStockofProduct() {
		System.out.println("Available Products is: ");	
		if(totalMaggiePacketQuantity > 0)
			System.out.println("Available Maggie Packets are : "+totalMaggiePacketQuantity);
		
		if(totalDosaPacketQuantity > 0)
			System.out.println("Available Dosa Packets are : "+totalDosaPacketQuantity);
		
		if(totalOilPacketQuantity > 0)
			System.out.println("Available Oil Packets are : "+totalOilPacketQuantity);
		
		if(totalPanipuriPacketQuantity > 0)
			System.out.println("Available Panipuri Packets are : "+totalPanipuriPacketQuantity);
		
		if(totalMasalaPacketQuantity > 0)
			System.out.println("Available Masala Packets are : "+totalMasalaPacketQuantity);
	}
	
	void outOfStockProduct() {
		System.out.println("Out of Stock Products is: ");
		if(totalMaggiePacketQuantity == 0)
			System.out.println("Maggie Packets are out of stock.");
		
		if(totalDosaPacketQuantity == 0)
			System.out.println("Dosa Packets are out of stock.");
			
		if(totalOilPacketQuantity == 0)
			System.out.println("Oil Packets are out of stock.");
			
		if(totalPanipuriPacketQuantity == 0)
			System.out.println("Panipuri Maggie Packets are out of stock.");
			
		if(totalMasalaPacketQuantity == 0)
			System.out.println("Masala Packets are out of stock.");
	}
	
	public static void main(String[] args) {
		ShopSystemAssignment_9 shopSystemAssignment_9  = new ShopSystemAssignment_9();
		shopSystemAssignment_9.setIntialquantity(50,43,39,43,73);
		shopSystemAssignment_9.requestingProduct(30,60,39,50,73);
		shopSystemAssignment_9.availableStockofProduct();
		shopSystemAssignment_9.outOfStockProduct();
	}

}

package sourabh;

public class Assignment_9 {
	
	static int totalStockOfMaggiePackets;
	static int totalStockOfDosaPackets;
	static int totalStockOfOilPackets;
	static int totalStockOfPanipuriPackets;
	static int totalStockOfMasalaPackets;
	
	void setInitialQuantity (int initialStockOfMaggie, int initialStockOfDosaPackets, int initialStockOfOil, int initialStockOfPanipuriPackets, int initialStockOfMasalaPackets ) {
		totalStockOfMaggiePackets = initialStockOfMaggie;
		totalStockOfDosaPackets = initialStockOfDosaPackets;
		totalStockOfOilPackets = initialStockOfOil;
		totalStockOfPanipuriPackets = initialStockOfPanipuriPackets;
		totalStockOfMasalaPackets = initialStockOfMasalaPackets;
	}
	
	void order (int reqMaggiePackets, int reqDosaPackets, int reqOilPackets, int reqPanipuriPackets, int reqMasalaPackets) {
		System.out.println("\n ****************** Maggie Packets ******************");
		if(totalStockOfMaggiePackets >= reqMaggiePackets) {
			totalStockOfMaggiePackets = totalStockOfMaggiePackets - reqMaggiePackets;
			System.out.println(reqMaggiePackets + " Maggie packets served to customer, available maggie packets = " + totalStockOfMaggiePackets);
		}
		else {
			System.out.println("Order can not be sreved due to less or no quantity of maggie packets");
		}
		
		System.out.println("\n ****************** Dosa Packets ******************");
		if(totalStockOfDosaPackets >= reqDosaPackets) {
			totalStockOfDosaPackets = totalStockOfDosaPackets - reqDosaPackets;
			System.out.println(reqDosaPackets + " Dosa Packets served to customer, available Dosa packets = " + totalStockOfDosaPackets);
		}
		else {
			System.out.println("Order can not be sreved due to less or no quantity of Dosa packets");
		}
		
		System.out.println("\n****************** Oil Packets ******************");
		if(totalStockOfOilPackets >= reqOilPackets) {
			totalStockOfOilPackets = totalStockOfOilPackets - reqOilPackets;
			System.out.println(reqOilPackets + " Oil Packets served to customer, available Oil packets = " + totalStockOfDosaPackets);
		}
		else {
			System.out.println("Order can not be sreved due to less or no quantity of Oil packets");
		}

		System.out.println("\n ****************** Panipuri Packets ******************");
		if(totalStockOfPanipuriPackets >= reqPanipuriPackets) {
			totalStockOfPanipuriPackets = totalStockOfPanipuriPackets - reqPanipuriPackets;
			System.out.println(reqPanipuriPackets + " Panipuri Packets served to customer, available Panipuri packets = " + totalStockOfPanipuriPackets);
		}
		else {
			System.out.println("Order can not be sreved due to less or no quantity of Panipuri packets");
		}
		
		System.out.println("\n****************** Masala Packets ******************");
		if(totalStockOfMasalaPackets >= reqMasalaPackets) {
			totalStockOfMasalaPackets = totalStockOfMasalaPackets - reqMasalaPackets;
			System.out.println(reqMasalaPackets + " Masala Packets served to customer, available Masala packets = " + totalStockOfMasalaPackets);
		}
		else {
			System.out.println("Order can not be sreved due to less or no quantity of Masala packets");
		}
	}
		
		void availableStockOfProduct() {
			System.out.println("\n******************** Availabe Products ********************");
			if (totalStockOfMaggiePackets > 0)
				System.out.println("\n Available Stock of Maggie Packet = " + totalStockOfMaggiePackets);
			
			if (totalStockOfDosaPackets > 0)
				System.out.println("\n Available Stock of Dosa Packet = " + totalStockOfDosaPackets);
			
			if (totalStockOfOilPackets > 0)
				System.out.println("\n Available Stock Oil Packet = " + totalStockOfOilPackets);
			
			if (totalStockOfPanipuriPackets > 0)
				System.out.println("\n Available Stock Panipuri Packet = " + totalStockOfPanipuriPackets);
			
			if (totalStockOfMasalaPackets > 0)
				System.out.println("\n Available Stock Masala Packet = " + totalStockOfMasalaPackets);	
		}
		
		void outOfStockProduct() {
			System.out.println("\n******************** Out Of Stock Products ********************");
			if (totalStockOfMaggiePackets == 0)
				System.out.println("\n Maggie Packets Running Out of Stock ");
			
			if (totalStockOfDosaPackets == 0)
				System.out.println("\n Dosa Packets Running Out of Stock ");
			
			if (totalStockOfOilPackets == 0)
				System.out.println("\n Oil Packets Running Out of Stock ");
			
			if (totalStockOfPanipuriPackets == 0)
				System.out.println("\n Panipuri Packets Running Out of Stock ");
			
			if (totalStockOfMasalaPackets == 0)
				System.out.println("\n Masala Packets Running Out of Stock ");
		}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_9 assignment9 = new Assignment_9();
		assignment9.setInitialQuantity(50, 43, 39, 43, 73);
		assignment9.order(30, 43, 67, 40, 60);
		assignment9.availableStockOfProduct();
		assignment9.outOfStockProduct();
	}
}

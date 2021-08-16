package somnath;
 
public class Shop {

	static int totalMaggiePacketQuantity;
	static int totalDosaPacketQuantity;
	static int totalOilPacketQuantity;
	static int totalPanipuriPacketQuantity;
	static int totalMasalaPacketQuantity;

	void setIntialquantity(int initialMaggieQuantity, int initialDosaQuantity, int initialOilQuantiy, int initialPanipuriQuantity, int initialMasalaQuantity) {
		totalMaggiePacketQuantity = initialMaggieQuantity;
		totalDosaPacketQuantity = initialDosaQuantity;
		totalOilPacketQuantity = initialOilQuantiy;
		totalPanipuriPacketQuantity = initialPanipuriQuantity;
		totalMasalaPacketQuantity = initialMasalaQuantity;
	}

	void demandProduct(int demandmaggiepacket, int demanddosapacket, int demandoilpacket, int demandpanipuripacket, int demandmasalpacket){

		System.out.println("---------Maggie Packets -------------");
		if(totalMaggiePacketQuantity >= demandmaggiepacket) {
			totalMaggiePacketQuantity = totalMaggiePacketQuantity - demandmaggiepacket;
			System.out.println("Order deliever to the customer");

		}else{
			System.out.println("Product is out of stock");	
		}

		System.out.println("---------- Dosa Packets ---------");
		if(totalDosaPacketQuantity >= demanddosapacket) {
			totalDosaPacketQuantity = totalDosaPacketQuantity - demanddosapacket;
			System.out.println("Order deliever to the customer");

		}else{
			System.out.println("Product is out of stock");	
		}

		System.out.println("--------- Oil Packets-----------");
		if(totalOilPacketQuantity >= demandoilpacket) {
			totalOilPacketQuantity = totalOilPacketQuantity - demandoilpacket;
			System.out.println("Order deliever to the customer");

		}else{
			System.out.println("Product is out of stock");		
		}

		System.out.println("--------------Panipuri Packets -------------");
		if(totalPanipuriPacketQuantity >= demandpanipuripacket) {
			totalPanipuriPacketQuantity = totalPanipuriPacketQuantity - demandpanipuripacket;
			System.out.println("Order deliever to the customer");

		}else{
			System.out.println("Product is out of stock");	
		}

		System.out.println("------------Masala Packets --------------");
		if(totalMasalaPacketQuantity >= demandmasalpacket) {
			totalMasalaPacketQuantity = totalMasalaPacketQuantity - demandmasalpacket;
			System.out.println("Order deliever to the customer");

		}else{
			System.out.println("Product is out of stock");		
		}
 

	}

	void availableStockofProduct() {
		System.out.println("----------- Available Products ------------");	
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
		System.out.println("-----------Out of Stock Products ------------");
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
		Shop shop  = new Shop();
		shop.setIntialquantity(45,42,28,46,90);
		shop.demandProduct(30,55,28,50,65);
		shop.availableStockofProduct();
		shop.outOfStockProduct();
	}

}
 
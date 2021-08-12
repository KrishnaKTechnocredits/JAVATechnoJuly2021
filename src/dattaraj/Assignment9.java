package dattaraj;

public class Assignment9 {
	static int qtyMaggie = 50;;
	static int qtyDosa = 43;
	static int qtyOilPouch = 39;
	static int qtyPanipuriPacket = 43;
	static int qtyMasalaPacket = 73;
	
	void purchaseMaggie(int qty) {
		if (qty > qtyMaggie)
			System.out.println("Oops Maggie is not available in the required quantity!!");
		else
			qtyMaggie -= qty;
	}
	
	void purchaseDosa(int qty) {
		if (qty > qtyDosa)
			System.out.println("Oops Dosa is not available in the required quantity!!");
		else
			qtyDosa -= qty;
	}
	
	void purchaseOilPouch(int qty) {
		if (qty > qtyOilPouch)
			System.out.println("Oops OilPouch is not available in the required quantity!!");
		else
			qtyOilPouch -= qty;
	}
	
	void purchasePanipuriPacket(int qty) {
		if (qty > qtyPanipuriPacket)
			System.out.println("Oops PanipuriPacket is not available in the required quantity!!");
		else
			qtyPanipuriPacket -= qty;
	}
	
	void purchaseMasalaPacket(int qty) {
		if (qty > qtyMasalaPacket)
			System.out.println("Oops MasalaPacket is not available in the required quantity!!");
		else
			qtyMasalaPacket -= qty;
	}
	
	void OutOfStockitems() {
		System.out.println("Below Items Are Out of Stock --> ");
		
		if(qtyMaggie==0) {
			System.out.println("Maggi is Out of Stock!!!!");
		}
		
		if(qtyDosa==0) {
			System.out.println("Dosa is Out of Stock!!!!");
		}
		
		if(qtyOilPouch==0) {
			System.out.println("Oil Pouch is Out of Stock!!!!");
		}
		
		if(qtyPanipuriPacket==0) {
			System.out.println("PaniPuri Packets is Out of Stock!!!!");
		}
		
		if(qtyMasalaPacket==0) {
			System.out.println("Masala Packet is Out of Stock!!!!");
		}
	}
	
	void StockitemsAvails() {
		System.out.println("Below Items Are In Stock -->");
		
		if(qtyMaggie>0) {
			System.out.println("Maggi is In Stock."+" (Available Quantity is "+qtyMaggie+")");
		}
		
		if(qtyDosa>0) {
			System.out.println("Dosa is In Stock."+" (Available Quantity is "+qtyDosa+")");
		}
		
		if(qtyOilPouch>0) {
			System.out.println("Oil Pouch is In Stock."+" (Available Quantity is "+qtyOilPouch+")");
		}
		
		if(qtyPanipuriPacket>0) {
			System.out.println("PaniPuri Packets is In Stock."+" (Available Quantity is "+qtyPanipuriPacket+")");
		}
		
		if(qtyMasalaPacket>0) {
			System.out.println("Masala Packet is In Stock."+" (Available Quantity is "+qtyMasalaPacket+")");
		}
	}
	
	public static void main(String[] args) {
		Assignment9 assign_9 = new Assignment9();
		
		assign_9.purchaseMaggie(10);
		assign_9.purchaseDosa(45);
		assign_9.purchaseOilPouch(5);
		assign_9.purchasePanipuriPacket(15);
		assign_9.purchaseMasalaPacket(73);
		assign_9.OutOfStockitems();
		assign_9.StockitemsAvails();
			
	}
}	

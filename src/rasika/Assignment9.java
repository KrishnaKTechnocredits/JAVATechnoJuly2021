package rasika;

public class Assignment9 {
	
	static int maggieQty;
	int dosaQty;
	int oilPouchesQty;
	int panipuriQty;
	int masalaQty;
	
	void setQuantity(int maggie, int dosa, int oil, int panipuri, int masala) {
		maggieQty = maggie;
		dosaQty = dosa;
		oilPouchesQty = oil;
		panipuriQty = panipuri;
		masalaQty = masala;
	}
	void purchaseMaggie(int maggie) {
		if(maggieQty >= maggie){
			maggieQty = maggieQty - maggie;
			System.out.println("In stock maggie quantity "+maggieQty);	
		}
		else 
			System.out.println(" Maggie is Running out of stock..Item is sold out..");
	}
	void purchaseDosa(int dosa) {
		if(dosaQty >= dosa){
			dosaQty = dosaQty - dosa;
			System.out.println("In stock dosa quantity "+dosaQty);
		}
		else 
			System.out.println("Dosa is Running out of stock..Item is sold out..");
	}
	void purchaseOilPouch(int oil) {
		if(oilPouchesQty >= oil){
			oilPouchesQty = oilPouchesQty - oil;
			System.out.println("In stock Oil quantity "+oilPouchesQty);
		}
		else 
			System.out.println("Oil pouches are Running out of stock..Item is sold out..");
	}
	void purchasePanipuriPackets(int panipuri) {
		if(panipuriQty >= panipuri){
			panipuriQty = panipuriQty - panipuri;
			System.out.println("In stock Panipuri packets quantity "+panipuriQty);
		}
		else
			System.out.println("Panipuri packets are Running out of stock..Item is sold out..");
	}
	void purchaseMasalaPackets(int masalaPckts) {
		if(masalaQty >= masalaPckts){
			masalaQty = masalaQty - masalaPckts;
			System.out.println("In stock Masala packets quantity "+masalaQty);
		}
		else
			System.out.println("Masala packets are Running out of stock..Item is sold out..");
	}
	void outOfStocksItems() {
		if(maggieQty == 0) 
			System.out.println("maggie"+" is out of stock..");
			if(dosaQty == 0) 
			System.out.println("dosa "+"is out of stock..");
		    	if(oilPouchesQty == 0) 
				System.out.println("oilPouches are"+" out of stock..");
					if(panipuriQty == 0) 
					System.out.println("panipuriQty"+" is out of stock..");
						if(masalaQty == 0)
						System.out.println("Masala Quantity"+" is out of stock..");	
	}
	void availableInStocksItems() {
		if(maggieQty != 0) 
			System.out.println("maggie"+" is in stock..");
			if(dosaQty != 0) 
			System.out.println("dosa "+"is in stock..");
		    	if(oilPouchesQty != 0) 
				System.out.println("oilPouches are"+" in stock..");
					if(panipuriQty != 0) 
					System.out.println("panipuri packets"+" are in stock..");
						if(masalaQty != 0)
						System.out.println("Masala packets"+" are in stock..");	
	}
	
	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.setQuantity(50,43,39,43,73);		
		assignment9.purchaseMaggie(50);
		assignment9.purchaseDosa(43);
		assignment9.purchaseOilPouch(39);
		assignment9.purchasePanipuriPackets(3);
		assignment9.purchaseMasalaPackets(3);
		assignment9.purchaseMaggie(5);
		assignment9.outOfStocksItems();
		assignment9.availableInStocksItems();
	}

}

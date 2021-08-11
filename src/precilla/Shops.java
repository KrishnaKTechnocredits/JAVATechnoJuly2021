package precilla;

public class Shops {
	static int maggiePackets,dosaPackets,pouchesPackets,panipuriPackets,masalasPackets;
	String choice;
	void initializeStocksOfPackets() {
		maggiePackets=0;
		dosaPackets=43;
		pouchesPackets=0;
		panipuriPackets=43;
		masalasPackets=73;
	}
	void customerShopping(String customerChoice) {
		
		choice=customerChoice;
		if(choice=="maggie") {
			if(maggiePackets>0) {
				maggiePackets--;
				System.out.println(choice);
			}else {
				System.out.println("We are Running out of "+choice+ "!! Please shop some other items");	
			}
		}
		else if(choice=="dosa") {
			if(dosaPackets>0){
				dosaPackets--;
				System.out.println(choice);
			}else {
				System.out.println("We are Running out of "+choice+ "!! Please shop some other items");	
			}
			
		}	
		else if(choice=="pouches") {
			if(pouchesPackets>0) {
				pouchesPackets--;
				System.out.println(choice);
			}else {
				System.out.println("We are Running out of "+choice+ "!! Please shop some other items");	
			}
		}
		
		else if(choice=="panipuri") {
			if(panipuriPackets>0) {
				panipuriPackets--;
				System.out.println(choice);
			}else {
				System.out.println("We are Running out of "+choice+ "!! Please shop some other items");	
			}
		}
		
		else if(choice=="masalas") {
			if( masalasPackets>0) {
				masalasPackets--;
				//masalasPackets--;
				System.out.println(choice);
			}else {
				System.out.println("We are Running out of "+choice+ "!! Please shop some other items");	
			}	
		}else {
			System.out.println("Given Item is not available in this shop");
		}
	}
	void outofStockItems() {
		 	if(maggiePackets <=0)
		 		System.out.println("Maggie Packets are out of stock");
		 	if(dosaPackets <=0 ) 
		 		System.out.println("Dosa Packets are out of stock");
			if(pouchesPackets<=0)
				System.out.println("Pouches Oil Packets are out of stock");
			if(panipuriPackets<=0)
				System.out.println("Panipuri Packets are out of stock");
			if(masalasPackets<=0)
				System.out.println("Masalas Packets are out of stock");
	 }
	void availableItems() {
		 	if(maggiePackets >0)
		 		System.out.println("Maggie products : "+maggiePackets);
		 	if(dosaPackets > 0 ) 
		 		System.out.println("Dosa products : "+dosaPackets);
			if(pouchesPackets>0)
				System.out.println("Pouches Oil Packets : "+pouchesPackets);
			if(panipuriPackets>0)
				System.out.println("Panipuri packets : "+panipuriPackets);
			if(masalasPackets>0)
				System.out.println("Masala's Packets : "+masalasPackets);
	}
	
	public static void main(String[] args) {
		Shops shop=new Shops();
		shop.initializeStocksOfPackets();
		System.out.println("***Customer Shopping list***\nAdded items are ");
		shop.customerShopping("maggie");	
		shop.customerShopping("dosa");
		shop.customerShopping("dosa");
		shop.customerShopping("pouches");
		shop.customerShopping("masalas");
		shop.customerShopping("panipuri");
		shop.customerShopping("panipuri");
		shop.customerShopping("panipuri");
		System.out.println("\n***Out of Stock items are *** ");
		shop.outofStockItems();
		System.out.println("\n***Available items are ***");//Panipuri stock will be 40 and dosa 41
		shop.availableItems();
		
	}
}


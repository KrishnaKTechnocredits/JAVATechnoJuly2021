package sneha;

public class Assignment_9 {
	
	static int maggie = 50;
	static int dosa = 43;
	static int oil_pouch = 39;
	static int panipuri = 43;
	static int masala = 73;
	
	void buyMaggie(int i) {
		maggie = maggie - i;
	}
	 void buyDosa(int i) {
		 dosa = dosa -i;
	 }
	 
	 void buyOilPouch(int i) {
		 oil_pouch = oil_pouch - i;
	 }
	 
	 void buyPanipuri(int i) {
		 panipuri = panipuri - i;
	 }
	 
	 void buyMasala(int i) {
		 masala = masala - i;
		 }
	 
	void outOfStock() {
		System.out.println();
		System.out.println("########################################################################");
		System.out.println("Items which are out of stock are:");
		
		if(maggie == 0) {
			System.out.println("maggie");
		}
		if(dosa == 0) {
				System.out.println("dosa");
			}
		if(oil_pouch == 0) {
			System.out.println("oil pouch");
		}
		if(panipuri == 0) {
			System.out.println("panipuri");
		}
		if(masala == 0) {
			System.out.println("masala");
		}
		else {
			System.out.println("all items are in stock");
		}
		
		System.out.println("########################################################################");
		System.out.println();
	}

	void availableStock() {
		System.out.println();
		System.out.println("########################################################################");
		System.out.println("Items which are in stock are:");
		
		if(maggie >= 1) {
			System.out.println("quantity of available maggie is :" + maggie);
		}
		if(dosa >= 1) {
				System.out.println("quantity of available dosa is :" + dosa);
			}
		if(oil_pouch>= 1) {
			System.out.println("quantity of available oil pouch is :" + oil_pouch);
		}
		if(panipuri >= 1) {
			System.out.println("quantity of available panipuri is :" + panipuri);
		}
		if(masala >= 1) {
			System.out.println("quantity of available masala is :" + masala);
		}
		System.out.println("########################################################################");
		System.out.println();
	}
	public static void main(String[] args) {
		Assignment_9 assignment_9 = new Assignment_9();
		assignment_9.availableStock();
		assignment_9.outOfStock();
		assignment_9.buyMaggie(13);
		assignment_9.buyMasala(73);
		assignment_9.buyOilPouch(3);
		System.out.println("**********After shopping status of stock**********");
		assignment_9.availableStock();
		assignment_9.outOfStock();
	}

}

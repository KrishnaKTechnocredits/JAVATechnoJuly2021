package priti;

public class Assingment_9 {
	int maggie;
	int dosa;
	int pouch;
	int panipuri;
	

	
	
	void setInitialQty(int mgQty, int dosaQty, int pouchQty, int paniQty) {
	
		maggie = mgQty;
		dosa = dosaQty;
		pouch = pouchQty;
		panipuri = paniQty;
	}
	
	void purchase1(int magQty) {
		if (magQty>maggie) {
			System.out.println("Maggie is running out of stock");
		}else {
			maggie = maggie- magQty;
		}
	}
	
	void purchase2(int dosaQty) {
		if (dosaQty>dosa) {
			System.out.println("Dosa is running out of stock");
		}else {
			dosa = dosa-dosaQty;
		}
		
	}
		
	void purchase3(int pouchQty){
		if (pouchQty>pouch) {
			System.out.println("Pouch is running out of stock");
		}else {
			pouch= pouch-pouchQty;
		}
	}
	
	void purchase4(int paniQty) {
		if (paniQty>panipuri) {
			System.out.println("Panipuri is running out of stock");
			
		}else {
			panipuri = panipuri-paniQty;
		}
	}
	
	
	void showOutOfStock() {
		if (maggie == 0) {
			System.out.println("Maggie is out of Stock");
		}
		
		if (dosa==0) {
			System.out.println("Dosa is out of Stock");
		}
		
		if (pouch==0) {
			System.out.println("pouch is out of Stock");
		}
		if (panipuri==0) {
			System.out.println("panipuri is out of Stock");
		}
	}
		
	void avaliableStock() {
		
		if (maggie != 0) {
			System.out.println("Maggie Stock is - "+ maggie);
		}
		if (dosa != 0) {
			System.out.println("Dosa Stock is - "+ maggie);
		}
		if (pouch != 0) {
			System.out.println("Pouch Stock is - "+ maggie);
		}
		if (panipuri != 0) {
			System.out.println("Panipuri Stock is - "+ maggie);
		}
		
	}
	
	public static void main(String[] a) {
		Assingment_9 assingment_9_1 = new Assingment_9();
		assingment_9_1.setInitialQty(60, 70, 75, 40);
		assingment_9_1.purchase1(50);
		assingment_9_1.purchase2(71);
		assingment_9_1.purchase3(60);
		assingment_9_1.purchase4(40);
		assingment_9_1.showOutOfStock();
		assingment_9_1.avaliableStock();
		
	}
	

}

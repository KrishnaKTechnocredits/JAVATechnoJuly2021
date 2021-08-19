package rushikesh.staticdemo;

	public class Assignment_9 {
	int maggieCount;
	int dosaCount;
	int pouchesCount;
	int panipuriCount;
	int masalaCount;

	void initializeCountOfItems(int initMaggieCount,int initDosaCount,int initPouches,
			int initPanipuri,int initMasala) {
		maggieCount=initMaggieCount;
		dosaCount=initDosaCount;
		pouchesCount=initPouches;
		panipuriCount=initPanipuri;
		masalaCount=initMasala;
	}
	
	void purchaseItems(int buyMaggieCount,int buyDosaCount,int buyPouchesCount,
			int buyPanipuriCount,int buyMasalaCount) {
		if(buyMaggieCount<=maggieCount) {
			maggieCount=maggieCount-buyMaggieCount;
		}else {
		System.out.println("Can't Purchase, Maggie Running out of stock");	
		}
		if(buyDosaCount<=dosaCount) {
			dosaCount=dosaCount-buyDosaCount;	
		}else {
			System.out.println("Can't Purchase, Dosa Running out of stock");
		}	
		
		if(buyPouchesCount<=pouchesCount) {
			pouchesCount=pouchesCount-buyPouchesCount;	
		}else {
			System.out.println("Can't Purchase, Pouches Running out of stock");
		}
		
		if(buyPanipuriCount<=panipuriCount) {
			panipuriCount=panipuriCount-buyPanipuriCount;	
		}else {
			System.out.println("Can't Purchase, Panipuri Running out of stock");
		}
		
		if(buyMasalaCount<=masalaCount) {
			masalaCount=masalaCount-buyMasalaCount;	
		}else {
			System.out.println("Can't Purchase, Masala Running out of stock");
		}
		System.out.println("===========================================");
	}
	
	void outOfStockItems() {
		if(maggieCount<=0)
			System.out.println("Maggie is out of stock");
		if(dosaCount<=0) 
			System.out.println("Dosa is out of stock");
		if(pouchesCount<=0) 
			System.out.println("Pouches is out of stock");	
		if(panipuriCount<=0) 	
			System.out.println("Panipuri is out of stock");
		if(masalaCount<=0)
			System.out.println("Masala is out of stock");	
		System.out.println("===========================================");
	}
	
	void availableItems() {
		if(maggieCount>0) {
			System.out.println("Maggie is available in stock");
			System.out.println(+maggieCount);
		}	
		if(dosaCount>0){ 
			System.out.println("Dosa is available in stock");
			System.out.println(+dosaCount);
		}
		if(pouchesCount>0) { 
			System.out.println("Pouches is available in stock");
			System.out.println(+pouchesCount);
		}
		if(panipuriCount>0) { 	
			System.out.println("Panipuri is available in stock");
			System.out.println(+panipuriCount);
		}
		if(masalaCount>0) {
			System.out.println("Masala is available in stock");
			System.out.println(+masalaCount);
		}
		System.out.println("===========================================");
	}
	
	public static void main(String[] args) {
		Assignment_9 assignment_9=new Assignment_9();
		assignment_9.initializeCountOfItems(50,43,39,43,73);
		assignment_9.purchaseItems(40, 42, 35, 40, 73);
		assignment_9.outOfStockItems();
		assignment_9.availableItems();
	}
}	
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

